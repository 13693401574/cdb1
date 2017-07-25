package cbd1_landlayComplainTest;

import javax.annotation.Resource;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myitems.cdb1.beans.ComplainBean;
import org.myitems.cdb1.beans.DealBean;
import org.myitems.cdb1.beans.LandladyComplainBean;
import org.myitems.cdb1.usermag.service.ILandlayComplainService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class LandlayComplainTest {
	
	@Resource
	private ILandlayComplainService landlayComplainServiceImpl;

	@Ignore
	public void LandladyComplainSericebyId(){
		LandladyComplainBean  com=landlayComplainServiceImpl.getLandlayCompliainInfo(1l);

		/*		System.out.println(com.getComplainant());
		System.out.println(com.getId());
		System.out.println(com.getDealBean().getStatus());
		System.out.println(com.getDealBean().getId());
		System.out.println(com.getDealBean().getLandlady().getAddress());
		System.out.println(com.getDealBean().getRobTenants().getEmail());
		System.out.println(com.getDealBean().getCarportIssue().getPrice());*/
	};

	@Ignore
	public void updateLandlayCompliainTest(){
		landlayComplainServiceImpl.RobTenanStatus("受理", 1l);
	}

	
	@Test
	public void getinfo(){
	ComplainBean com=landlayComplainServiceImpl.getDealInfo(1l);
	System.out.println(com.getEndTime());
	System.out.println(com.getBidCard());
	System.out.println(com.getCarportAddress());
	}
}
