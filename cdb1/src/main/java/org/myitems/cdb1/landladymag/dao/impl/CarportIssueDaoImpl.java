package org.myitems.cdb1.landladymag.dao.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.myitems.cdb1.beans.CarportIssueBean;

import org.myitems.cdb1.landladymag.dao.ICarportIssueDao;
import org.myitems.cdb1.landladymag.mapper.CarportIssueMapper;
import org.springframework.stereotype.Repository;
@Repository
public class CarportIssueDaoImpl implements ICarportIssueDao {

	@Resource
	private SessionFactory sf;
	@Resource
	private CarportIssueMapper cim;
	public void saveCarportIssue(CarportIssueBean carportIssue) {
		// TODO Auto-generated method stub
		sf.getCurrentSession().save(carportIssue);
		
	}

	public CarportIssueBean getCarportIssueById(Long id) {
		// TODO Auto-generated method stub
		return cim.getCarportIssueById(id);
	}

	public void deleteCarportIssueById(CarportIssueBean c) {
		// TODO Auto-generated method stub
		sf.getCurrentSession().delete(c);
	}

	public int getCountCarportIssueListByItems(Map map) {
		// TODO Auto-generated method stub
		return cim.getCountCarportIssueListByItems(map);
	}

	public List<CarportIssueBean> getCarportIssueListByItems(Map map) {
		// TODO Auto-generated method stub
		return cim.getCarportIssueListByItems(map);
	}

	

}
