package com.zhongyun.viewer.cameralist;

import java.io.Serializable;

public class Cloud implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8212535613024695565L;
	private int ptype;
	private int poid;
	private String expireday;
	private String renewexpireday;
	public Cloud(){}
	public Cloud(int ptype,int poid,String expireday,String renewexpireday){
		this.ptype = ptype;
		this.poid = poid;
		this.expireday = expireday;
		this.renewexpireday = renewexpireday;
	}
	public int getPtype() {
		return ptype;
	}
	public void setPtype(int ptype) {
		this.ptype = ptype;
	}
	public int getPoid() {
		return poid;
	}
	public void setPoid(int poid) {
		this.poid = poid;
	}
	public String getExpireday() {
		return expireday;
	}
	public void setExpireday(String expireday) {
		this.expireday = expireday;
	}
	public String getRenewexpireday() {
		return renewexpireday;
	}
	public void setRenewexpireday(String renewexpireday) {
		this.renewexpireday = renewexpireday;
	} 
	
}