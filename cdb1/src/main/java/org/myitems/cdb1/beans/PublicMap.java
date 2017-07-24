package org.myitems.cdb1.beans;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

import org.myitems.cdb1.tools.DateChange;

public class PublicMap {
	private String page;
	private String rows;
	private Integer index;
	private String startTime;
	private String endTime;
	private String carportAddress;
	private String carportAddressCode;
	private String fkLandladyId;
	private String fkCorportIssueId;
	private String status;
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
		map.put("status", status);
	}

	public String getFkCorportIssueId() {
		return fkCorportIssueId;
	}

	public void setFkCorportIssueId(String fkCorportIssueId) {
		this.fkCorportIssueId = fkCorportIssueId;
		
		map.put("fkCorportIssueId", fkCorportIssueId);
	}

	public String getCarportAddressCode() {
		return carportAddressCode;
	}

	public void setCarportAddressCode(String carportAddressCode) {
		this.carportAddressCode = carportAddressCode;
		map.put(carportAddressCode, "carportAddressCode");
	}

	public String getCarportAddress() {
		return carportAddress;
	}

	public void setCarportAddress(String carportAddress) {
		this.carportAddress = carportAddress;
		map.put("carportAddress", carportAddress);
	}
	private Map map = new HashMap();

	
	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
		map.put("page", Integer.parseInt(page));
	}

	public String getRows() {
		return rows;
	}

	public void setRows(String rows) {
		this.rows = rows;
		map.put("rows", Integer.parseInt(rows));
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		map.put("startTime", DateChange.getDate(startTime));
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		map.put("endTime", DateChange.getDate(endTime));
		
	}

	public Map getMap() {
		index = (Integer.parseInt(page) - 1) * Integer.parseInt(rows);
		map.put("index", index);
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}
	 public String getFkLandladyId() {
	 return fkLandladyId;
	 }
	 public void setFkLandladyId(String fkLandladyId) {
	 this.fkLandladyId = fkLandladyId;
	 map.put("fkLandladyId", Long.parseLong(fkLandladyId));
	 }

	//

	// public static void main(String[] args) {
	// Map map=new HashMap();
	// map.put("page", "1");
	// map.put("rows", "3");
	// map.put("row", 3);
	// System.out.println(map);
	// }

}
