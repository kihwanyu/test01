package com.kh.jsp.board.model.dto;

import java.io.Serializable;
import java.sql.Date;

public class Board implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3599409278903174719L;
	
	private int bid;
	private int bType;
	private int bno;
	private String cCategory;
	private String bTitle;
	private String bContent;
	private String bWriter;
	private int bCount;
	private int refBid;
	private int refRefBid;
	private int reply_level;
	private Date bDate;
	private String status;
	public Board() {
		super();
	}
	
	public Board(String bTitle, String bContent, String bWriter) {
		super();
		this.bTitle = bTitle;
		this.bContent = bContent;
		this.bWriter = bWriter;
	}
	
	
	
	public Board(int bid, int bno, String bTitle, String bContent, String bWriter, int bCount, Date bDate) {
		super();
		this.bid = bid;
		this.bno = bno;
		this.bTitle = bTitle;
		this.bContent = bContent;
		this.bWriter = bWriter;
		this.bCount = bCount;
		this.bDate = bDate;
	}

	public Board(int bid, int bType, int bno, String cCategory, String bTitle, String bContent, String bWriter,
			int bCount, int refBid, int refRefBid, int reply_level, Date bDate, String status) {
		super();
		this.bid = bid;
		this.bType = bType;
		this.bno = bno;
		this.cCategory = cCategory;
		this.bTitle = bTitle;
		this.bContent = bContent;
		this.bWriter = bWriter;
		this.bCount = bCount;
		this.refBid = refBid;
		this.refRefBid = refRefBid;
		this.reply_level = reply_level;
		this.bDate = bDate;
		this.status = status;
	}
	
	public Board(String cCategory, String bTitle, String bContent, String bWriter) {
		super();
		this.cCategory = cCategory;
		this.bTitle = bTitle;
		this.bContent = bContent;
		this.bWriter = bWriter;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public int getbType() {
		return bType;
	}
	public void setbType(int bType) {
		this.bType = bType;
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getcCategory() {
		return cCategory;
	}
	public void setcCategory(String cCategory) {
		this.cCategory = cCategory;
	}
	public String getbTitle() {
		return bTitle;
	}
	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}
	public String getbContent() {
		return bContent;
	}
	public void setbContent(String bContent) {
		this.bContent = bContent;
	}
	public String getbWriter() {
		return bWriter;
	}
	public void setbWriter(String bWriter) {
		this.bWriter = bWriter;
	}
	public int getbCount() {
		return bCount;
	}
	public void setbCount(int bCount) {
		this.bCount = bCount;
	}
	public int getRefBid() {
		return refBid;
	}
	public void setRefBid(int refBid) {
		this.refBid = refBid;
	}
	public int getRefRefBid() {
		return refRefBid;
	}
	public void setRefRefBid(int refRefBid) {
		this.refRefBid = refRefBid;
	}
	public int getReply_level() {
		return reply_level;
	}
	public void setReply_level(int reply_level) {
		this.reply_level = reply_level;
	}
	public Date getbDate() {
		return bDate;
	}
	public void setbDate(Date bDate) {
		this.bDate = bDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Board [bid=" + bid + ", bType=" + bType + ", bno=" + bno + ", cCategory=" + cCategory + ", bTitle="
				+ bTitle + ", bContent=" + bContent + ", bWriter=" + bWriter + ", bCount=" + bCount + ", refBid="
				+ refBid + ", refRefBid=" + refRefBid + ", reply_level=" + reply_level + ", bDate=" + bDate
				+ ", status=" + status + "]";
	}
	
	/*BID	NUMBER
	BTYPE	NUMBER
	BNO	NUMBER
	CID	NUMBER
	BTITLE	VARCHAR2(100 BYTE)
	BCOTENT	VARCHAR2(1000 BYTE)
	BWRITER	NUMBER
	BCOUNT	NUMBER
	REF_BID	NUMBER
	REF_REF_BID	NUMBER
	REPLY_LEVEL	NUMBER
	BDATE	DATE
	STATUS	VARCHAR2(1 BYTE)*/
	
	
}
