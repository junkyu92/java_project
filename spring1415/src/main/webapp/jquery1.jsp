<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/out.js"></script>
<script type="text/javascript">
	function push() {
		n1Val = Number(document.getElementById("n1").value)
		n2Val = Number(document.getElementById("n2").value)
		result = add(n1Val, n2Val)
		alert(result)
	}
	function go() {
		siteVal = document.getElementById("site").value
		site(siteVal)
	}
</script>
</head>
<body>
숫자1	: <input id="n1"> <br>
숫자2	: <input id="n2"> <br>
<button onclick="push()">두 수를 더하자.</button>
<hr>
가고싶은사이트(naver, google) : <input id="site"><br>
<button onclick="go()">사이트로 이동!!</button>


</body>
</html>