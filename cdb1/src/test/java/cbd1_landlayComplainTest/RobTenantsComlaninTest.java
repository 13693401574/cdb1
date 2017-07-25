package cbd1_landlayComplainTest;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myitems.cdb1.beans.ComplainBean;
import org.myitems.cdb1.beans.RobTenantsComplainBean;
import org.myitems.cdb1.usermag.service.IRobTenantsComlaninService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class RobTenantsComlaninTest {
	
	@Resource
	private IRobTenantsComlaninService robTenantsComlaninServiceImpl;
	
	@Test
	public void TestRob(){
		ComplainBean com=robTenantsComlaninServiceImpl.getRobTenantsComplainInfo(2l);
		System.out.println(com);
		System.out.println(com.getBidCard());
		System.out.println(com.getTidCard());
	
	}
	@Ignore
	public void TestStatus(){
		robTenantsComlaninServiceImpl.landlayStatus("通过", 1l);
	}
	
	@Ignore
	public void testFindAll(){
		List<RobTenantsComplainBean> list=robTenantsComlaninServiceImpl.findAll();
		
		for(int i=0;i<list.size();i++){
		System.out.println(	list.get(i));
		System.out.println(list.get(i).getComplainant());

		}
		
	}
}