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
		food1Val = $("#food1").val()
		food2Val = $("#food2").val()
		$.ajax({
			url : "b1.jsp",
			data : {
				food1:food1Val,
				food2:food2Val
			},
			success: function(x) {
				$("#d1").append(x + "<br>")
			},
			error: function() {
				alert('호출 실패!!')
			}
		})
	})
	$("#b2").click(function() {
		tempVal = $("#temp").val()
		dayVal = $("#day").val()
		$.ajax({
			url : "b2.jsp",
			data : {
				temp:tempVal,
				day:dayVal
			},
			success: function(x) {
				$("#d1").append(x + "<br>")
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
먹고 싶은 음식: <input id="food1"> <br>
먹기 싫은 음식: <input id="food2"> <br>
<button id="b1">결과</button><br>
<hr>
오늘의 온도는 : <input id="temp"> <br>
오늘은 무슨 요일인가 : <input id="day"> <br>
<button id="b2">결과</button><br>

<div id="d1"></div>
</body>
</html>