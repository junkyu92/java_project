<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    int views = (int)session.getAttribute("views");
    views ++;
    session.setAttribute("views", views);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="page05.jsp">다음페이지로 이동</a>
</body>
</html>