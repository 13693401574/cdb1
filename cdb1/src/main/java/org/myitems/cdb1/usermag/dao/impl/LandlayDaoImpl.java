package org.myitems.cdb1.usermag.dao.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.myitems.cdb1.beans.CarportApplicationBean;
import org.myitems.cdb1.usermag.dao.ILanlanyDao;
import org.myitems.cdb1.usermag.mapper.ILandlayMapper;
import org.springframework.stereotype.Repository;

/**
 * 包租婆审核和查看持久类
 * @author Administrator
 *
 */
@Repository
public class LandlayDaoImpl implements ILanlanyDao{

	@Resource 
	private SessionFactory sf;
	@Resource
	private ILandlayMapper lm;
	
	/**
	 * 查看包租婆发布的车位信息
	 */
	@Override
	public CarportApplicationBean selectLandlayCarportInfo(Long id) {
		// TODO Auto-generated method stub
		//使用mybatis查询
		return lm.selectLandlayCarportInfo(id);
	}
	/**
	 * 改变状态
	 */
	@Override
	public void updateCarportApplicationBeanStatus(String status,Long id) {
		// TODO Auto-generated method stub
		lm.updateCarportApplicationBeanStatus(status, id);
	}
	/**
	 * 加载全部信息
	 */
	@Override
	public List<?> findAll(Map map) {
		// TODO Auto-generated method stub
		return lm.findAll(map);
	}
	
}
