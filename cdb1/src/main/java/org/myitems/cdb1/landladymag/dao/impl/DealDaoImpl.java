package org.myitems.cdb1.landladymag.dao.impl;

import java.util.List;

import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.myitems.cdb1.beans.DealBean;
import org.myitems.cdb1.landladymag.dao.IDealDao;
import org.myitems.cdb1.landladymag.mapper.DealMapper;
import org.springframework.stereotype.Repository;
/**
 * 包租婆历史记录持久层实现类
 * @author Administrator
 *
 */
@Repository
public class DealDaoImpl implements IDealDao {

	@Resource
	private SessionFactory sf;
	
	@Resource
	private DealMapper dm;
	public void saveDeal(DealBean deal) {
		// TODO Auto-generated method stub
		sf.getCurrentSession().save(deal);
	}

	public int getCountDealListByItems(Map map) {
		// TODO Auto-generated method stub
		return dm.getCountDealListByItems(map);
	}

	public List<DealBean> getDealListByItems(Map map) {
		// TODO Auto-generated method stub
		return dm.getDealListByItems(map);
	}

}
