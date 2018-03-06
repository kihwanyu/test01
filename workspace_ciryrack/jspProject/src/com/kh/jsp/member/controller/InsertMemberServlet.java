package com.kh.jsp.member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.jsp.member.model.dto.Member;
import com.kh.jsp.member.model.service.MemberService;

/**
 * Servlet implementation class InsertMemberServlet
 */
@WebServlet("/InsertMember.do")
public class InsertMemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertMemberServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//파라메터 꺼내오기
		String user_id = request.getParameter("userId");
		String user_pwd = request.getParameter("userPwd");
		String nick_name = request.getParameter("nicName");
		String tel1 = request.getParameter("tel1");
		String tel2 = request.getParameter("tel2");
		String tel3 = request.getParameter("tel3");
		String phone = tel1 + "-" + tel2 + "-" + tel3 ;
		String email = request.getParameter("email");
		String zipcode = request.getParameter("zipcode");
		String address1 = request.getParameter("address1");
		String address2 = request.getParameter("address2");
		String address = zipcode + "/" + address1 + "/" + address2;
		String[] interestArr = request.getParameterValues("interest");
		String interest = "";
		for(int i = 0; i < interestArr.length; i++){
			if(i<interestArr.length-1){
			interest += interestArr[i] + ", ";
			} else {
				interest += interestArr[i];
			}
		}
		
		//member객체 생성
		Member m = new Member(user_id, user_pwd, nick_name, phone, email, address, interest);
		//서비스로 전달
		int result = new MemberService().insertMember(m);
		
		//페이지 연결
		String page = "";
		if(result > 0){
			page = "views/common/successPage.jsp";
			request.setAttribute("msg", "회원가입성공");
		} else {
			page = "views/common/errorPage.jsp";
			request.setAttribute("msg", "회원가입실패");
		}
		
		request.getRequestDispatcher(page).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
