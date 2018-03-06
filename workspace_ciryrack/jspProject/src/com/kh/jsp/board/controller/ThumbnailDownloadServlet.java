package com.kh.jsp.board.controller;

import java.awt.Button;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.jsp.board.model.dto.Attachment;
import com.kh.jsp.board.model.dto.Board;
import com.kh.jsp.board.model.service.BoardService;

/**
 * Servlet implementation class ThumbnailDownloadServlet
 */
@WebServlet("/Download.tn")
public class ThumbnailDownloadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThumbnailDownloadServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num = Integer.parseInt(request.getParameter("num"));
		
		System.out.println(num);
		
		Attachment file = new BoardService().selectOneAttachment(num);
		
		System.out.println(file);
		
		//폴더에서 파일을 읽을 스트림 생성
		BufferedInputStream buf = null;
		
		//클라이언트로 내보낼 출력 스트림 생성
		ServletOutputStream downOut = null;
		
		downOut = response.getOutputStream();
		
		//스트림으로 전송할 파일 객체 생성
		File downFile = new File(file.getFilePath() + file.getChangeName());
		
		//한글 파일명에 대한 인코딩 처리
		response.setContentType("text/plane; charset=utf-8");
		
		//강제적으로 다운로드 처리
		response.setHeader("Content-Disposition", "attachment; filename=\"" + new String(file.getChangeName().getBytes("UTF-8"), "ISO-8859-1") + "\"");
		
		response.setContentLength((int)downFile.length());
		
		//파일에 대한 스트림 생성
		FileInputStream fin = new FileInputStream(downFile);
		
		buf = new BufferedInputStream(fin);
		
		int readBytes = 0;
		
		while((readBytes = buf.read()) != -1){
			downOut.write(readBytes);
		}
		
		downOut.close();
		buf.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
