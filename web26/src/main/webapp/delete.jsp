<%@page import="shop.dto.회원Bag"%>
<%@page import="shop.db.회원DAO2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String id = request.getParameter("id");
    
    	회원Bag bag = new 회원Bag();
    	bag.setId(id);
    	
    	회원DAO2 dao = new 회원DAO2();
    	dao.delete(bag);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%= id %>삭제완료
</body>
</html>