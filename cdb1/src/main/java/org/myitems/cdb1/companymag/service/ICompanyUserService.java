package org.myitems.cdb1.companymag.service;

import java.util.Map;

import org.myitems.cdb1.beans.Pager;

public interface ICompanyUserService {
	/**获取已租车位的分页对象*/
	public Pager getAlreadyRentCarportByMapToPager(Map map,Pager pager);
	/**获取可租车位的分页对象*/
	public Pager getCanRentFreeCarportByMapToPager(Map map,Pager pager);
	/**修改公司用户信息*/
	public int update();
}
