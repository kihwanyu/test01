<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	ArrayList<HashMap<String,Object>> list = (ArrayList<HashMap<String,Object>>)request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.outer {
		width: 1000px;
		height: 700px;
		background: black;
		color: white;
		margin-left: auto;
		margin-right: auto;
		margin-top: 50px; 
	}
	.searchArea {
		width: 420px;
		margin-left: auto;
		margin-right: auto;
	}
	.thumbnailArea {
		width: 760px;
		height: 550px;
		margin-left: auto;
		margin-right: auto;
	}
	.thumb-list {
		width: 220px;
		border: 1px solid white;
		display: inline-block;
		align: center;
		margin: 5px;
	}
	.thumb-list:hover {
		opacity:0.8;
		cursor:pointer;
	}
</style>
</head>
<body>
	<%@ include file="../common/menubar.jsp" %>
	<div class="outer">
		<br>
		<h2 align="center">사진게시판</h2>
		<div class="thumbnailArea" align="center">
		<%for(int i = 0; i < list.size(); i++){ 
			HashMap<String,Object> map = list.get(i);
		%>
		<div class="thumb-list" align="center">
			<input type="hidden" value="<%= map.get("bid")%>" name="bid">
			<div>	
				<img src="<%=request.getContextPath()%>/thumbnail_uploadFiles/<%=map.get("changeName")%>" height="100px" width="100px">
			</div>
			<p>No. <%=map.get("bno") %> <%= map.get("btitle") %>
			<br>조회수 : <%=map.get("bcount") %>
			</p>
		</div>
		
		<%} %>
		</div>
		<script type="text/javascript">
			$(function() {
				$(".thumb-list").click(function() {
					var num = $(this).children().eq(0).val();
					console.log(num);
					
					location.href="<%=request.getContextPath()%>/SelectOne.tn?num=" + num;
					
					
				});
			});
		</script>
		<div class="searchArea">
			<select id="searchCondition" name="sarchCondition">
				<option>----</option>
				<option value="">작성자</option>
				<option>제목</option>
				<option>내용</option>
			</select>
			<input type="search">
			<button type="submit">검색하기</button>
			<%if(member != null){ %>
				<button onclick="location.href='views/thumbnail/thumbnailInsertForm.jsp'">작성하기</button>
			<%} %>
		</div>
	</div>
</body>
</html>