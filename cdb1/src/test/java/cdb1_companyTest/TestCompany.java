package cdb1_companyTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;


import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myitems.cdb1.beans.CompanyUserBean;
import org.myitems.cdb1.usermag.service.ICompanyService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class TestCompany {
	@Resource
	private ICompanyService companyServiceImpl;
	
	@Ignore
	public void addCompanyTest(){
		CompanyUserBean company=new CompanyUserBean();
		company.setLoginName("张三");
		company.setPwd("123");
		company.setCompanyName("fdfdf");
		company.setFloor("三");
		company.setLinkMan("联系人");
		company.setLinkPhone("12748577");
		
		Long rows=companyServiceImpl.addCompanyUser(company);
		System.out.println(rows);
	}
	@Ignore
	public void deleteCompanyTest(){
		CompanyUserBean companyUser =companyServiceImpl.selectCompanyUser(1l);
			System.out.println(companyUser);
		companyServiceImpl.deleteCompanyUser(companyUser);
	}
	@Test
	public void findCompanTest(){
		Map map=new HashMap();
		map.put("floor","三");
		map.put("linkMan", "联");
		//List<CompanyUserBean> com=companyServiceImpl.findCompanyUser(map);
		int c=companyServiceImpl.findCount();
		System.out.println(c);
		/*for (CompanyUserBean companyUserBean : com) {
			System.out.println(companyUserBean.getLinkMan());
		}*/
	}
}
