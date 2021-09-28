<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
//JSON : JavaScript Object Notation(자바스크립트에서 대상을 표기하는 방법)
//$.ajax(JSON타입의 입력값)
$(function() {
	$("#b1").click(function() {
		$.ajax({
			url : "ios.jsp",
			success : function(x) {
				$('#result').append(x + '<br>')
			},
			error : function() {
				alert("실패!")
			}
		})
	})
	$("#b2").click(function() {
		$.ajax({
			url : "a.jsp",
			success : function(x) {
				$('#result').append(x + '<br>')
			},
			error : function() {
				alert("실패!")
			}
		})
	})
	$("#b3").click(function() {
		$.ajax({
			url : "b.jsp",
			success : function(x) {
				$('#result').append(x + '<br>')
			},
			error : function() {
				alert("실패!")
			}
		})
	})
})
</script>
</head>
<body>
<button id="b1">AJax Test1</button><br>
<button id="b2">AJax Test2</button><br>
<button id="b3">AJax Test3</button><br>
ajax 실행 결과는 <div id = "result"></div>

</body>
</html>