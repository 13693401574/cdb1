package org.myitems.cdb1.landladymag.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.myitems.cdb1.beans.Pager;
import org.myitems.cdb1.beans.PredetermineCarportBean;
import org.myitems.cdb1.landladymag.dao.IPredetermineCarportDao;
import org.myitems.cdb1.landladymag.service.IPredetermineCarportService;
import org.springframework.stereotype.Service;

@Service
public class PredetermineCarportServiceImpl implements IPredetermineCarportService {

	@Resource
	private IPredetermineCarportDao predetermineCarportDaoImpl;

	public int updatePredetermineCarportById(Long id,Long fkCorportIssueId) {
		// TODO Auto-generated method stub
		predetermineCarportDaoImpl.updatePredetermineCarportByFkCorportIssueId(fkCorportIssueId);
		return predetermineCarportDaoImpl.updatePredetermineCarportById(id);
	}

	public Pager getPredetermineCarportListByItems(Map map, Pager page) {
		// TODO Auto-generated method stub
		
		int tolRows=predetermineCarportDaoImpl.getCountPredetermineCarportListByItems(map);
		List<PredetermineCarportBean> datas=predetermineCarportDaoImpl.getPredetermineCarportListByItems(map);
		
		page.setTotalRows(tolRows);
		page.setDatas(datas);
		return page;
	}

	@Override
	public void savePredetermineCarport(PredetermineCarportBean predetermineCarport) {
		// TODO Auto-generated method stub
		predetermineCarportDaoImpl.savePredetermineCarport(predetermineCarport);
	}
	

}
