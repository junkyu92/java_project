<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
$(function() {
	$("#b1").click(function() {
		wordVal = $("#word").val()
		$.ajax({
			url : "test.jsp",
			data : {
				word : wordVal
			},
			success: function(x) {
				$("#d1").html(x)
			},
			error: function() {
				alert('test.jsp 호출 실패!!')
			}
		})
	})
	$("#b2").click(function() {
		moneyVal = $("#money").val()
		payVal = $("#pay").val()
		$.ajax({
			url:"money.jsp",
			data:{
				money : moneyVal,
				pay : payVal
			},
			success: function(x) {
				$("#d1").html(x)
			},
			error: function() {
				alert('호출 실패!!')
			}
		})
	})
	$("#b3").click(function() {
		userVal = $("#user").val()
		$.ajax({
			url : "user.jsp",
			data : {
				user:userVal
			},
			success: function(x) {
				$("#d1").html(x)
			},
			error: function() {
				alert('호출 실패!!')
			}
		})
	})
	$("#b4").click(function() {
		telVal = $("#tel").val()
		$.ajax({
			url : "tel.jsp",
			data : {
				tel:telVal
			},
			success: function(x) {
				$("#d1").html(x)
			},
			error: function() {
				alert('호출 실패!!')
			}
		})
	})
})
</script>
</head>
<body>
<h3>비동기 통신</h3>
<hr>
ajax 테스트 : <input id="word"> <button id="b1">ajax 테스트 (test.jsp)</button><br>
결제금액 : <input id="money"><br>
1)계좌이체, 2)신용카드, 3)휴대폰결제
결제수단 : <input id="pay"> <button id="b2">결제하기</button>
<hr color="red">
회원가입할 id입력: <input id="user"> <button id="b3">회원가입시 id중복 체크</button>
<hr color="red">
인증받을 전화번호 입력: <input id="tel"> <button id="b4">인증번호 받기</button>
<hr color="green">
<div id="d1"></div>
</body>
</html>