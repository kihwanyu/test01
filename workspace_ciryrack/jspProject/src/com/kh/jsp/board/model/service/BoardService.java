package com.kh.jsp.board.model.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;

import com.kh.jsp.board.model.dao.BoardDao;
import com.kh.jsp.board.model.dto.Attachment;
import com.kh.jsp.board.model.dto.Board;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

import static com.kh.jsp.common.JDBCTemplet.*;
public class BoardService {

	public ArrayList<Board> selectBoardList(int currentPage, int limit) {
		Connection conn = getConnection();
		
		ArrayList<Board> list = new BoardDao().selectBoardList(conn, currentPage, limit);
		
		close(conn);
		
		return list;
	}

	public int boardInsert(Board b) {
		Connection conn = getConnection();
		int result = new BoardDao().boardInsert(conn, b);
		
		if(result > 0) commit(conn);
		else rollback(conn);
		
		close(conn);
		
		return result;
	}

	public int getListCount() {
		Connection conn = getConnection();
		
		int listCount = new BoardDao().getListCount(conn);
		
		close(conn);
		
		return listCount;
	}

	public int inserThumb(Board b, ArrayList<Attachment> fileList) {
		Connection conn = getConnection();
		int result = 0;
		int result2 = 0;
		int result1 = new BoardDao().insertThumbnaulContent(conn, b);
		
		if(result1 > 0) {
			int bid = new BoardDao().selectCurrval(conn);
			for(int i = 0; i < fileList.size(); i++){
				fileList.get(i).setBid(bid);
			}	
			result2 = new BoardDao().insertAttachment(conn, fileList);
		} 
		
		
		if(result1 > 0 && result2 == fileList.size()) {
			commit(conn);
			result = 1;
		} else {
			rollback(conn);
		}
		
		close(conn);
		
		return result;
	}

	public ArrayList<HashMap<String, Object>> selectThumnailList() {
		
		Connection conn = getConnection();
		
		ArrayList<HashMap<String, Object>> list = new BoardDao().selectThumnailList(conn);

		close(conn);
		
		return list;
	}

	public HashMap<String, Object> selectTumbnailMap(int num) {
		Connection conn = getConnection();
		HashMap<String, Object> map = null;
		/*int result = new BoardDao().updateCount(conn,num);*/
		int result = 1;
		
		if(result > 0) {
			commit(conn);
			map = new BoardDao().selectThumnailMap(conn, num);		
		} else {
			rollback(conn);
		}
		close(conn);
		return map;
	}

	public Attachment selectOneAttachment(int num) {
		Connection conn = getConnection();
		Attachment at = new BoardDao().selectOneAttachment(conn, num);
		
		return at;
	}

}
