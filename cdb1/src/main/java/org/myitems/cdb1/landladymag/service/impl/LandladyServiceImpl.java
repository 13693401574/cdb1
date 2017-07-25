package org.myitems.cdb1.landladymag.service.impl;

import javax.annotation.Resource;

import org.myitems.cdb1.beans.LandladyBean;
import org.myitems.cdb1.landladymag.dao.ILandladyDao;
import org.springframework.stereotype.Service;

@Service
public class LandladyServiceImpl implements ILandladyDao {

	@Resource
	private ILandladyDao landladyDaoImpl;
	
	public void saveLandlady(LandladyBean landlady) {
		// TODO Auto-generated method stub
		landladyDaoImpl.saveLandlady(landlady);
	}

	public LandladyBean getLandladyById(Long id) {
		// TODO Auto-generated method stub
		return landladyDaoImpl.getLandladyById(id);
	}

	public void updateLandlady(LandladyBean landlady) {
		// TODO Auto-generated method stub
		landladyDaoImpl.updateLandlady(landlady);
	}

}
