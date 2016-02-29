package com.zhongyun.viewer.cameralist;

import java.io.Serializable;

public class GetCidByCodeResponse implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3924275957017407085L;
	/**
	 * 
	 */
	private int code;
	private Cid desc;
	
	public Cid getDesc() {
		return desc;
	}
	public void setDesc(Cid desc) {
		this.desc = desc;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	
	public class Cid{
		private String cid;
		public String getCid() {
			return cid;
		}
		public void setCid(String cid) {
			this.cid = cid;
		}
	}
	
}
