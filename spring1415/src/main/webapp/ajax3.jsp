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
	$('#b3').click(function() {
		userValue = $('#user').val() // "apple"
		$.ajax({
			url : "check2.mega",
			data : {
				id : userValue
			},
			success : function(result) {
				$('#d1').append(result + "<br>")
			}, //success
			error : function() {
				alert('user.jsp 호출 실패!!')
			}//error
		}) //ajax
	}) //b3
}) //$
</script>
</head>
<body style="background: pink">
	회원가입할 id입력 : <input id="user"> 
	<button id="b3">회원가입시 id중복 체크(user.jsp)</button>
	<hr color="green">
	<div id="d1"></div>
</body>
</html>