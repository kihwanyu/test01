<%@page import="com.kh.jsp.notice.model.dto.Notice"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Notice notice = (Notice)request.getAttribute("notice");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.outer {
		width: 800px;
		height: 500px;
		background: black;
		margin-left: auto;
		margin-right: auto;
		margin-top: 50px;
		color: white;
	}
	table {
		border: 1px solid white;
		
	}
	.tableArea{
		width: 450px;
		height: 350px;
		margin-left: auto;
		margin-right: auto;
	}
</style>
</head>
<body>
	<%@ include file="../common/menubar.jsp" %>
	<% if(member != null && member.getUser_id().equals("admin")){ %>
	<div class="outer">
		<br>
		<h2 align="center">공지 사항 수정</h2>
		<div class="tableArea" align="center">
			<form id="updateForm" method="post">
				<table>
					<tr>
						<td>제목</td>
						<td colspan="3"><input type="text" size="50" name="title" value="<%=notice.getnTitle()%>"> 
						<input type="hidden" name="nno" value="<%=notice.getNno()%>"></td>
						
					</tr>
					<tr>
						<td>작성자</td>
						<td><input type="text" value="<%=notice.getNWRITER()%>" readonly="readonly"> </td>
						<td>작성일</td>
						<td><input type="date" value="<%=notice.getNDATE()%>" name="date"> </td>
					</tr>
					<tr>
						<td>내용</td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td colspan="4">
							<textarea rows="15" cols="60" name="content"><%=notice.getnContent() %></textarea>
						</td>
					</tr>
				</table>
				<br>
				<div align="center">
					<button onclick="complet();">작성완료</button>
					<button onclick="deleteNotice();">삭제하기</button>
				</div>	
			</form>
			<script type="text/javascript">
				function complet() {
					$("#updateForm").attr("action", "<%=request.getContextPath()%>/UpdateNoitce.no");
				}
				function deleteNotice() {
					$("#updateForm").attr("action", "<%=request.getContextPath()%>/DeleteNoitce.no");
				}
			</script>
				
		</div>
	</div>	
	<%} else {
		request.setAttribute("msg", "잘못된경로로 접근하셨습니다.");
		request.getRequestDispatcher("../common/errorPage.jsp").forward(request, response);
	} %>
</body>
</html>