package com.kh.jsp.notice.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import com.kh.jsp.member.model.dao.MemberDao;
import com.kh.jsp.notice.model.dto.Notice;
import static com.kh.jsp.common.JDBCTemplet.*;
public class NoticeDao {
	private Properties prop = new Properties();
	
	public NoticeDao(){
		String fileName = MemberDao.class.getResource("/sql/notice/notice-query.properties").getPath();
		
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
	public ArrayList<Notice> selectList(Connection conn) {
		ArrayList<Notice> list = null;
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = prop.getProperty("SelectList");
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			list = new ArrayList<Notice>();
			
			while (rset.next()) {
				list.add(new Notice(rset.getInt("NNO")
						,rset.getString("NTITLE")
						,rset.getString("NCONTENT")
						,rset.getString("NICK_NAME")
						,rset.getInt("NCOUNT")
						,rset.getDate("NDATE")));
				/*NNO
				NTITLE
				NCONTENT
				NWRITER
				NCOUNT
				NDATE
				STATUS*/
			}
			System.out.println("noticeDao:"+list);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}
		
		return list;
	}
	public int noticeInsert(Connection conn, Notice notice) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("intsertNotice");
		
		try {
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, notice.getnTitle());
			pstmt.setString(2, notice.getnContent());
			pstmt.setInt(3, Integer.parseInt(notice.getNWRITER()));
			pstmt.setDate(4, notice.getNDATE());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}
	public Notice selectOne(Connection conn, String num) {
		Notice notice = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = prop.getProperty("selectOne");
		
		try {
			pstmt = conn.prepareStatement(query);
			
			pstmt.setInt(1, Integer.parseInt(num));
			
			rset = pstmt.executeQuery();
			
			if(rset.next()){
				notice = new Notice(rset.getInt("NNO")
						, rset.getString("NTITLE")
						, rset.getString("NCONTENT")
						, rset.getString("NICK_NAME")
						, rset.getInt("NCOUNT")
						, rset.getDate("NDATE"));
			}
			/*SELECT NNO, NTITLE, NCONTENT, M.NICK_NAME, NCOUNT
			, NDATE FROM NOTICE N JOIN MEMBER M ON(N.NWRITER = M.UNO) 
			WHERE N.STATUS='Y' AND NNO=? ORDER BY NNO DESC*/
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return notice;
	}
	public int updateCount(Connection conn, int ncount) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("updateCount");
		
		try {
			pstmt = conn.prepareStatement(query);
			
			pstmt.setInt(1, ncount);
			pstmt.setInt(2, ncount);
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}
	public int noticeUpdate(Connection conn, Notice n) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = prop.getProperty("updateNotice");
		
		try {
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, n.getnTitle());
			pstmt.setString(2, n.getnContent());
			pstmt.setInt(3, n.getNno());
			
			result = pstmt.executeUpdate();
			/*UPDATE NOTICE SET NTITLE=?, NCONTENT=? WHERE NNO=?*/
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		
		
		return result;
	}
	public int deleteNotice(Connection conn, int nno) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("deleteNotice");
		
		try {
			pstmt = conn.prepareStatement(query);
			
			pstmt.setInt(1, nno);
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	

}
