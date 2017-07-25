package org.myitems.cdb1.beans;

public class BackStatus {
	private boolean status;
	private String msg;
	public BackStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BackStatus(boolean status, String msg) {
		super();
		this.status = status;
		this.msg = msg;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "BackStatus [status=" + status + ", msg=" + msg + "]";
	}
	

}
