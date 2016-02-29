package com.zhongyun.viewer.login;

import java.io.Serializable;

public class UserLoginResponse implements Serializable{
	private static final long serialVersionUID = 5184168234309736638L;
	private int code;
	private Result desc;
	
	public int getCode() {
		return code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public Result getDesc() {
		return desc;
	}
	
	public void setDesc(Result desc) {
		this.desc = desc;
	}
	
	public class Result{
		private String sessionid;
		private String recommandurl;
		
		public String getSessionid() {
			return sessionid;
		}
		
		public void setSessionid(String sessionid) {
			this.sessionid = sessionid;
		}
		
		public String getRecommandurl() {
			return recommandurl;
		}
		
		public void setRecommandurl(String recommandurl) {
			this.recommandurl = recommandurl;
		}
		
	}
}

