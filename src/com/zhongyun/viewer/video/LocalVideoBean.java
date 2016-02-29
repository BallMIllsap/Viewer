package com.zhongyun.viewer.video;

import android.graphics.Bitmap;

public class LocalVideoBean {
	private String fileName;
	private String fileTime;
	private int fileSize;
	private String filePath;
	private Bitmap bitMap;
	public Bitmap getBitMap() {
		return bitMap;
	}
	public void setBitMap(Bitmap bitMap) {
		this.bitMap = bitMap;
	}
	public String getFilePath() {
		return filePath;
	}
	public int getFileSize() {
		return fileSize;
	}
	public void setFileSize(int fileSize) {
		this.fileSize = fileSize;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileTime() {
		return fileTime;
	}
	public void setFileTime(String fileTime) {
		this.fileTime = fileTime;
	}
}
