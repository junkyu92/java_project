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
function push() {
	n1Val = Number($('#n1').val())
	n2Val = Number($('#n2').val())
	arr = [n1Val, n2Val]
	return arr;
}
$(function() {
	$('#b1').click(function() {
		arr2 = push()
		result = plus(arr2[0], arr2[1])
		alert(result)
	})
	$('#b2').click(function() {
		arr2 = push()
		result = minus(arr2[0], arr2[1])
		alert(result)
	})
	$('#b3').click(function() {
		arr2 = push()
		result = mul(arr2[0], arr2[1])
		alert(result)
	})
	$('#b4').click(function() {
		arr2 = push()
		result = div(arr2[0], arr2[1])
		alert(result)
	})
})
</script>
</head>
<body>
숫자1	: <input id="n1"> <br>
숫자2	: <input id="n2"> <br>
<button id="b1" class="cal">더하기</button>
<button id="b2" class="cal">빼기</button>
<button id="b3" class="cal">곱하기</button>
<button id="b4" class="cal">나누기</button>
</body>
</html>