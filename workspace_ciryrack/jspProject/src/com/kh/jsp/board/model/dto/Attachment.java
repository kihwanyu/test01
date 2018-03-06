package com.kh.jsp.board.model.dto;

import java.io.Serializable;
import java.sql.Date;

public class Attachment implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3695147298536100106L;
	
	private int fid;
	private int bid;
	private String originName;
	private String changeName;
	private String filePath;
	private Date uploadDate;
	private int fileLevel;
	private int downloadCount;
	private String status;
	
	public Attachment() {
		super();
	}
	
	
	public Attachment(String originName, String changeName, String filePath) {
		super();
		this.originName = originName;
		this.changeName = changeName;
		this.filePath = filePath;
	}

	
	public Attachment(int fid, String originName, String changeName, String filePath, Date uploadDate) {
		super();
		this.fid = fid;
		this.originName = originName;
		this.changeName = changeName;
		this.filePath = filePath;
		this.uploadDate = uploadDate;
	}


	public Attachment(int fid, int bid, String originName, String changeName, String filePath, Date uploadDate,
			int fileLevel, int downloadCount, String status) {
		super();
		this.fid = fid;
		this.bid = bid;
		this.originName = originName;
		this.changeName = changeName;
		this.filePath = filePath;
		this.uploadDate = uploadDate;
		this.fileLevel = fileLevel;
		this.downloadCount = downloadCount;
		this.status = status;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getOriginName() {
		return originName;
	}
	public void setOriginName(String originName) {
		this.originName = originName;
	}
	public String getChangeName() {
		return changeName;
	}
	public void setChangeName(String changeName) {
		this.changeName = changeName;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public Date getUploadDate() {
		return uploadDate;
	}
	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}
	public int getFileLevel() {
		return fileLevel;
	}
	public void setFileLevel(int fileLevel) {
		this.fileLevel = fileLevel;
	}
	public int getDownloadCount() {
		return downloadCount;
	}
	public void setDownloadCount(int downloadCount) {
		this.downloadCount = downloadCount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Attachment [fid=" + fid + ", bid=" + bid + ", originName=" + originName + ", changeName=" + changeName
				+ ", filePath=" + filePath + ", uploadDate=" + uploadDate + ", fileLevel=" + fileLevel
				+ ", downloadCount=" + downloadCount + ", status=" + status + "]";
	}
	
	
	/*FID	NUMBER
	BID	NUMBER
	ORIGIN_NAME	VARCHAR2(255 BYTE)
	CHANGE_NAEE	VARCHAR2(255 BYTE)
	FILE_PATH	VARCHAR2(1000 BYTE)
	UPLOAD_DATE	DATE
	FILE_LEVEL	NUMBER
	DOWNLOAD_COUNT	NUMBER
	STATUS	VARCHAR2(1 BYTE)*/
}
