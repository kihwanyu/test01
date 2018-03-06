<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.background  {
		width: 100%;
		height: 600px;
	}
	.tile {
		width: 150px;
		height: 150px;
		background: black;
		display: inline-block;
		color: white;
	}
	.first-line {
		margin-top: 10%;
	}
	.tile1 {
		background: darkgray;
	}
	.notile {
		visibility: hidden;
	}
	.tile-menu:hover {
		background: orangered;
		color:white;
		cursor: pointer;
	}
</style>
</head>
<body>
	<%@include file="views/common/menubar.jsp" %>
	<div class="background" align="center">
		<div class="first-line">
			<div class="tile tile-menu"></div>
			<div class="tile tile1"></div>
			<div class="tile tile-menu"></div>
			<div class="tile notile"></div>
			<div class="tile tile1"></div>
		</div>
		<div class="second-line">
			<div class="tile notile"></div>
			<div class="tile tile1"></div>
			<div class="tile notile"></div>
			<div class="tile tile1"></div>
			<div class="tile tile-menu"></div>
		</div>
	</div>
</body>
</html>