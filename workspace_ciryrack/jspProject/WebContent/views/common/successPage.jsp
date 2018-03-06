<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% String msg = (String)request.getAttribute("msg"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center"><%=msg %></h1>
	<div><button onclick="goMain();">메인으로가기</button></div>
	<script type="text/javascript">
	function goMain() {
		location.href = "<%= request.getContextPath()%>/index.jsp";
	}
	</script>
</body>
</html>