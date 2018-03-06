<%@page import="com.kh.jsp.member.model.dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<%
	Member member = (Member)session.getAttribute("member");
	System.out.println(member);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<style type="text/css">
	body {
		background: url("/jspProject/image/city1.PNG") no-repeat;
		background-size: cover;
	}
	.btns {
		align: center;
	}
	#loginBtn, #memberJoinBtn{
		display: inline-block;
		vertical-align: middle;
		text-align: center;
		background: orangered;
		color: white;
		height: 25px;
		width: 100px;
		border-radius: 5px;
	}
	
	#memberJoinBtn {
		background: yellowgreen;
	}
	
	#loginBtn:hover, #memberJoinBtn:hover, #logoutBtn:hover, #changeInfo:hover{
		cursor: pointer;
	}
	.loginArea > form, #userInfo {
		float:right;
	}
	.wrap {
		background: black;
		width: 100%;
		height: 50px;
	}
	.menu {
		background: black;
		color: white;
		text-align: center;
		vertical-align: middle;
		width: 150px;
		height: 50px;
		display: table-cell;
	}
	.nav {
		width: 600px;
		margin-left: auto;
		margin-right: auto;
	}
	.menu:hover {
		background: darkgray;
		color:orange;
		font-weight: bold;
		cursor: pointer;
	}
	#logoutBtn, #changeInfo {
		background: orangered;
		color:white;
		text-decoration: none;
		border-radius: 5px;
	}
	#changeInfo {
		background: yellowgreen;
	}
</style>
</head>
<body>
	<h1 align="center">Welcome JSP World</h1>
	
	<div class="loginArea">
	<% if(member == null){ %>
		<form action="<%=request.getContextPath() %>/login.do" id="loginForm" method="post">
			<table>
				<tr>
					<td><label class="text">ID : </label></td>
					<td><input type="text" name="userId"></td>
				</tr>
				<tr>
					<td><label class="text">PWD : </label></td>
					<td><input type="password" name="userPwd"></td>
				</tr>
				
			</table>
			<div class="btns" align="center">
				<div id="memberJoinBtn" onclick="memberJoin();">회원가입</div>
				<div id="loginBtn" onclick="login();">로그인</div>	
			</div>
		</form>	
	<%} else { %>
		<div id="userInfo">
			<label><%= member.getNick_name() %> 님의 방문을 환영합니다.</label>
			<div class="btns">
				<div id="changeInfo" onclick="">정보수정</div>
				<div id="logoutBtn" onclick="logout();">로그아웃</div>
			</div>
		</div>
	<%} %>
	</div>
	<br clear="both">
	<div class="wrap">
		<div class="nav">
			<div class="menu" onclick="goHome();">HOME</div>
			<div class="menu" onclick="goNotice();">공지사항</div>
			<div class="menu" onclick="goBoard();">게시판</div>
			<div class="menu" onclick="goTumbnail();">사진게시판</div>
		</div>
	</div>
	<script type="text/javascript">
	function login() {
		$('#loginForm').submit();
		//로그인폼의 submit 기능.
	}
	function logout() {
		location.href ="<%=request.getContextPath()%>/Logout.do";
	}
	function memberJoin() {
		location.href ="/jspProject/views/member/memberJoinForm.jsp";
	}
	function goHome() {
		location.href="/jspProject/index.jsp";
	}
	function goNotice() {
		location.href="/jspProject/selectList.no";
	}
	function goBoard() {
		location.href="/jspProject/SelectList.bo";
	}
	function goTumbnail() {
		location.href="<%=request.getContextPath()%>/SelectList.tn";
	}
	</script>
	
</body>
</html>