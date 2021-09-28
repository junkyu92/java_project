<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript" src="resources/js/out2.js"></script>
<script type="text/javascript">

$(function() {
	$("#b1").click(function() {
		userVal = $("#user").val()
		if(userVal.length >= 5){
			$("#result").html("유효한 id")
		}else {
			$("#result").html("<font color='red'>유효하지 않은 id</font>")
			$("#user").val("")
		}
	})
	$("#b2").click(function() {
		pw1Val = $("#pw1").val()
		pw2Val = $("#pw2").val()
		if(pw1Val == pw2Val){
			$("#result").html("동일한 pw")
		}else {
			$("#result").html("<font color='red'>동일하지 않은 pw</font>")
			$("#pw1").val("")
			$("#pw2").val("")
		}
	})
})
</script>
</head>
<body>
아이디 입력 : <input id="user"> <br> <button id = "b1">아이디 유효성 검사</button><br>
비밀번호1 : <input id="pw1"> <br>
비밀번호2 : <input id="pw2"> <br> <button id = "b2">암호 유효성 검사</button><br>
<hr>
<div id="result"></div>
</body>
</html>