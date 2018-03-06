package com.kh.jsp.notice.model.dto;

import java.io.Serializable;
import java.sql.Date;

public class Notice implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5432361162815604852L;
	/**
	 * 
	 */
	
	private int nno;
	private String nTitle;
	private String nContent;
	private String NWRITER;
	private int NCOUNT;
	private Date NDATE;
	private String STATUS;
	
	public Notice() {
		super();
	}

	public Notice(int nno, String nTitle, String nContent, String nWRITER, int nCOUNT, Date nDATE, String sTATUS) {
		super();
		this.nno = nno;
		this.nTitle = nTitle;
		this.nContent = nContent;
		NWRITER = nWRITER;
		NCOUNT = nCOUNT;
		NDATE = nDATE;
		STATUS = sTATUS;
	}
	
	public Notice(int nno, String nTitle, String nContent, String nWRITER, int nCOUNT, Date nDATE) {
		super();
		this.nno = nno;
		this.nTitle = nTitle;
		this.nContent = nContent;
		NWRITER = nWRITER;
		NCOUNT = nCOUNT;
		NDATE = nDATE;
	}
	
	public Notice(String nTitle, String nContent, String nWRITER, Date nDATE) {
		super();
		this.nTitle = nTitle;
		this.nContent = nContent;
		NWRITER = nWRITER;
		NDATE = nDATE;
	}
	
	
	public Notice(int nno, String nTitle, String nContent) {
		super();
		this.nno = nno;
		this.nTitle = nTitle;
		this.nContent = nContent;
	}

	public int getNno() {
		return nno;
	}

	public void setNno(int nno) {
		this.nno = nno;
	}

	public String getnTitle() {
		return nTitle;
	}

	public void setnTitle(String nTitle) {
		this.nTitle = nTitle;
	}

	public String getnContent() {
		return nContent;
	}

	public void setnContent(String nContent) {
		this.nContent = nContent;
	}

	public String getNWRITER() {
		return NWRITER;
	}



	public void setNWRITER(String nWRITER) {
		NWRITER = nWRITER;
	}

	public int getNCOUNT() {
		return NCOUNT;
	}

	public void setNCOUNT(int nCOUNT) {
		NCOUNT = nCOUNT;
	}

	public Date getNDATE() {
		return NDATE;
	}

	public void setNDATE(Date nDATE) {
		NDATE = nDATE;
	}

	public String getSTATUS() {
		return STATUS;
	}

	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}

	@Override
	public String toString() {
		return "Notice [nno=" + nno + ", nTitle=" + nTitle + ", nContent=" + nContent + ", NWRITER=" + NWRITER
				+ ", NCOUNT=" + NCOUNT + ", NDATE=" + NDATE + ", STATUS=" + STATUS + "]";
	}
	
	
	
	
	/*NNO
	NTITLE
	NCONTENT
	NWRITER
	NCOUNT
	NDATE
	STATUS*/
}
