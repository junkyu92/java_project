<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	Cookie[] cookies = request.getCookies();
    	for(Cookie c: cookies){
    		if(!c.getName().equals("JSESSIONID")){
    			out.print(c.getName() + ": " + c.getValue() + "<br>");
    		}
    	}
    		
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="page03.jsp">다음페이지로 이동</a>
</body>
</html>