package org.myitems.cdb1.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.myitems.cdb1.beans.ComplainBean;
import org.myitems.cdb1.beans.RobTenantsComplainBean;
import org.myitems.cdb1.usermag.service.IRobTenantsComlaninService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/RobTeantsComplain")
@Controller
public class RobTeantsComplainController {
	@Resource
	private IRobTenantsComlaninService robTenantsComlaninServiceImpl;
	
	/**
	 * 初始化页面
	 * @return
	 */
	@RequestMapping(value="/findAll",method=RequestMethod.POST,produces={"application/json;charset=UTF-8"})
	@ResponseBody
	public List<RobTenantsComplainBean> findAll(){
		
	List<RobTenantsComplainBean> list=robTenantsComlaninServiceImpl.findAll();	
		
		return list;
		
	}
	/**
	 * 得到受理的数据
	 * @return
	 */
	@RequestMapping(value="/shijian",method=RequestMethod.POST,produces={"application/json;charset=UTF-8"})
	public @ResponseBody ComplainBean selectRob(HttpServletRequest request){
		String id=request.getParameter("id");
		//将sting 转变为long
		Long Id=Long.parseLong(id);		
		ComplainBean rob=robTenantsComlaninServiceImpl.getRobTenantsComplainInfo(Id);
		request.getSession().setAttribute("rob", rob);
		return rob;
		
	}
	/**
	 * 改变状态
	 * @param request
	 */
	@RequestMapping(value="/panduan",method=RequestMethod.POST,produces={"application/json;charset=UTF-8"})
	public void landlayStatus(HttpServletRequest request){
		String id=request.getParameter("id");
		String status=request.getParameter("status");
		//将sting 转变为long
		Long Id=Long.parseLong(id);		
		robTenantsComlaninServiceImpl.landlayStatus(status, Id);
	}

}
