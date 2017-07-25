package org.myitems.cdb1.usermag.dao.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.myitems.cdb1.beans.ComplainBean;
import org.myitems.cdb1.beans.DealBean;
import org.myitems.cdb1.beans.LandladyComplainBean;
import org.myitems.cdb1.usermag.dao.ILanlayComplaninDao;
import org.myitems.cdb1.usermag.mapper.ILandlayComplainMapper;
import org.myitems.cdb1.usermag.mapper.ILandlayMapper;
import org.springframework.stereotype.Repository;
/**
 * 包租婆投诉受理 持久层
 * @author Administrator
 */
@Repository
public class LandlayComplainDaoImpl implements ILanlayComplaninDao{

	@Resource
	private ILandlayComplainMapper lm;
	/**
	 * 通过id得到包租婆投诉的信息
	 */
	@Override
	public LandladyComplainBean getLandlayCompliainInfo(Long id) {
		// TODO Auto-generated method stub
		System.out.println(id+"==================");
		return  null; //lm.getLandlayCompliainInfo(id);
	}

	@Override
	public void RobTenanStatus(String status,Long id) {
		// TODO Auto-generated method stub
		 lm.updateLandlayCompliain(status, id);;
	}

	@Override
	public ComplainBean getDealInfo(Long id) {
		// TODO Auto-generated method stub
		return lm.getLandlayCompliainInfo(id );
	}

	
	

	

}
