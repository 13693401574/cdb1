package org.myitems.cdb1.landladymag.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.myitems.cdb1.beans.CarportIssueBean;
import org.myitems.cdb1.beans.Pager;
import org.myitems.cdb1.landladymag.dao.ICarportIssueDao;
import org.myitems.cdb1.landladymag.service.ICarportIssueService;
import org.springframework.stereotype.Service;

@Service
public class CarportIssueServiceImpl implements ICarportIssueService {

	@Resource
	private ICarportIssueDao carportIssueDaoImpl;
	
	public void saveCarportIssue(CarportIssueBean carportIssue) {
		// TODO Auto-generated method stub
		carportIssueDaoImpl.saveCarportIssue(carportIssue);
	}

	public CarportIssueBean getCarportIssueById(Long id) {
		// TODO Auto-generated method stub
		return carportIssueDaoImpl.getCarportIssueById(id);
	}

	public void deleteCarportIssueById(Long id) {
		// TODO Auto-generated method stub
		carportIssueDaoImpl.deleteCarportIssueById(id);
	}

	public Pager getCarportIssueListByItems(Map map, Pager page) {
		// TODO Auto-generated method stub
		int tolRows=carportIssueDaoImpl.getCountCarportIssueListByItems(map);
		List<CarportIssueBean> datas=carportIssueDaoImpl.getCarportIssueListByItems(map);
		page.setTotalRows(tolRows);
		page.setDatas(datas);
		
		return page;
	}

}
