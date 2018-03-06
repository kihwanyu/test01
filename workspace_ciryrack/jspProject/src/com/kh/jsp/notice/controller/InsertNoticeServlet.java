package com.kh.jsp.notice.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.jsp.notice.model.dto.Notice;
import com.kh.jsp.notice.model.service.NoticeService;

/**
 * Servlet implementation class InsertNoticeServlet
 */
@WebServlet("/NoticeInsert.no")
public class InsertNoticeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertNoticeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//파라메터 꺼내기
		String title = request.getParameter("title");
		String uno = request.getParameter("uno");
		String content = request.getParameter("content");
		Date date = java.sql.Date.valueOf(request.getParameter("date"));
		int result = 0;
		String page = "";
		
		/*System.out.println("title : " + title);
		System.out.println("uno : " + uno);
		System.out.println("content : " + content);	
		System.out.println("date : " + date);*/
		
		Notice notice = new Notice(title, content, uno, date);
		
		result = new NoticeService().noticeInsert(notice);
		
		if(result > 0){
			page = "views/notice/noticeList.jsp";
			request.setAttribute("list", new NoticeService().selectList());
			
		} else {
			page = "views/common/errorPage.jsp";
			request.setAttribute("msg", "공지사항 등록 실패");
		}
		
		request.getRequestDispatcher(page).forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
