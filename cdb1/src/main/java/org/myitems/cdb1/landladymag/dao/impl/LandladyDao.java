package org.myitems.cdb1.landladymag.dao.impl;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.myitems.cdb1.beans.LandladyBean;
import org.myitems.cdb1.landladymag.dao.ILandladyDao;
import org.myitems.cdb1.landladymag.mapper.LandladyMapper;
import org.springframework.stereotype.Repository;

/**
 * 包租婆持久层实现类
 * @author Administrator
 *
 */
@Repository
public class LandladyDao implements ILandladyDao {

	@Resource
	private SessionFactory sf;
	
	@Resource
	private LandladyMapper lm;
	
	public void saveLandlady(LandladyBean landlady) {
		// TODO Auto-generated method stub
		sf.openSession().save(landlady);
	}

	public LandladyBean getLandladyById(Long id) {
		// TODO Auto-generated method stub
		return lm.getLandladyById(id);
	}

	public void updateLandlady(LandladyBean landlady) {
		// TODO Auto-generated method stub
		sf.getCurrentSession().update(landlady);
		
	}

}
