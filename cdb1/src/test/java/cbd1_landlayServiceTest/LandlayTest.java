package cbd1_landlayServiceTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myitems.cdb1.beans.CarportApplicationBean;
import org.myitems.cdb1.usermag.service.ICompanyService;
import org.myitems.cdb1.usermag.service.ILandlayService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class LandlayTest {
	@Resource
	private ILandlayService landlayServiceImpl;
	
	@Ignore
	public void getLandlayCarPortInfo(){
		
	CarportApplicationBean car=landlayServiceImpl.selectLandlayCarportInfo(1l);
		System.out.println(car);
		System.out.println(car.getLandlady());
	}

	@Ignore
	public void updateCarportApplicationBeanStatus(){
		landlayServiceImpl.updateCarportApplicationBeanStatus("驳回", 1l);
	
		
	}
	@Test
	public void findAllTest(){
		
		Map map = new HashMap();
		map.put("carportAddressCode", "23-3323-32");
		map.put("idCard", "3242342");
		List<?> list=landlayServiceImpl.findAll(map);
		System.out.println(list);
		for(int i=0;i<list.size();i++){
			CarportApplicationBean car= (CarportApplicationBean) list.get(i);
			System.out.println(car.getCarportAddress());
			System.out.println(car.getLandlady().getIdCard());
		}
	
		
	}
}
