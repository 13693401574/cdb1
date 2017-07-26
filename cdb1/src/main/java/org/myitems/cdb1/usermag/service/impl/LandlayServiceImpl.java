package org.myitems.cdb1.usermag.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.myitems.cdb1.beans.CarportApplicationBean;
import org.myitems.cdb1.beans.LandladyBean;
import org.myitems.cdb1.landladymag.service.ILandladyService;
import org.myitems.cdb1.usermag.dao.ILanlanyDao;
import org.myitems.cdb1.usermag.service.ILandlayService;
import org.springframework.stereotype.Service;
/**
 * 包租婆审批和查看
 * @author Administrator
 *
 */

@Service
public class LandlayServiceImpl implements ILandlayService {
	
	@Resource
	private ILanlanyDao landlayDaoImpl;
	/**
	 * 查看包租婆发布的车位信息
	 * @param id 包租婆id
	 * @return 发布车位信息对象
	 */
	@Override
	public CarportApplicationBean selectLandlayCarportInfo(Long id) {
		// TODO Auto-generated method stub
		return landlayDaoImpl.selectLandlayCarportInfo(id);
	}
	
	/**
	 * 改变状态
	 */
	@Override
	public void updateCarportApplicationBeanStatus(String status,Long id) {
		// TODO Auto-generated method stub
		 landlayDaoImpl.updateCarportApplicationBeanStatus(status,id);
	}

	/**
	 * 加载全部信息
	 */
	@Override
	public List<?> findAll(Map map) {
		// TODO Auto-generated method stub
		return landlayDaoImpl.findAll(map);
	}
	
	
	
}
