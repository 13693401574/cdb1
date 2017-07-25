package org.myitems.cdb1.robTenantsmag.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.aspectj.bridge.Message;
import org.myitems.cdb1.beans.CarportIssueBean;
import org.myitems.cdb1.beans.DealBean;
import org.myitems.cdb1.beans.LandladyBean;
import org.myitems.cdb1.beans.LandladyComplainBean;
import org.myitems.cdb1.beans.Messager;
import org.myitems.cdb1.beans.Pager;
import org.myitems.cdb1.beans.PredetermineCarportBean;
import org.myitems.cdb1.beans.PublicMap;
import org.myitems.cdb1.beans.RobTenantsBean;
import org.myitems.cdb1.beans.RobTenantsComplainBean;
import org.myitems.cdb1.landladymag.service.ICarportIssueService;
import org.myitems.cdb1.landladymag.service.IDealService;
import org.myitems.cdb1.landladymag.service.IPredetermineCarportService;
import org.myitems.cdb1.robTenantsmag.service.IRobTenantsService;
import org.myitems.cdb1.robTenantsmag.service.IRobtenantsComplainService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@RequestMapping("/robTenants")
@Controller
public class RobTenantsController {

	@Resource
	private IRobTenantsService robTenantsServiceImpl;
	
	@Resource
	private ICarportIssueService carportIssueServiceImpl;
	@Resource
	private IPredetermineCarportService predetermineCarportServiceImpl;
	@Resource
	private IDealService dealServiceImpl;
	@Resource
	private IRobtenantsComplainService robtenantsComplainServiceImpl;
	
	/**
	 * 模拟登陆
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/login/{id}",method=RequestMethod.GET,produces="application/json;charset=utf-8")
	public @ResponseBody Messager likeLogin(@PathVariable("id") Long id){
		HttpSession session=((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest().getSession();
		Messager msg=new Messager(true,"登陆成功");
		
		RobTenantsBean rob=robTenantsServiceImpl.getRobTenantsById(id);
	
		if(rob!=null){
			session.setAttribute("rob", rob);
		}else{
			msg=new Messager(false,"登陆失败");
		}
		
		
		return msg;
	}
	
	
	/**
	 * 查询所有未出租的车位
	 * @param publicMap
	 * @return
	 */
	@RequestMapping(value="/showAllCarportIssue",method=RequestMethod.POST,produces="application/json;charset=utf-8")
	public @ResponseBody List<CarportIssueBean> getCarportIssueByStatus(@RequestBody PublicMap publicMap){
		Pager p=new Pager();
		p.setPage(1);
		p.setRows(1);
		
		Map map=publicMap.getMap();
		map.put("status", "未出租");
		carportIssueServiceImpl.getCarportIssueListByItems(map, p);
		List<CarportIssueBean> list=(List<CarportIssueBean>) p.getDatas();
		return list;
	}
	
	/**
	 * 添加预约信息
	 * @param pm
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/savePredetermineCarport/{id}",method=RequestMethod.POST,produces="application/json;charset=utf-8")
	public @ResponseBody Messager savePredetermineCarportBean(@RequestBody PublicMap pm,@PathVariable("id") Long id){
		Messager msg=null;
		
		
		Pager p1=new Pager();
		p1.setPage(1);
		p1.setRows(1);
		Map map=pm.getMap();
		map.put("fkCorportIssueId", id);
		System.out.println(map);
		p1=predetermineCarportServiceImpl.getPredetermineCarportListByItems(map, p1);
		List<PredetermineCarportBean> list=(List<PredetermineCarportBean>) p1.getDatas();
		
		if(list.size()==0){
			CarportIssueBean c=carportIssueServiceImpl.getCarportIssueById(id);
			LandladyBean land=c.getLandlady();
			Long robId=Long.parseLong(pm.getFkRobtenantId());
			String message=pm.getMessage();
			RobTenantsBean rob=robTenantsServiceImpl.getRobTenantsById(robId);
			PredetermineCarportBean p=new PredetermineCarportBean();
			p.setCarBean(c);
			p.setLandlady(land);
			p.setRobBean(rob);
			p.setMessage(message);
			predetermineCarportServiceImpl.savePredetermineCarport(p);
			msg=new Messager(true,"预约成功");
		}else{
			msg=new Messager(false,"你已经预约了该车位");
		}
		return msg;
	}
	/**
	 * 查询当前登录人的历史记录
	 * @param publicMap
	 * @param fkRobtenantId
	 * @return
	 */
	@RequestMapping(value="/deal/{fkRobtenantId}",method=RequestMethod.POST,produces="application/json;charset=utf-8")
	public @ResponseBody List<DealBean> getDeal(@RequestBody PublicMap publicMap,@PathVariable("fkRobtenantId") String fkRobtenantId){
		if("".equals(publicMap.getStatus())){
			publicMap.setStatus(null);
		}
		Pager p=new Pager();
		p.setPage(Integer.parseInt(publicMap.getPage()));
		p.setRows(Integer.parseInt(publicMap.getRows()));
		Map map=publicMap.getMap();
		dealServiceImpl.getDealListByItems(map, p);
		List<DealBean> list=(List<DealBean>) p.getDatas();
		return list;
	}
	
	/**
	 * 添加抢租客投诉
	 * @param lcb
	 * @param dealId
	 * @return
	 */
	@RequestMapping(value="/saveRobComplain/{id}",method=RequestMethod.POST,produces="application/json;charset=utf-8")
	public @ResponseBody Messager saveRobTenantsComplain(@RequestBody RobTenantsComplainBean lcb,@PathVariable("id") Long dealId){
		Messager msg=new Messager(true,"投诉成功");
		
		Date nowDate = null;
		try {
			Date now = new Date(); 
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//可以方便地修改日期格式
			String nowTime = dateFormat.format(now); 
			nowDate = dateFormat.parse(nowTime);
			DealBean deal=dealServiceImpl.getDealById(dealId);
			deal.setStatus("1");
			lcb.setBeComplaint(deal.getRobTenants().getUserName());
			lcb.setComplainant(deal.getLandlady().getUserName());
			lcb.setDealBean(deal);
			lcb.setRobTenantsBean(deal.getRobTenants());
			lcb.setComplainantDate(nowDate);
			robtenantsComplainServiceImpl.saveRobTenantsComplain(lcb);
		} catch (Exception e) {
			msg=new Messager(false,"投诉失败");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return msg;
	}
	@RequestMapping(value="/decidePassword",method=RequestMethod.POST,produces="application/json;charset=utf-8")
	public @ResponseBody Messager decidePasswordIsTrue(@RequestBody RobTenantsBean robBean){
		Messager msg;
		RobTenantsBean rob=robTenantsServiceImpl.getRobTenantsById(robBean.getId());
		if(rob.getPwd().equals(robBean.getPwd())){
			msg=new Messager(true,"1");
		}else{
			msg=new Messager(false,"0");
		}
		
		
		return msg;
	}
	@RequestMapping(value="/updateLandlady",method=RequestMethod.PUT,produces="application/json;charset=utf-8")
	public @ResponseBody Messager updateRobtenants(@RequestBody RobTenantsBean rob){
		Messager msg=new Messager(true,"修改成功");
		Long id=rob.getId();
		
		try {
			robTenantsServiceImpl.updateRobTenants(rob);
			RobTenantsBean bean=robTenantsServiceImpl.getRobTenantsById(id);
			HttpSession session=((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest().getSession();
			
			session.setAttribute("rob", bean);
		}catch (Exception e) {
			
			msg=new Messager(false,"修改失败");
			e.printStackTrace();
		}
		
		return msg;
	}
}
