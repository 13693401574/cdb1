package org.frame.ssm.usermag.service;

import org.frame.ssm.beans.UserBean;

public interface IUserService {

	public int saveUserBean(UserBean user);
	
	public int updateUserBean(UserBean user,Long id);
	
	public UserBean getUserBeanByUserName(String userName);
	
	public int deleteUserBean(Long id);
}
