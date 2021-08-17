<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   
<!-- 1.서버로 전송된 데이터를 받아야 함. -->
<%
	//자바 코드 써줌.
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String tel = request.getParameter("tel");
%>


<!-- 2.db에 넣어야함 -->
<!-- 3.db처리가 잘 되었는지 확인하는 메시지를 클라이언트에 보내주어야 함. -->
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
회원 정보가 잘 도착하였음.<br>
서버에 도착한 아이디는 <%= id %> <br>
서버에 도착한 패스워드는 <%= pw %> <br>
서버에 도착한 이름은 <%= name %> <br>
서버에 도착한 전화번호는 <%= tel %> <br>
</body>
</html>