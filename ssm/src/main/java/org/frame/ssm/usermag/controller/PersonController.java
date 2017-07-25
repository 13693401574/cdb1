package org.frame.ssm.usermag.controller;

import javax.annotation.Resource;

import org.frame.ssm.beans.Messager;
import org.frame.ssm.beans.UserBean;
import org.frame.ssm.usermag.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/persons")
public class PersonController {
	
	@Resource
	private IUserService userServiceImpl;
	
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	public String updateUserBean(UserBean user,@PathVariable("id")Long id){
		try {
			userServiceImpl.updateUserBean(user, id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "index";
	}
	
	/*@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public String deleteUserBean(@PathVariable("id")Long id){
		try {
			userServiceImpl.deleteUserBean(id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "index";
	}*/
	
}
