package com.kh.jsp.notice.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.jsp.notice.model.dto.Notice;
import com.kh.jsp.notice.model.service.NoticeService;

/**
 * Servlet implementation class UpdateNoitceServlet
 */
@WebServlet("/UpdateNoitce.no")
public class UpdateNoitceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateNoitceServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		int nno = Integer.parseInt(request.getParameter("nno"));
		int result = 0;
		String page = "";
		System.out.println("title : " + title);

		System.out.println("content : " + content);

		System.out.println("nno : " + nno);
		
		Notice n = new Notice(nno, title, content);
		
		result = new NoticeService().noticeUpdate(n);
		
		if(result > 0){
			page = "views/notice/noticeDetail.jsp";
			request.setAttribute("notice", new NoticeService().seletOne(String.valueOf(nno)));
		} else {
			page = "views/common/errorPage.jsp";
			request.setAttribute("msg", "공지사항 업데이트 실패");
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
