package com.zhongyun.viewer.video.jsonBean;

import java.util.List;

public class FileList {
	private int status;
	List<File> filelist;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public List<File> getFilelist() {
		return filelist;
	}

	public void setFilelist(List<File> filelist) {
		this.filelist = filelist;
	}

	public class File {
		private String filename;
		private String profileimageaddr;
		private String filesize;
		private String createtime;
		private String timerange;

		public String getTimerange() {
			return timerange;
		}

		public void setTimerange(String timerange) {
			this.timerange = timerange;
		}

		public String getFilename() {
			return filename;
		}

		public void setFilename(String filename) {
			this.filename = filename;
		}

		public String getProfileimageaddr() {
			return profileimageaddr;
		}

		public void setProfileimageaddr(String profileimageaddr) {
			this.profileimageaddr = profileimageaddr;
		}

		public String getFilesize() {
			return filesize;
		}

		public void setFilesize(String filesize) {
			this.filesize = filesize;
		}

		public String getCreatetime() {
			return createtime;
		}

		public void setCreatetime(String createtime) {
			this.createtime = createtime;
		}
	}

}
