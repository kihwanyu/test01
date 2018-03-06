package com.kh.jsp.board.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;

import com.kh.jsp.board.model.dto.Attachment;
import com.kh.jsp.board.model.dto.Board;
import com.kh.jsp.member.model.dao.MemberDao;

import static com.kh.jsp.common.JDBCTemplet.*;
public class BoardDao {
	private Properties prop = new Properties();
	public BoardDao(){
		String fileName = MemberDao.class.getResource("/sql/board/board-query.properties").getPath();
		try {
			prop.load(new FileReader(fileName));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public ArrayList<Board> selectBoardList(Connection conn, int currentPage, int limit) {
		ArrayList<Board> list = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = prop.getProperty("selectBoardList");
		
		try {
			//페이징 처리 전
			
			/*stmt = conn.createStatement();
			rset = stmt.executeQuery(query);*/
			
			// 페이징 처리 후 
			pstmt = conn.prepareStatement(query);

			int startRow = (currentPage - 1) * limit + 1;
			int endRow = startRow + limit - 1;
			
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			
			list = new ArrayList<Board>();
			
			rset = pstmt.executeQuery();
			
			while(rset.next()){
				list.add(new Board(rset.getInt("BID")
						,rset.getInt("BTYPE")
						,rset.getInt("BNO")
						,rset.getString("CNAME")
						,rset.getString("BTITLE")
						,rset.getString("BCONTENT")
						,rset.getString("NICK_NAME")
						,rset.getInt("BCOUNT")
						,rset.getInt("REF_BID")
						,rset.getInt("REF_REF_BID")
						,rset.getInt("REPLY_LEVEL")
						,rset.getDate("BDATE")
						,rset.getString("STATUS")));
			}
			/*BID	NUMBER
			BTYPE	NUMBER
			BNO	NUMBER
			CID	NUMBER
			BTITLE	VARCHAR2(100 BYTE)
			BCONTENT	VARCHAR2(1000 BYTE)
			BWRITER	NUMBER
			BCOUNT	NUMBER
			REF_BID	NUMBER
			REF_REF_BID	NUMBER
			REPLY_LEVEL	NUMBER
			BDATE	DATE
			STATUS	VARCHAR2(1 BYTE)*/
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return list;
	}
	public int boardInsert(Connection conn, Board b) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = prop.getProperty("boardInsert");
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(b.getcCategory()));
			pstmt.setString(2, b.getbTitle());
			pstmt.setString(3, b.getbContent());
			pstmt.setInt(4, Integer.parseInt(b.getbWriter()));
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}
	public int getListCount(Connection conn) {
		Statement stmt = null;
		ResultSet rset = null;
		int listCount = 0;
		
		String query = prop.getProperty("getListCount");
		
		try {
			stmt = conn.createStatement();
			
			rset = stmt.executeQuery(query);
			
			if(rset.next()){
				listCount = rset.getInt("COUNT(*)");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(stmt);
			close(rset);
		}
		return listCount;
	}
	public int insertThumbnaulContent(Connection conn, Board b) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("insertThumb");
		
		try {
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, b.getbTitle());
			pstmt.setString(2, b.getbContent());
			pstmt.setInt(3, Integer.parseInt(b.getbWriter()));
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstmt);
		}	
		return result;
	}
	public int selectCurrval(Connection conn) {
		int bid = 0;
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = prop.getProperty("selectCurrval");
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			if(rset.next()){
				bid = rset.getInt("CURRVAL");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}
		
		
		
		return bid;
	}
	public int insertAttachment(Connection conn, ArrayList<Attachment> fileList) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = prop.getProperty("insertAttachment");
		
		try {
			for(int i = 0; i < fileList.size(); i++){
				pstmt = conn.prepareStatement(query);
				int level = 0;
				
				pstmt.setInt(1, fileList.get(i).getBid());
				pstmt.setString(2, fileList.get(i).getOriginName());
				pstmt.setString(3, fileList.get(i).getChangeName());
				pstmt.setString(4, fileList.get(i).getFilePath());
				
				if(i == 0){
					level = 0;
				} else {
					level = 1;
				}
				
				pstmt.setInt(5, level);
				
				result += pstmt.executeUpdate();
			}
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}
	public ArrayList<HashMap<String, Object>> selectThumnailList(Connection conn) {
		Statement stmt = null;
		ArrayList<HashMap<String, Object>> list = null;
		HashMap<String, Object> map = null;
		ResultSet rset = null;
		
		String query = prop.getProperty("selectThumnailList");
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			list = new ArrayList<HashMap<String, Object>>();
			
			while (rset.next()) {
				map = new HashMap<String, Object>();
				map.put("bid", rset.getInt("bid"));
				map.put("bno", rset.getInt("bno"));
				map.put("btitle", rset.getString("btitle"));
				map.put("bcontent", rset.getString("bcontent"));
				map.put("nick_name", rset.getString("nick_name"));
				map.put("bcount", rset.getInt("bcount"));
				map.put("bdate", rset.getDate("bdate"));
				map.put("fid", rset.getInt("fid"));
				map.put("originName", rset.getString("origin_Name"));
				map.put("changeName", rset.getString("change_Naee"));
				map.put("filePath", rset.getString("file_path"));
				map.put("upload_date", rset.getDate("upload_date"));
				
				list.add(map);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(stmt);
			close(rset);
		}
		
		return list;
	}
	public HashMap<String, Object> selectThumnailMap(Connection conn, int num) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		HashMap<String, Object> map = null;
		Board b = null;
		Attachment at = null;
		
		ArrayList<Attachment> list = null;
	
		String query = prop.getProperty("selectThumnailMap");
		System.out.println(query);
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, num);
			
			rset = pstmt.executeQuery();
			
			list = new ArrayList<Attachment>();
			
			while (rset.next()) {
				b = new Board(rset.getInt("bid"),rset.getInt("bno"),rset.getString("btitle"),rset.getString("bcontent"),
						rset.getString("nick_name"),rset.getInt("bcount"),rset.getDate("bdate"));
				
				at = new Attachment(rset.getInt("fid"),rset.getString("origin_name")
						,rset.getString("change_naee"),rset.getString("file_path")
						,rset.getDate("upload_date"));
				
				list.add(at);
			}
			
			map = new HashMap<String,Object>();
			map.put("board", b);
			map.put("attachment", list);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		return map;
	}
	public Attachment selectOneAttachment(Connection conn, int num) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		Attachment file = null;
		
		String query = prop.getProperty("selectOneAttachment");
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, num);
			rset = pstmt.executeQuery();
			
			if(rset.next()){
				file = new Attachment();
				
				file.setFid(rset.getInt("fid"));
				file.setBid(rset.getInt("bid"));
				file.setChangeName(rset.getString("change_naee"));
				file.setFilePath(rset.getString("file_path"));
				file.setUploadDate(rset.getDate("upload_date"));
				file.setStatus("status");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		
		
		
		
		
		return file;
	}

}
