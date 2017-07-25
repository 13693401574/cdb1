package org.myitems.cdb1.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.websocket.Session;

import org.myitems.cdb1.beans.BackStatus;
import org.myitems.cdb1.beans.CarportApplicationBean;
import org.myitems.cdb1.landladymag.service.ICarportApplicationService;
import org.myitems.cdb1.usermag.service.ILandlayService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
@RequestMapping("/carportApplication")
@Controller
public class CarportApplicationeController {

	@Resource
	private ILandlayService landlayServiceImpl;
	
	@RequestMapping(value="/init",method=RequestMethod.POST,produces={"application/json;charset=UTF-8"})		

	public @ResponseBody List<?> findAll(@RequestBody Map map){
		
		List<?> list= landlayServiceImpl.findAll(map);
		return list;
	}
	
	@RequestMapping(value="/selectcar",method=RequestMethod.POST)		
	@ResponseBody
	public CarportApplicationBean selectcar(HttpServletRequest request){
			
		
			String id =request.getParameter("id");
			//将string类型转换long
			Long Id=Long.parseLong(id);
			System.out.println(Id);
			//查找出包租申请车位的详细信息
			CarportApplicationBean car= landlayServiceImpl.selectLandlayCarportInfo(Id);
			request.setAttribute("car", car);
			return car;
	}
	
	@RequestMapping(value="/pass",method=RequestMethod.POST)		
	@ResponseBody
	public BackStatus pass(HttpServletRequest request){
			String status=request.getParameter("status");
			String id =request.getParameter("id");
			//将string类型转换long
			Long Id=Long.parseLong(id);	
			//改变申请的状态
			landlayServiceImpl.updateCarportApplicationBeanStatus(status,Id);	
			return new BackStatus(true,"修改成功");
	}
	
	
}
