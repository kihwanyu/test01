package com.kh.jsp.notice.model.service;

import static com.kh.jsp.common.JDBCTemplet.*;

import java.sql.Connection;
import java.util.ArrayList;

import com.kh.jsp.notice.model.dao.NoticeDao;
import com.kh.jsp.notice.model.dto.Notice;

public class NoticeService {
	public ArrayList<Notice> selectList() {
		Connection conn = getConnection();
		
		ArrayList<Notice> list = new NoticeDao().selectList(conn);
		
		close(conn);
		
		return list;
	}

	public int noticeInsert(Notice notice) {
		Connection conn = getConnection();
		
		int result = new NoticeDao().noticeInsert(conn, notice);
		
		if(result > 0) commit(conn);
		else rollback(conn);
		
		close(conn);
		
		return result;
	}

	public Notice seletOne(String num) {
		Connection conn = getConnection();
		
		Notice notice = new NoticeDao().selectOne(conn, num);
		
		if(notice != null){
			int result = new NoticeDao().updateCount(conn, Integer.parseInt(num));
			if(result>0) commit(conn);
			else rollback(conn);
		}
		
		
		close(conn);
		
		return notice;
	}

	public int noticeUpdate(Notice n) {
		Connection conn = getConnection();
		
		int result = new NoticeDao().noticeUpdate(conn, n);
		
		if(result>0) commit(conn);
		else rollback(conn);
		
		return result;
	}

	public ArrayList<Notice> deleteNotice(int nno) {
		ArrayList<Notice> list = null;
		Connection conn = getConnection();
		
		int result = new NoticeDao().deleteNotice(conn, nno);
		
		if(result>0){
			commit(conn);
			list = new NoticeDao().selectList(conn);
		}
		else {
			rollback(conn);
		}
		
		return list;
	}

	
}
