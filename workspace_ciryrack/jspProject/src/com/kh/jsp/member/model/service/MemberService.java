package com.kh.jsp.member.model.service;

import java.sql.Connection;

import com.kh.jsp.member.model.dao.MemberDao;
import com.kh.jsp.member.model.dto.Member;
import static com.kh.jsp.common.JDBCTemplet.*;
public class MemberService {

	public Member loginCheck(String user_id, String user_pwd) {
		Connection conn = getConnection();
		
		Member member = new MemberDao().loginCheck(conn,user_id,user_pwd);
			
		close(conn);	
		
		return member;
	}

	public int insertMember(Member m) {
		Connection conn = getConnection();
		
		int result = new MemberDao().insertMember(conn,m);
		
		if(result > 0) commit(conn);
		else rollback(conn);
		
		close(conn);
		
		return result;
	}

}
