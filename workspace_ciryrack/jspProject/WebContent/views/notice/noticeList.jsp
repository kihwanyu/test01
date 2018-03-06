<%@page import="java.util.ArrayList"%>
<%@page import="com.kh.jsp.notice.model.dto.Notice"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	ArrayList<Notice> list = (ArrayList<Notice>)request.getAttribute("list");	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<style type="text/css">
	.outer {
		width: 800px;
		height: 500px;
		background: black;
		color: white;
		margin-left: auto;
		margin-right: auto;
		margin-top: 50px
	}
	table {
		border: 1px solid white;
		text-align: center;
	}
	.tableArea {
		width: 600px;
		height: 350px;
		margin-left: auto;
		margin-right: auto;
	}
	.searchArea {
		width: 650px;
		margin-left: auto;
		margin-right: auto;
	}	
</style>
</head>
<body>
	<%@ include file="../common/menubar.jsp" %>
	<div class="outer">
		<br>
		<h2 align="center">공지사항</h2>
		<table align="center" id="listArea">
			<tr>
				<th>글번호</th>
				<th width="300px">글제목</th>
				<th width="100px">작성자</th>
				<th >조회수</th>
				<th width="100px">작성일</th>
			</tr>
			<%for(Notice n : list){ %>
			<tr>
				<td><%=n.getNno() %></td>
				<td><%=n.getnTitle() %></td>
				<td><%=n.getNWRITER() %></td>
				<td><%=n.getNCOUNT() %></td>
				<td><%=n.getNDATE() %></td>
			</tr>
			<%} %>
		</table>
		<div class="searchArea" align="center">
			<select id="searchCondition" name="searchCondition">
				<option value="writer">작성자</option>
				<option value="title">제목</option>
				<option value="content">내용</option>
			</select>
			<input type="search" name="searchValue">
			<button type="button">검색하기</button>
			<% if(member != null && member.getUser_id().equals("admin")) { %>
				<button onclick="location.href='views/notice/noticeInsertForm.jsp'">작성하기</button>
			<%} %>
		</div>
	</div>
	<script type="text/javascript">
		$(function() {
			$("#listArea td").mouseenter(function () {
				$(this).parent().css({"background":"darkgray","cursor":"pointer"});
			}).mouseout(function() {
				$(this).parent().css("background","black");
			}).click(function() {
				var num = $(this).parent().children().eq(0).text();
				console.log(num);
				location.href="<%= request.getContextPath()%>/selectOne.no?num=" + num;
			})
		});
	</script>
</body>
</html>