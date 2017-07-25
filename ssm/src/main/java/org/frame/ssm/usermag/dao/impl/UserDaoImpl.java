package org.frame.ssm.usermag.dao.impl;

import javax.annotation.Resource;

import org.frame.ssm.beans.UserBean;
import org.frame.ssm.usermag.dao.IUserDao;
import org.frame.ssm.usermag.mapper.UserMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements IUserDao {

	@Resource
	private UserMapper um;
	
	
	public int saveUserBean(UserBean user) {
		// TODO Auto-generated method stub
		return um.saveUserBean(user);
	}


	public int updateUserBean(UserBean user, Long id) {
		// TODO Auto-generated method stub
		return um.updateUserBean(user, id);
	}


	public UserBean getUserBeanByUserName(String userName) {
		// TODO Auto-generated method stub
		return um.getUserBeanByUserName(userName);
	}


	public int deleteUserBean(Long id) {
		// TODO Auto-generated method stub
		return um.deleteUserBean(id);
	}

}
