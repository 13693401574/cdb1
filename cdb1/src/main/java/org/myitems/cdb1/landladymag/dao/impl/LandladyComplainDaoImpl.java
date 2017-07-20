package org.myitems.cdb1.landladymag.dao.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.myitems.cdb1.beans.LandladyComplainBean;
import org.myitems.cdb1.landladymag.dao.ILandladyComplainDao;
import org.myitems.cdb1.landladymag.mapper.LandladyComplainMapper;
import org.myitems.cdb1.landladymag.mapper.LandladyMapper;
import org.springframework.stereotype.Repository;
/**
 * 包租婆投诉持久层实现类
 * @author Administrator
 *
 */
@Repository
public class LandladyComplainDaoImpl implements ILandladyComplainDao {

	@Resource
	private SessionFactory sf;
	@Resource
	private LandladyComplainMapper lm;
	
	public void saveLandladyComplain(LandladyComplainBean landladyComplain) {
		// TODO Auto-generated method stub
		sf.openSession().save(landladyComplain);
	}

	public int getCountLandladyComplainListByItems(Map map) {
		// TODO Auto-generated method stub
		return lm.getCountLandladyComplainListByItems(map);
	}

	public List<LandladyComplainBean> getLandladyComplainListByItems(Map map) {
		// TODO Auto-generated method stub
		return lm.getLandladyComplainListByItems(map);
	}

}
