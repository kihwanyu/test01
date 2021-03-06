<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script defer src="https://use.fontawesome.com/releases/v5.0.6/js/all.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<style>
	@import url("css/common.css");
	.searchArea {
		width: 30%;
		height: 300px;
		margin-left: auto;
		margin-right: auto;
		margin-top: 100px;
		margin-bottom: 100px;
		vertical-align: middle;
		border: 2px solid gray;
	}
	h2 {
		margin-left: auto;
		margin-right: auto;
		margin-bottom: 50px;
		margin-top: 50px;
	}
	.searchForm {
		margin-left: auto;
		margin-right: auto;
		margin-bottom: 50px;
		margin-top: 50px;
	}
	.searchTest{
		margin-left: auto;
		margin-right: auto;
		width: 290px;
		margin-bottom: 30px;
	}
</style>
<title>회원 관리</title>
</head>
<body>
	<%@ include file="/views/admin/common/header.jsp" %>
	<section>
		<div class="searchArea" align="center">
				<h2>결제 정보 검색</h2>
				<div class="searchForm">
					<form action="" method="get" >
						<div class="searchTest">
							<label for="searchTest" style="margin-bottom: 10px;">주문번호 : </label>
							<input type="search" class="form-control" id="searchTest" name="searchText" id="searchText">
						</div>	
						<input type="button" class="btn btn-primary active" value="검색" onclick="location.href='<%=request.getContextPath() %>/views/admin/admin_paymentDetails.jsp'">
					</form>
				</div>				
		</div>
	</section>
	<%@ include file="/views/admin/common/footer.jsp" %>
</body>
</html>