package org.frame.ssm.usermag.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.frame.ssm.beans.UserBean;

public interface UserMapper {
	
	@Insert(value="insert into t_user (login_name,user_name,password) values (#{user.loginName},#{user.userName},#{user.password})")
	public int saveUserBean(@Param("user")UserBean user);
	
	
	@Update(value="update t_user set login_name = #{user.loginName},user_name = #{user.userName},password = #{user.password} where id = #{id}")
	public int updateUserBean(@Param("user")UserBean user, @Param("id")Long id);
	
	
	@ResultType(UserBean.class)
	@Select("select login_name as loginName,password as password from t_user where user_name = #{userName}")
	public UserBean getUserBeanByUserName(@Param("userName")String userName);
	
	@Delete("delete from t_user where id = #{id}")
	public int deleteUserBean(Long id); 
}
