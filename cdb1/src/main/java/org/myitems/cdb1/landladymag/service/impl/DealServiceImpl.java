package org.myitems.cdb1.landladymag.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.myitems.cdb1.beans.DealBean;
import org.myitems.cdb1.beans.Pager;
import org.myitems.cdb1.landladymag.dao.IDealDao;
import org.myitems.cdb1.landladymag.service.IDealService;
import org.springframework.stereotype.Service;

@Service
public class DealServiceImpl implements IDealService {

	@Resource
	private IDealDao dealDaoImpl;
	
	
	public void saveDeal(DealBean deal) {
		// TODO Auto-generated method stub
		dealDaoImpl.saveDeal(deal);
	}

	public Pager getDealListByItems(Map map, Pager page) {
		// TODO Auto-generated method stub
		int tolRows=dealDaoImpl.getCountDealListByItems(map);
		List<DealBean> datas=dealDaoImpl.getDealListByItems(map);
		
		page.setTotalRows(tolRows);
		page.setDatas(datas);
		return page;
	}

	@Override
	public DealBean getDealById(Long id) {
		// TODO Auto-generated method stub
		return dealDaoImpl.getDealById(id);
	}

	@Override
	public void updateDealBean(DealBean deal) {
		// TODO Auto-generated method stub
		dealDaoImpl.updateDealBean(deal);
	}

}
