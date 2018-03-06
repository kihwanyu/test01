package com.kh.jsp.board.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.jsp.board.model.dto.Board;
import com.kh.jsp.board.model.service.BoardService;
import com.kh.jsp.member.model.dto.Member;

/**
 * Servlet implementation class InsertBoardServlet
 */
@WebServlet("/InsertBoard.bo")
public class InsertBoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertBoardServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String category = request.getParameter("category");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		Member member = (Member)request.getSession().getAttribute("member");
		String writer = String.valueOf(member.getUno());
		
		int result = 0;
		String page = "";
		Board b = new Board(category,title,content,writer);
		
		result = new BoardService().boardInsert(b);
		
		if(result > 0){
			response.sendRedirect(request.getContextPath()+"/SelectList.bo");
			/*page = "views/board/boardList.jsp";
			request.setAttribute("list", new BoardService().selectBoardList());*/
		} else {
			page = "views/common/errorPage.jsp";
			request.setAttribute("msg", "게시판 등록 실패 에러");
			request.getRequestDispatcher(page).forward(request, response);
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
