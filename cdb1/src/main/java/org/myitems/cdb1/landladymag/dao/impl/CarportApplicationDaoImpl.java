package org.myitems.cdb1.landladymag.dao.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.myitems.cdb1.beans.CarportApplicationBean;
import org.myitems.cdb1.landladymag.dao.ICarportApplicationDao;
import org.myitems.cdb1.landladymag.mapper.CarportApplicationMapper;
import org.springframework.stereotype.Repository;

@Repository
public class CarportApplicationDaoImpl implements ICarportApplicationDao{

	@Resource
	private SessionFactory sf;
	
	@Resource
	private CarportApplicationMapper cam;
	
	public void saveCarportApplication(CarportApplicationBean carportApplication) {
		// TODO Auto-generated method stub
		sf.getCurrentSession().save(carportApplication);
	}

	public CarportApplicationBean getCarportApplicationById(Long id) {
		// TODO Auto-generated method stub
		return cam.getCarportApplicationById(id);
	}

	public void deleteCarportApplicationById(CarportApplicationBean c) {
		// TODO Auto-generated method stub
		sf.getCurrentSession().delete(c);;
	}

	public int getCountCarportApplicationByItems(Map map) {
		// TODO Auto-generated method stub
		return cam.getCountCarportApplicationByItems(map);
	}

	public List<CarportApplicationBean> getCarportApplicationListByItems(Map map) {
		// TODO Auto-generated method stub
		return cam.getCarportApplicationListByItems(map);
	}

	@Override
	public List<String> getCarportAddressNameByFkLandladyId(Long fkLandladyId) {
		// TODO Auto-generated method stub
		return cam.getCarportAddressNameByFkLandladyId(fkLandladyId);
	}

}
