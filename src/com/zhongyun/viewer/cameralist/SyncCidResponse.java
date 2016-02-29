package com.zhongyun.viewer.cameralist;

import java.util.List;

public class SyncCidResponse {
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
		private List<CameraInfoBean> cidlist;
		private String ts;
		public List<CameraInfoBean> getCidlist() {
			return cidlist;
		}

		public void setCidlist(List<CameraInfoBean> cidlist) {
			this.cidlist = cidlist;
		}

		public String getTs() {
			return ts;
		}

		public void setTs(String ts) {
			this.ts = ts;
		}
		
	}
}
