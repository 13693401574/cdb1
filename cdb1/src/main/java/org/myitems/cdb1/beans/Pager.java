package org.myitems.cdb1.beans;

import java.util.List;

public class Pager {

	private int page;//当前页数
	private int rows;//每页显示条数
	private int index;
	
	private int totalRows;//总条数
	private int totalPage;//总页数
	
	private List<?> datas;

	public Pager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getIndex() {
		index = (page -1) * rows;
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getTotalRows() {
		return totalRows;
	}

	public void setTotalRows(int totalRows) {
		this.totalRows = totalRows;
		totalPage = totalRows % rows == 0 ? (totalRows / rows) : (totalRows / rows + 1);
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public List<?> getDatas() {
		return datas;
	}

	public void setDatas(List<?> datas) {
		this.datas = datas;
	}

	@Override
	public String toString() {
		return "Pager [page=" + page + ", rows=" + rows + ", index=" + index + ", totalRows=" + totalRows
				+ ", totalPage=" + totalPage + ", datas=" + datas + "]";
	}
}
