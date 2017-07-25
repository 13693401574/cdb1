package org.frame.ssm.usermag.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.frame.ssm.beans.Messager;
import org.frame.ssm.beans.UserBean;
import org.frame.ssm.usermag.service.IUserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/users")
@RestController
public class UserController {

	//表示我需要对本类进行日志记录
	private Logger log = Logger.getLogger(this.getClass());
	
	@Resource
	private IUserService userServiceImpl;
	
	@RequestMapping(value="/{id}",method=RequestMethod.POST,produces="application/json;charset=utf-8")
	public Messager saveUserBean(@RequestBody UserBean user){
		log.info(user);
		
		Messager msg = new Messager(true, "操作成功");
		try {
			userServiceImpl.saveUserBean(user);
			
			System.out.println(System.getProperty("ssm.root"));
			
		} catch (Exception e) {
			// TODO: handle exception
			log.error("UserController-------saveUserBean()", e);
			msg.setState(false);
			msg.setMsg("操作成功");
		}
		
		log.info(msg);
		return msg;
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.PUT,produces="application/json;charset=utf-8")
	public Messager updateUserBean(@RequestBody UserBean user,@PathVariable("id")Long id){
		Messager msg = new Messager(true, "操作成功");
		try {
			userServiceImpl.updateUserBean(user, id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			msg.setState(false);
			msg.setMsg("操作失败");
		}
		return msg;
	}
	
	@RequestMapping(value="/{userName}",method=RequestMethod.GET,produces="application/json;charset=utf-8")
	public UserBean queryUserBeanByUserName(@PathVariable("userName") String userName){
		UserBean user = null;
		try {
			userName = new String(userName.getBytes("ISO8859-1"),"UTF-8");
			user = userServiceImpl.getUserBeanByUserName(userName);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return user;
	}
	
	
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE,produces="application/json;charset=utf-8")
	public Messager deleteUserBean(@PathVariable("id")Long id){
		Messager msg = new Messager(true, "操作成功");
		try {
			userServiceImpl.deleteUserBean(id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			msg.setState(false);
			msg.setMsg("操作失败");
		}
		return msg;
	}
	
	
	
	
	
	
}
