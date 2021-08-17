<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    Cookie c1 = new Cookie("category", "exercise");
    Cookie c2 = new Cookie("exercise", "soccer");
    response.addCookie(c1);
    response.addCookie(c2);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="page02.jsp">다음페이지로 이동</a>
</body>
</html>