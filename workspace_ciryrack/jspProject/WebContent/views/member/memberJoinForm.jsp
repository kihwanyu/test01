<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<style type="text/css">
	.outer {
		width: 600px;
		height: 500px;
		background: black;
		color: white;
		margin-top: 50px;
		margin-left: auto;
		margin-right: auto;
	}
	#idCheck, #ckZip, #goMain, #joinBtn {
		background: orangered;
		border-radius: 5px;
		width: 150px;
		height: 25px;
		text-align: center;
	}
	#idCheck:hover, #ckZip:hover,
	#goMain:hover, #joinBtn:hover {
		cursor: pointer;
	}
	td {
		text-align: right;
	}
	
	#ckZip, #joinBtn {
		background: yellowgreen;
	}	
	#joinBtn, #goMain {
		display: inline-block;
	}
</style>
</head>
<body>
	<%@ include file="../common/menubar.jsp" %>
	
	<div class="outer">
		<br>
		<h2 align="center">회원가입</h2>
		<form id="joinForm" action="<%=request.getContextPath()%>/InsertMember.do" method="post">
			<table align="center">
			<tr>
				<td width="200px">*아이디</td>
				<td><input type="text" maxlength="15" name="userId"></td>
				<td width="200px"><div id="idCheck">중복확인</div></td>
			</tr>
			<tr>
				<td width="200px">*비밀번호</td>
				<td><input type="password" maxlength="15" name="userPwd"></td>
				<td width="200px"></td>
			</tr>
			<tr>
				<td width="200px">*비밀번호 확인</td>
				<td><input type="password" maxlength="15" name="userPwd2"></td>
				<td width="200px"><label id="pwdResult"></label></td>
			</tr>
			<tr>
				<td width="200px">*닉네임</td>
				<td><input type="text" maxlength="5" name="nicName"></td>
				<td width="200px"><label id="nnResult"></label></td>
			</tr>
			<tr>
				<td width="200px">연락처</td>
				<td><input type="text" maxlength="3" name="tel1" size="2">-
				<input type="text" maxlength="4" name="tel2" size="2">-
				<input type="text" maxlength="4" name="tel3" size="2"></td>
				<td width="200px"></td>
			</tr>
			<tr>
				<td width="200px">email</td>
				<td><input type="email" maxlength="20" name="email"></td>
				<td width="200px"></td>
			</tr>	
			<tr>
				<td width="200px">우편번호</td>
				<td><input type="text" id="sample6_postcode" placeholder="우편번호" name="zipcode"></td>
				<td width="200px"><div id="ckZip" onclick="sample6_execDaumPostcode();">우편번호 찾기</div></td>
			</tr>
			<tr>
				<td width="200px">주소</td>
				<td><input type="text" id="sample6_address" placeholder="주소" name="address1"></td>
				<td width="200px"></td>
			</tr>
			<tr>
				<td width="200px">상세주소</td>
				<td><input type="text" id="sample6_address2" placeholder="상세주소" name="address2"></td>
				<td width="200px"></td>
			</tr>
			<tr>
				<td width="200px">관심분야</td>
				<td>
					<input type="checkbox" id="sports" name="interest" value="운동">
					<label for="sports">운동</label>
					<input type="checkbox" id="movie" name="interest" value="영화">
					<label for="movie">영화</label>
					<input type="checkbox" id="cook" name="interest" value="요리">
					<label for="cook">요리</label>
					<input type="checkbox" id="game" name="interest" value="게임">
					<label for="game">게임</label>
					<input type="checkbox" id="etc" name="interest" value="기타">
					<label for="tec">기타</label>
				</td>
			</tr>
			</table>
			<div align="center">
				<div id="goMain" onclick="goMain();">메인으로</div>
				<div id="joinBtn" onclick="insertMember();">가입하기</div>
			</div>
		</form>
		<script type="text/javascript">
			function insertMember() {
				$("#joinForm").submit();
			}
			function goMain() {
				location.href = "<%= request.getContextPath()%>/index.jsp";
			}
		
		    function sample6_execDaumPostcode() {
		        new daum.Postcode({
		            oncomplete: function(data) {
		                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.
		
		                // 각 주소의 노출 규칙에 따라 주소를 조합한다.
		                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
		                var fullAddr = ''; // 최종 주소 변수
		                var extraAddr = ''; // 조합형 주소 변수
		
		                // 사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
		                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
		                    fullAddr = data.roadAddress;
		
		                } else { // 사용자가 지번 주소를 선택했을 경우(J)
		                    fullAddr = data.jibunAddress;
		                }
		
		                // 사용자가 선택한 주소가 도로명 타입일때 조합한다.
		                if(data.userSelectedType === 'R'){
		                    //법정동명이 있을 경우 추가한다.
		                    if(data.bname !== ''){
		                        extraAddr += data.bname;
		                    }
		                    // 건물명이 있을 경우 추가한다.
		                    if(data.buildingName !== ''){
		                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
		                    }
		                    // 조합형주소의 유무에 따라 양쪽에 괄호를 추가하여 최종 주소를 만든다.
		                    fullAddr += (extraAddr !== '' ? ' ('+ extraAddr +')' : '');
		                }
		
		                // 우편번호와 주소 정보를 해당 필드에 넣는다.
		                document.getElementById('sample6_postcode').value = data.zonecode; //5자리 새우편번호 사용
		                document.getElementById('sample6_address').value = fullAddr;
		
		                // 커서를 상세주소 필드로 이동한다.
		                document.getElementById('sample6_address2').focus();
		            }
		        }).open();
		    }
		</script>
	</div>
</body>
</html>