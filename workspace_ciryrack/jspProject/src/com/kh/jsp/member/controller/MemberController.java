package com.kh.jsp.member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.jsp.member.model.dto.Member;
import com.kh.jsp.member.model.service.MemberService;

/**
 * Servlet implementation class MemberController
 */
@WebServlet("/login.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user_id = request.getParameter("userId");
		String user_pwd = request.getParameter("userPwd");
		
		System.out.println(user_id);
		System.out.println(user_pwd);
		
		Member member = new MemberService().loginCheck(user_id,user_pwd);
		
		String page = "";
		String msg = "";
		if(member != null){
			HttpSession session = request.getSession();
			
			session.setAttribute("member", member);
			page = "/index.jsp";
			
		} else {
			
			msg = "로그인 실패";
			
			request.setAttribute("msg", msg);
			page = "/views/common/errorPage.jsp";
			
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
