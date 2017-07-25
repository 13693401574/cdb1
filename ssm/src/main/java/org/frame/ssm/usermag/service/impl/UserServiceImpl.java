package org.frame.ssm.usermag.service.impl;

import javax.annotation.Resource;

import org.frame.ssm.beans.UserBean;
import org.frame.ssm.usermag.dao.IUserDao;
import org.frame.ssm.usermag.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

	@Resource
	private IUserDao userDaoImpl;
	
	public int saveUserBean(UserBean user) {
		// TODO Auto-generated method stub
		return userDaoImpl.saveUserBean(user);
	}

	public int updateUserBean(UserBean user, Long id) {
		// TODO Auto-generated method stub
		return userDaoImpl.updateUserBean(user, id);
	}

	public UserBean getUserBeanByUserName(String userName) {
		// TODO Auto-generated method stub
		return userDaoImpl.getUserBeanByUserName(userName);
	}

	public int deleteUserBean(Long id) {
		// TODO Auto-generated method stub
		return userDaoImpl.deleteUserBean(id);
	}

}
