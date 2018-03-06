package com.kh.jsp.board.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.jsp.board.model.dto.Attachment;
import com.kh.jsp.board.model.dto.Board;
import com.kh.jsp.board.model.service.BoardService;

/**
 * Servlet implementation class SelectOneServlet
 */
@WebServlet("/SelectOne.tn")
public class SelectOneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectOneServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num = Integer.parseInt(request.getParameter("num"));
		
		HashMap<String, Object> hmap = new BoardService().selectTumbnailMap(num);
		 
		Board b = (Board)hmap.get("board");
		ArrayList<Attachment> fileList = (ArrayList<Attachment>)hmap.get("attachment");
		String page = "";
		
		if(hmap != null){
			page = "views/thumbnail/thumbnailDetatail.jsp";
			request.setAttribute("b", b);
			request.setAttribute("fileList", fileList);
		} else {
			page = "views/common/errorPage.jsp";
			request.setAttribute("msg", "사신 게시판 상세 보기 에러!");
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
