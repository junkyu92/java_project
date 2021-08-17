<%@page import="java.util.ArrayList"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="shop.db.회원DAO2"%>
<%@page import="shop.dto.회원Bag"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String id = request.getParameter("id");
    
    회원Bag bag = new 회원Bag();
    bag.setId(id);
    
    회원DAO2 dao = new 회원DAO2();
    회원Bag bag2 = dao.read(bag);
    
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
아이디: <%= bag2.getId() %><br>
비밀번호: <%= bag2.getPw() %><br>
이름: <%= bag2.getName() %><br>
전화번호: <%= bag2.getTel() %><br>
</body>
</html>