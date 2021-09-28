<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Class.forName("com.mysql.jdbc.Driver");
	out.print("1. driver설정 성공<br>");
	
	String url = "jdbc:mysql://database-2.cpomigmqmax8.us-east-2.rds.amazonaws.com/shop";
	String user = "root";
	String password = "*mega709";
	Connection con = DriverManager.getConnection(url, user, password);
	out.print("2. db연결 설정 성공<br>");
	
	/* String sql = "insert into member values ('rds', 'rds', 'rds', 'rds')";
	PreparedStatement ps = con.prepareStatement(sql);
	out.print("3. sql객체 설정 성공<br>");
	
	ps.executeUpdate();
	out.print("4. sql전송 성공<br>"); */
	
%>
.
</body>
</html>