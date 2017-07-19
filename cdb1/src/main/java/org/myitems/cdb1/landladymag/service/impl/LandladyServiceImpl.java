package org.myitems.cdb1.landladymag.service.impl;

import javax.annotation.Resource;

import org.myitems.cdb1.beans.LandladyBean;
import org.myitems.cdb1.landladymag.dao.ILandladyDao;
import org.myitems.cdb1.landladymag.service.ILandladyService;
import org.springframework.stereotype.Service;

@Service
public class LandladyServiceImpl implements ILandladyService {

	@Resource
	private ILandladyDao landladyDaoImpl;

	@Override
	public void saveLandlady(LandladyBean landlady) {
		// TODO Auto-generated method stub
		landladyDaoImpl.saveLandlady(landlady);
	}

	@Override
	public LandladyBean getLandladyById(Long id) {
		// TODO Auto-generated method stub
		return landladyDaoImpl.getLandladyById(id);
	}

	@Override
	public void updateLandlady(LandladyBean landlady) {
		// TODO Auto-generated method stub
		landladyDaoImpl.updateLandlady(landlady);
	}
	
	

}
