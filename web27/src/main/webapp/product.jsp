<%@page import="shop.db.ProductDAO"%>
<%@page import="shop.dto.ProductDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/out.css">
</head>
<body>
<div id="total">
	<div id="top">
		<jsp:include page="top.jsp"></jsp:include>
	</div>
	<div id="top2">
		<jsp:include page="top2.jsp"></jsp:include>
	</div>
	<div id="center">
		<h3>제품 검색</h3> 
		<form action="read3.jsp">
		제품명:<input name="id"><br>
		<button>검색</button>
		</form>
		<hr>
		<h3><a href="all3.jsp">제품 목록</a></h3>
	</div>
	
</div>

</body>
</html>