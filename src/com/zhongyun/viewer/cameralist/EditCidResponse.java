package com.zhongyun.viewer.cameralist;

public class EditCidResponse {
	private int code;
	private time desc;
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public time getDesc() {
		return desc;
	}

	public void setDesc(time desc) {
		this.desc = desc;
	}

	public class time{
		private String ts;

		public String getTs() {
			return ts;
		}

		public void setTs(String ts) {
			this.ts = ts;
		}
	}
}
