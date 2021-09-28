<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
결제 페이지 
<form action="pay.do">
	payid:<input name="payid"><br>
	memid:<input name="memid"><br>
	pay_data:<input name="pay_data"><br>
	pay_datetime:<input name="pay_datetime"><br>
	pay_total:<input name="pay_total"><br>
<button>결제</button>
</form>
<hr>
<form action="pay.one">
	payid:<input name="payid"><br>
<button>결제내용 검색</button>
</form>
</body>
</html>