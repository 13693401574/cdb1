package org.myitems.cdb1.beans;

import java.util.HashMap;
import java.util.Map;

public class PublicMap {
	private String page;
	private String rows;
	private Map map=new HashMap();
//	private String fkLandladyId;
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
		map.put("page", page);
	}
	public String getRows() {
		return rows;
	}
	public void setRows(String rows) {	
		this.rows = rows;	
		map.put("rows", rows);	
	}
	
	public Map getMap() {
		return map;
	}
	public void setMap(Map map) {
		this.map = map;		
	}
//	public String getFkLandladyId() {
//		return fkLandladyId;
//	}
//	public void setFkLandladyId(String fkLandladyId) {
//		this.fkLandladyId = fkLandladyId;
//		map.put("fkLandladyId", Long.parseLong(fkLandladyId));
//	}
	
	
	
//
	
//	public static void main(String[] args) {
//		Map map=new HashMap();
//		map.put("page", "1");
//		map.put("rows", "3");
//		map.put("row", 3);
//		System.out.println(map);
//	}

	
	
}
