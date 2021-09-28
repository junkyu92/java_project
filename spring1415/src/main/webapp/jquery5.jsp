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
		$("#result").append('- ' + wordVal + '<br>')
	})
	$("#b2").click(function() {
		imgVal = $("#img").val()
		img = '<img src="' + imgVal +'" width="300" height="300">'
		$("#result").append(img + '<br>')
	})
	$("#b3").click(function() {
		wordVal = $("#word").val()
		imgVal = $("#img").val()
		img = '<img src="' + imgVal +'" width="300" height="300">'
		$("#result").append(img + '<br>' + wordVal + '<br>')
	})
})
</script>
</head>
<body>
댓글 : <input id="word"><br>
이미지 : <input id="img"><br>
<button id = "b1">댓글추가</button><br>
<button id = "b2">이미지추가</button><br>
<button id = "b3">댓글+이미지추가</button><br>
<hr>
<div id="result"></div>

</body>
</html>