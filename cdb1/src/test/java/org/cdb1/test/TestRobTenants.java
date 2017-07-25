package org.cdb1.test;

import javax.annotation.Resource;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myitems.cdb1.beans.RobTenantsBean;
import org.myitems.cdb1.robTenantsmag.service.IRobTenantsService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class TestRobTenants {

	@Resource
	private IRobTenantsService robTenantsServiceImpl;
	
	@Ignore
	public void testSaveRobTenant(){
		RobTenantsBean r=new RobTenantsBean();
		r.setUserName("zh");
		r.setRealName("周华");
		r.setPwd("123456");
		r.setPhone("12345678901");
		r.setJobDescribe("自由职业者");
		r.setIdCard("511681198912030033");
		r.setEmail("1261301957@qq.com");
		r.setAddress("红瓦寺");
		robTenantsServiceImpl.saveRobTenants(r);
	}
	@Ignore
	public void testGetRobTenantById(){
		RobTenantsBean r=robTenantsServiceImpl.getRobTenantsById(2l);
		System.out.println(r);
	}
	@Test
	public void testUpdateRobTenants(){
		RobTenantsBean r=robTenantsServiceImpl.getRobTenantsById(3l);
		r.setAddress("共和村");
		r.setPwd("236978");
		r.setPhone("13550992634");
		robTenantsServiceImpl.updateRobTenants(r);
	}
}
