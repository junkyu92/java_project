<%@page import="shop.dto.회원Bag"%>
<%@page import="java.util.ArrayList"%>
<%@page import="shop.db.회원DAO2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    회원DAO2 dao = new 회원DAO2();
    ArrayList<회원Bag> list = dao.read();
    //jsp에서 자동import 단축키 : 클릭후, 컨트롤+쉬프트+m
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%= list%>
</body>
</html>