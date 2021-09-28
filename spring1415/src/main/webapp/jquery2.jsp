<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/out2.js"></script>
<script type="text/javascript">
	function cal(x) {
		n1Val = Number(document.getElementById("n1").value)
		n2Val = Number(document.getElementById("n2").value)
		if(x == 1){
			result = plus(n1Val, n2Val)
			alert(result)
		}else if (x == 2) {
			result = minus(n1Val, n2Val)
			alert(result)
		}else if (x == 3) {
			result = mul(n1Val, n2Val)
			alert(result)
		}else if (x == 4) {
			result = div(n1Val, n2Val)
			alert(result)
		}
	}	
</script>
</head>
<body>
숫자1	: <input id="n1"> <br>
숫자2	: <input id="n2"> <br>
<button onclick="cal(1)">더하기</button>
<button onclick="cal(2)">빼기</button>
<button onclick="cal(3)">곱하기</button>
<button onclick="cal(4)">나누기</button>
</body>
</html>