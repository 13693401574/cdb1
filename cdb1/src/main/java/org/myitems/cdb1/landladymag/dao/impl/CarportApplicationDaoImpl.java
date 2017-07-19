package org.myitems.cdb1.landladymag.dao.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.myitems.cdb1.beans.CarportApplicationBean;
import org.myitems.cdb1.landladymag.dao.ICarportApplicationDao;
import org.springframework.stereotype.Repository;

@Repository
public class CarportApplicationDaoImpl implements ICarportApplicationDao{

	@Resource
	private SessionFactory sf;
	
	
	
	public void saveCarportApplication(CarportApplicationBean carportApplication) {
		// TODO Auto-generated method stub
		sf.openSession().save(carportApplication);
	}

	public CarportApplicationBean getCarportApplicationById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteCarportApplicationById(CarportApplicationBean c) {
		// TODO Auto-generated method stub
		sf.getCurrentSession().delete(CarportApplicationBean.class);
	}

	public int getCountCarportApplicationByItems(Map map) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<CarportApplicationBean> getCarportApplicationListByItems(Map map) {
		// TODO Auto-generated method stub
		return null;
	}

}
