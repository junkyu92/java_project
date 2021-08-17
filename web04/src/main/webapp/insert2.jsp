<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String title = request.getParameter("title");
    String name = request.getParameter("name");
    String word = request.getParameter("word");
    String kind = request.getParameter("kind");
    String dep = request.getParameter("dep");
    String date = request.getParameter("date");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<hr color="violet">
제목 : <%= title %><br>
글쓴이 : <%= name %><br>
내용 : <%= word %><br>
종류 : <%= kind %><br>
부서 : <%= dep %><br>
날짜 : <%= date %><br>

</body>
</html>