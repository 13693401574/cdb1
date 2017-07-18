package org.myitems.cdb1.landladymag.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.myitems.cdb1.beans.CarportApplicationBean;
import org.myitems.cdb1.beans.Pager;
import org.myitems.cdb1.landladymag.dao.ICarportApplicationDao;
import org.myitems.cdb1.landladymag.service.ICarportApplicationService;
import org.springframework.stereotype.Service;
/**
 * 包租婆车位信息申请业务层实现类
 * @author Administrator
 *
 */
@Service
public class CarportApplicationServiceImpl implements ICarportApplicationService {

	@Resource
	private ICarportApplicationDao carportApplicationDaoImpl;
	
	public void saveCarportApplication(CarportApplicationBean carportApplication) {
		// TODO Auto-generated method stub
		carportApplicationDaoImpl.saveCarportApplication(carportApplication);
	}

	public int getCarportApplicationById(Long id) {
		// TODO Auto-generated method stub
		return carportApplicationDaoImpl.getCarportApplicationById(id);
	}

	public void deleteCarportApplicationById(Long id) {
		// TODO Auto-generated method stub
		carportApplicationDaoImpl.deleteCarportApplicationById(id);
	}

	public Pager getCarportApplicationListByItems(Map map, Pager page) {
		
		// TODO Auto-generated method stub
		
		int tolRows=carportApplicationDaoImpl.getCountCarportApplicationByItems(map);
		List<CarportApplicationBean> carportApplicationList=carportApplicationDaoImpl.getCarportApplicationListByItems(map);
		
		page.setTotalRows(tolRows);
		page.setDatas(carportApplicationList);
		return page;
	}

}
