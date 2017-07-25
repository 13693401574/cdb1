package org.myitems.cdb1.landladymag.controller;




import java.io.File;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import javax.servlet.http.HttpSession;


import org.myitems.cdb1.beans.CarportApplicationBean;
import org.myitems.cdb1.beans.CarportIssueBean;
import org.myitems.cdb1.beans.DealBean;
import org.myitems.cdb1.beans.LandladyBean;
import org.myitems.cdb1.beans.LandladyComplainBean;
import org.myitems.cdb1.beans.Messager;
import org.myitems.cdb1.beans.Pager;
import org.myitems.cdb1.beans.PredetermineCarportBean;
import org.myitems.cdb1.beans.PublicMap;

import org.myitems.cdb1.landladymag.service.ICarportApplicationService;
import org.myitems.cdb1.landladymag.service.ICarportIssueService;
import org.myitems.cdb1.landladymag.service.IDealService;
import org.myitems.cdb1.landladymag.service.ILandladyComplainService;
import org.myitems.cdb1.landladymag.service.ILandladyService;
import org.myitems.cdb1.landladymag.service.IPredetermineCarportService;
import org.myitems.cdb1.robTenantsmag.service.IRobTenantsService;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.commons.CommonsMultipartFile;


@RequestMapping("/landladys")
@Controller
public class LandladyController {

	@Resource
	private ICarportIssueService carportIssueServiceImpl;
	@Resource
	private ICarportApplicationService carportApplicationServiceImpl;
	@Resource
	private ILandladyService landladyServiceImpl;
	@Resource
	private IPredetermineCarportService predetermineCarportServiceImpl;
	@Resource
	private IDealService dealServiceImpl;
	@Resource
	private IRobTenantsService robTenantsServiceImpl;
	@Resource
	private ILandladyComplainService landladyComplainServiceImpl;
	
	/**
	 * 模拟登陆
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/login/{id}",method=RequestMethod.GET,produces="application/json;charset=utf-8")
	public @ResponseBody Messager likeLogin(@PathVariable("id") Long id){
		HttpSession session=((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest().getSession();
		Messager msg=new Messager(true,"登陆成功");
		
		LandladyBean landlady=landladyServiceImpl.getLandladyById(id);
		if(landlady!=null){
			session.setAttribute("landlady", landlady);
		}else{
			msg=new Messager(false,"登陆失败");
		}
		
		
		return msg;
	}
	
	@RequestMapping(value="/id",method=RequestMethod.POST,produces="application/json;charset=utf-8")
	public @ResponseBody List<CarportIssueBean> getCarportIssue(@RequestBody PublicMap publicMap){
		Pager p=new Pager();
		p.setPage(Integer.parseInt(publicMap.getPage()));
		p.setRows(Integer.parseInt(publicMap.getRows()));
		carportIssueServiceImpl.getCarportIssueListByItems(publicMap.getMap(), p);
		List<CarportIssueBean> list=(List<CarportIssueBean>) p.getDatas();
		return list;
	}
	
	@RequestMapping(value="/{fkLandladyId}",method=RequestMethod.POST)
	public String addCarportApplication(@RequestParam("fileName")CommonsMultipartFile file,CarportApplicationBean c,@PathVariable("fkLandladyId") String fkLandladyId){
		
		String fileName = file.getOriginalFilename();//得到文件原始名称
//		System.out.println(fileName);
		String path = "D://files";
		
		try {
			File dir = new File(path);
			if(!dir.exists()|| !dir.isDirectory()){//判断dir是否是一个文件夹
				dir.mkdir();
			}
			
			path = path + File.separator + fileName;//真实文件名称
			file.getFileItem().write(new File(path));//将临时文件输出到真实文件中
		} catch (Exception e) {
			// TODO: handle exception
		}
		LandladyBean l=landladyServiceImpl.getLandladyById(Long
				.parseLong(fkLandladyId));
		c.setLandlady(l);
		c.setEquityCopies(path);
		carportApplicationServiceImpl.saveCarportApplication(c);
		return "static/jsp/baozupo/LandladyMain";
	}
	@RequestMapping(value="/carportApplicationIsexist/{carportEquityCode}",method=RequestMethod.GET,produces="application/json;charset=utf-8")
	public @ResponseBody StringBuilder CarportApplicationIsexist(@PathVariable("carportEquityCode") String carportEquityCode){
		Pager p=new Pager();
		p.setPage(1);
		p.setRows(1);
		
		Map map=new HashMap();
		map.put("carportEquityCode", carportEquityCode);
		carportApplicationServiceImpl.getCarportApplicationListByItems(map, p);
		List<CarportApplicationBean> list=(List<CarportApplicationBean>) p.getDatas();
		StringBuilder s=new StringBuilder();
		if(list!=null&&list.size()!=0){
			s.append("1");
			return s;
		}else{
			s.append("0");
			return s;
		}
		
	}
	
	@RequestMapping(value="/{fkLandladyId}",method=RequestMethod.GET,produces="application/json;charset=utf-8")
	public @ResponseBody List<String> getCarportAddress(@PathVariable("fkLandladyId") Long fkLandladyId){
		
		List<String> list=carportApplicationServiceImpl.getCarportAddressNameByFkLandladyId(fkLandladyId);
		return list;
	}
	
	@RequestMapping(value="/showCarportAddress",method=RequestMethod.POST,produces="application/json;charset=utf-8")
	public @ResponseBody List<CarportApplicationBean> getCarportApplication(@RequestBody PublicMap publicMap){
		
		Pager p=new Pager();
		p.setPage(Integer.parseInt(publicMap.getPage()));
		p.setRows(Integer.parseInt(publicMap.getRows()));
		Map map=publicMap.getMap();
		map.put("status", "审核通过");
		
		carportApplicationServiceImpl.getCarportApplicationListByItems(map, p);
		
		List<CarportApplicationBean> list=(List<CarportApplicationBean>) p.getDatas();
		return list;
	}
	@RequestMapping(value="/fkCarportApplicationId/{fkCarportApplicationId}",method=RequestMethod.POST)
	public String saveCarportIssueBean(CarportIssueBean cib,@PathVariable("fkCarportApplicationId") Long fkCarportApplicationId){
		CarportApplicationBean c=carportApplicationServiceImpl.getCarportApplicationById(fkCarportApplicationId);
		LandladyBean l=c.getLandlady();
		cib.setAppBean(c);
		cib.setLandlady(l);
		carportIssueServiceImpl.saveCarportIssue(cib);
		return "static/jsp/baozupo/LandladyMain";
	}
	/**
	 * 包租婆查看预约信息
	 * @return
	 */
	@RequestMapping(value="/findReservation",method=RequestMethod.POST,produces="application/json;charset=utf-8")
	public @ResponseBody List<PredetermineCarportBean> showPredetermineCarport(@RequestBody PublicMap publicMap){
		
		Pager p=new Pager();
		p.setPage(Integer.parseInt(publicMap.getPage()));
		p.setRows(Integer.parseInt(publicMap.getRows()));
		Map map=publicMap.getMap();
		predetermineCarportServiceImpl.getPredetermineCarportListByItems(map, p);
		List<PredetermineCarportBean> list=(List<PredetermineCarportBean>) p.getDatas();
		
		return list;
	}
	@RequestMapping(value="/fkCarportApplicationId/{id}",method=RequestMethod.PUT,produces="application/json;charset=utf-8")
	public @ResponseBody StringBuilder checkPredetermineCarportById(@RequestBody PublicMap publicMap,@PathVariable Long id){
		Long fkCorportIssueId=Long.parseLong(publicMap.getFkCorportIssueId());
		predetermineCarportServiceImpl.updatePredetermineCarportById(id, fkCorportIssueId);
		
		StringBuilder s=new StringBuilder();
		s.append("static/jsp/baozupo/LandladyMain"); 
		return s;
	}
	
	@RequestMapping(value="/deal/{fkLandladyId}",method=RequestMethod.POST,produces="application/json;charset=utf-8")
	public @ResponseBody List<DealBean> getDeal(@RequestBody PublicMap publicMap,@PathVariable("fkLandladyId") String fkLandladyId){
		
		if("".equals(publicMap.getRobStatus())){
			publicMap.setRobStatus(null);
		}
		Pager p=new Pager();
		p.setPage(Integer.parseInt(publicMap.getPage()));
		p.setRows(Integer.parseInt(publicMap.getRows()));
		Map map=publicMap.getMap();
		dealServiceImpl.getDealListByItems(map, p);
		List<DealBean> list=(List<DealBean>) p.getDatas();
		return list;
	}
	
	@RequestMapping(value="/saveLandladyComplain/{id}",method=RequestMethod.POST,produces="application/json;charset=utf-8")
	public @ResponseBody Messager saveLandladyComplain(@RequestBody LandladyComplainBean lcb,@PathVariable("id") Long dealId){
		Messager msg=new Messager(true,"投诉成功");
		
		Date nowDate = null;
		try {
			Date now = new Date(); 
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//可以方便地修改日期格式
			String nowTime = dateFormat.format(now); 
			nowDate = dateFormat.parse(nowTime);
			DealBean deal=dealServiceImpl.getDealById(dealId);
			deal.setRobStatus("1");
			lcb.setBeComplaint(deal.getRobTenants().getUserName());
			lcb.setComplainant(deal.getLandlady().getUserName());
			lcb.setDealBean(deal);
			lcb.setLandlady(deal.getLandlady());
			lcb.setComplainantDate(nowDate);
			landladyComplainServiceImpl.saveLandladyComplain(lcb);
		} catch (Exception e) {
			msg=new Messager(false,"投诉失败");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return msg;
	}
	
	@RequestMapping(value="/decidePassword",method=RequestMethod.POST,produces="application/json;charset=utf-8")
	public @ResponseBody Messager decidePasswordIsTrue(@RequestBody LandladyBean land){
		Messager msg;
		LandladyBean landlady=landladyServiceImpl.getLandladyById(land.getId());
		if(landlady.getPwd().equals(land.getPwd())){
			msg=new Messager(true,"1");
		}else{
			msg=new Messager(false,"0");
		}
		
		
		return msg;
	}
	@RequestMapping(value="/updateLandlady",method=RequestMethod.PUT,produces="application/json;charset=utf-8")
	public @ResponseBody Messager updateLandlady(@RequestBody LandladyBean lady){
		Messager msg=new Messager(true,"修改成功");
		Long id=lady.getId();
		System.out.println(id);
		try {
			landladyServiceImpl.updateLandlady(lady);
			LandladyBean bean=landladyServiceImpl.getLandladyById(id);
			HttpSession session=((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest().getSession();
			
			session.setAttribute("landlady", bean);
		}catch (Exception e) {
			
			msg=new Messager(false,"修改失败");
			e.printStackTrace();
		}
		
		return msg;
	}
}
