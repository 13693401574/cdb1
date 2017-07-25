package org.frame.ssm.usermag.dao;

import org.frame.ssm.beans.UserBean;

public interface IUserDao {
	
	public int saveUserBean(UserBean user);
	
	public int updateUserBean(UserBean user,Long id);
	
	public UserBean getUserBeanByUserName(String userName);
	
	public int deleteUserBean(Long id);
}
