package com.kh.jsp.member.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.kh.jsp.member.model.dto.Member;
import static com.kh.jsp.common.JDBCTemplet.*;
public class MemberDao {

	public Member loginCheck(Connection conn, String user_id, String user_pwd) {
		Properties prop = new Properties();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Member member = null;
		String fileName = MemberDao.class.getResource("/sql/member/member-query.properties").getPath();
		
		try {
			prop.load(new FileReader(fileName));
			String query = prop.getProperty("loginSelect");
			
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1,user_id);
			pstmt.setString(2, user_pwd);
			
			rset = pstmt.executeQuery();
			
			
			
			if (rset.next()) {
				member = new Member(rset.getInt("UNO")
									,rset.getString("USER_ID")
									,rset.getString("USER_PWD")
									,rset.getString("NICK_NAME")
									,rset.getString("PHONE")
									,rset.getString("EMAIL")
									,rset.getString("ADDRESS")
									,rset.getString("INTEREST")
									,rset.getDate("ENROLL_DATE")
									,rset.getDate("MODIFY_DATE")
									,rset.getString("STATUS"));
				/*UNO
				USER_ID
				USER_PWD
				NICK_NAME
				PHONE
				EMAIL
				ADDRESS
				INTEREST
				ENROLL_DATE
				MODIFY_DATE
				STATUS*/
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		
		return member;
	}

	public int insertMember(Connection conn, Member m) {
		Properties prop = new Properties();
		PreparedStatement pstmt = null;
		int result = 0;
		
		String fileName = MemberDao.class.getResource("/sql/member/member-query.properties").getPath();
		
		try {
			prop.load(new FileReader(fileName));
			String query = prop.getProperty("insertMember");
			
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, m.getUser_id());
			pstmt.setString(2, m.getUser_pwd());
			pstmt.setString(3, m.getNick_name());
			pstmt.setString(4, m.getPhone());
			pstmt.setString(5, m.getEmail());
			pstmt.setString(6, m.getAddress());
			pstmt.setString(7, m.getInterest());
			/*UNO
			USER_ID
			USER_PWD
			NICK_NAME
			PHONE
			EMAIL
			ADDRESS
			INTEREST
			ENROLL_DATE
			MODIFY_DATE
			STATUS*/
			result = pstmt.executeUpdate();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

}
