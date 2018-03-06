<%@page import="javax.swing.text.DefaultEditorKit.CutAction"%>
<%@page import="com.kh.jsp.board.model.dto.PageInfo"%>
<%@page import="com.kh.jsp.board.model.dto.Board"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	ArrayList<Board> list = (ArrayList<Board>)request.getAttribute("list");
	PageInfo pi = (PageInfo)request.getAttribute("pi");
	int listCount = pi.getListCount();
	int currentPage = pi.getCurrentPage();
	int maxPage = pi.getMaxPage();
	int startPage = pi.getStartPage();
	int endPage = pi.getEndPage();
	int limit = pi.getLimit();
%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.outer {
		width: 900px;
		height: 500px;
		background: black;
		color: white;
		margin-left: auto;
		margin-right: auto;
		margin-top: 50px;
	}
	table {
		border: 1px solid white;
		text-align: center;
	}
	.tableArea {
		width: 650px;
		height: 350px;
		margin-left: auto;
		margin-right: auto;
	}
	.searchArea {
		width: 650px;
		margin-left: auto;
	}
</style>
</head>
<body>
	<%@ include file="../common/menubar.jsp" %>
	
	<div class="outer">
		<br>
		<h2 align="center">게시판</h2>
		<div class="tableArea" align="center">
			<table>
				<tr>
					<th width="100px">글번호</th>
					<th width="100px">카테고리</th>
					<th width="300px">글제목</th>
					<th width="100px">작성자수</th>
					<th width="100px">조회수</th>
					<th width="150px">작성일</th>
				</tr>
				<%for(Board b : list){ %>
				<tr>
					
					<td><%=b.getBno() %>
					<input type="hidden" value="<%=b.getBid()%>" name="bid"></td>
					<td><%=b.getcCategory() %></td>
					<td><%=b.getbTitle() %></td>
					<td><%=b.getbWriter() %></td>
					<td><%=b.getbCount() %></td>
					<td><%=b.getbDate() %>
				</tr>
				<%} %>
			</table>
		</div>
		<!-- 페이지 처리 -->
		<% 
				double backNextPageVal = (double)currentPage/limit;
				int backNextpage = ((int)(backNextPageVal-0.9))*limit+1;
				
				double forwardNextPageVal = (double)currentPage/limit;
				int forwardNextpage = ((int)(forwardNextPageVal+0.9))*limit+1;
			/* (((int)((double)currentPage/limit))+0.9)*5-1;  */	
		%>
		<div class="pagingArea" align="center">
			<button onclick="location.href='<%= request.getContextPath()%>/SelectList.bo?currentPage=1'"><<</button>
			<%if(currentPage <= 1) { %>
			<button><</button>
			<%} else { 
				if(backNextpage < 1) {%>
					<button onclick="location.href='<%= request.getContextPath()%>/SelectList.bo?currentPage=1'"><</button>
			<% 	} else {%>
			
					<button onclick="location.href='<%= request.getContextPath()%>/SelectList.bo?currentPage=<%=backNextpage%>'"><</button>
			<%	} %>
			<%} %>
			<%for(int p = startPage; p <= endPage; p++){ 
				if(p == currentPage){
			%>
				<button disabled="disabled"><%=p %></button>
			<%	} else { %>
				<button onclick="location.href='<%= request.getContextPath()%>/SelectList.bo?currentPage=<%=p %>'"><%=p %></button>
			<%	} %>	
			<%} %>
			<%if(currentPage >= maxPage){ %>
			<button disabled="disabled">></button>	
			<%} else { 
				if(forwardNextpage > maxPage) {%>
				<button onclick="location.href='<%= request.getContextPath()%>/SelectList.bo?currentPage=<%= maxPage%>'">></button>
				<% } else { %>
				<button onclick="location.href='<%= request.getContextPath()%>/SelectList.bo?currentPage=<%= forwardNextpage%>'">></button>
				<%} %>
			<%} %> 
			<button onclick="location.href='<%= request.getContextPath()%>/SelectList.bo?currentPage=<%=maxPage%>'">>></button>
		</div>
		<div class="searchArea" align="center">
			<select id="searchCondition" name="searchCondition">
				<option>------</option>
				<option value="category">카테고리</option>
				<option value="writer">작성자</option>
				<option value="title">제목</option>
				<option value="content">내용</option>
			</select>
			<input type="search" name="searchValue">
			<button type="button">검색하기</button>
			<%if(member != null){%>
				<button onclick="location.href='views/board/boardInsertForm.jsp'">작성하기</button>	
			<%} %>
		</div>
		<script type="text/javascript">
			$(function() {
				$(".tableArea td").mouseenter(function () {
					$(this).parent().css({"background":"darkgray","cursor":"pointer"});
				}).mouseout(function() {
					$(this).parent().css("background","black");
				}).click(function() {
					var num = $(this).parent().children().eq(0).text();
					location.href="<%= request.getContextPath()%>/BoardSelectOne.bo?num=" + num;
				});
			});
			
		</script>
	</div>
</body>
</html>