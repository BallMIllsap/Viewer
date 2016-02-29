package com.zhongyun.viewer.video.jsonBean;

import java.io.Serializable;

public class CommandCallBackVideoList implements Serializable{

	private static final long serialVersionUID = -3814340448651021311L;
	private String msgtype;
	private String msgindict;
	
	private FileList content;
	public String getMsgtype() {
		return msgtype;
	}
	public void setMsgtype(String msgtype) {
		this.msgtype = msgtype;
	}
	public String getMsgindict() {
		return msgindict;
	}
	public void setMsgindict(String msgindict) {
		this.msgindict = msgindict;
	}
	
	
	public FileList getContent() {
		return content;
	}
	public void setContent(FileList content) {
		this.content = content;
	}


	
}
