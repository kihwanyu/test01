<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.outer {
		width: 1000px;
		height: 650px;
		background: black;
		color: white;
		margin-left: auto;
		margin-right: auto;
		margin-top: 50px;
	}
	table {
		border: 1px solid white;
	}
	.insertArea {
		width: 500px;
		height: 450px;
		margin-left: auto;
		margin-right: auto;	
	}
	#titleImgArea {
		width: 350px;
		height: 200px;
		border: 2px dashed darkgray;
		text-align: center;
		display: table-cell;
		vertical-align: middle;
	}
	#titleImgArea:hover {
		cursor: pointer;
	}
	#contentImgArea1:hover, #contentImgArea2:hover, #contentImgArea3:hover {
		cursor: pointer;
	}
	#contentImgArea1, #contentImgArea2, #contentImgArea3 {
		width: 150px;
		height: 100px;
		border: 2px dashed darkgray;
		text-align: center;
		display: table-cell;
		vertical-align: middle;
	}
	#btnArea {
		width: 150px;
		margin-left: auto;
		margin-right: auto;
	}
</style>
</head>
<body>
	<%@ include file="../common/menubar.jsp" %>
	<% if(member != null) {%>
		<div class="outer">
			<br>
			<h2>사진게시판 작성</h2>
			<form action="<%=request.getContextPath()%>/Insert.tm" method="post" encType="multipart/form-data"> 
				<div class="insertArea" align="center">
					<table>
						<tr>
							<td width="100%">제목</td>
							<td><input type="text" size="45" name="title"></td>
						</tr>
						<tr>
							<td>대표 이미지</td>
							<td>
								<div id="titleImgArea">
									<img id="titleImg" alt="" src="" width="350" height="200">
								</div>		
							</td>
						</tr>
						<tr>
							<td>내용사진</td>
							<td>
								<div id="contentImgArea1">
									<img id="contentImg1" alt="" src="" width="120" height="100">
								</div>	
								<div id="contentImgArea2">
									<img id="contentImg2" alt="" src="" width="120" height="100">
								</div>	
								<div id="contentImgArea3">
									<img id="contentImg3" alt="" src="" width="120" height="100">
								</div>
							</td>
						</tr>
						<tr>
							<td>사진메모</td>
							<td>
								<textarea rows="5" cols="50" style="resize: none;" name="content"></textarea>
							</td>
						</tr>
					</table>
					<div id="fileArea">
						<input type="file" id="thumbnail1" name="thumbnailImg1" onchange="LoadImg1(this);">
						<input type="file" id="thumbnail2" name="thumbnailImg2" onchange="LoadImg2(this);">
						<input type="file" id="thumbnail3" name="thumbnailImg3" onchange="LoadImg3(this);">
						<input type="file" id="thumbnail4" name="thumbnailImg4" onchange="LoadImg4(this);">
					</div>
					<div class="btnArea">
						<button>취소하기</button>
						<button type="submit">작성완료</button>
					</div>
				</div>
			</form>
		</div>
		<script type="text/javascript">
			$(function() {
				$("#fileArea").hide();
				$("#titleImgArea").click(function () {
					$("#thumbnail1").click();
				});
				$("#contentImgArea1").click(function () {
					$("#thumbnail2").click();
				});
				$("#contentImgArea2").click(function () {
					$("#thumbnail3").click();
				});
				$("#contentImgArea3").click(function () {
					$("#thumbnail4").click();
				});
			});
			function LoadImg1(value) {
				if(value.files && value.files[0]){
					var reader = new FileReader();
					reader.onload = function(e) {
						$("#titleImg").attr("src", e.target.result);
					}
					reader.readAsDataURL(value.files[0]);
				}
			}
			function LoadImg2(value) {
				if(value.files && value.files[0]){
					var reader = new FileReader();
					reader.onload = function(e) {
						$("#contentImg1").attr("src", e.target.result);
					}
					reader.readAsDataURL(value.files[0]);
				}
			}
			function LoadImg3(value) {
				if(value.files && value.files[0]){
					var reader = new FileReader();
					reader.onload = function(e) {
						$("#contentImg2").attr("src", e.target.result);
					}
					reader.readAsDataURL(value.files[0]);
				}
			}
			function LoadImg4(value) {
				if(value.files && value.files[0]){
					var reader = new FileReader();
					reader.onload = function(e) {
						$("#contentImg3").attr("src", e.target.result);
					}
					reader.readAsDataURL(value.files[0]);
				}
			}
		</script>
	<%} else { 
		request.setAttribute("msg", "잘못된 경로입니다.");
		request.getRequestDispatcher("../common/errorPage.jsp").forward(request, response);
	} %>
</body>
</html>