package com.zhongyun.viewer.cameralist;

public class AddCidResponse {
	private int code;
	private CidInfo desc;
	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}


	public CidInfo getDesc() {
		return desc;
	}


	public void setDesc(CidInfo desc) {
		this.desc = desc;
	}


	public class CidInfo{
		private CidObj cidobj;
		private String ts;
		public CidObj getCidobj() {
			return cidobj;
		}

		public void setCidobj(CidObj cidobj) {
			this.cidobj = cidobj;
		}

		public String getTs() {
			return ts;
		}

		public void setTs(String ts) {
			this.ts = ts;
		}
		
	}
	
	
	public class CidObj{
		private String cid;
		private String cuser;
		private String cpasswd;
		private Binds bind;
		private Cloud cloud;
		
		public String getCid() {
			return cid;
		}
		public void setCid(String cid) {
			this.cid = cid;
		}
		public String getCuser() {
			return cuser;
		}
		public void setCuser(String cuser) {
			this.cuser = cuser;
		}
		public String getCpasswd() {
			return cpasswd;
		}
		public void setCpasswd(String cpasswd) {
			this.cpasswd = cpasswd;
		}
		public Binds getBind() {
			return bind;
		}
		public void setBind(Binds bind) {
			this.bind = bind;
		}
		public Cloud getCloud() {
			return cloud;
		}
		public void setCloud(Cloud cloud) {
			this.cloud = cloud;
		}
	}
}
