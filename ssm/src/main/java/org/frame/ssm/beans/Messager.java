package org.frame.ssm.beans;

public class Messager {

	private boolean state;
	private String msg;
	public Messager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Messager(boolean state, String msg) {
		super();
		this.state = state;
		this.msg = msg;
	}
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "Messager [state=" + state + ", msg=" + msg + "]";
	}
	
	
}
