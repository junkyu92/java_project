<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    String id = request.getParameter("id");
    String pw = request.getParameter("pw");
    String id2 = "root";
    String pw2 = "pass";
    String result = "로그인 실패!!!";
    if(id.equals(id2) && pw.equals(pw2)) {
    	result ="로그인 성공!!!";
    }
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전송받은 정보 출력</title>
</head>
<body>
id: <%= id %><br>
pw: <%= pw %><br>
<hr>
<%= result %>
</body>
</html>