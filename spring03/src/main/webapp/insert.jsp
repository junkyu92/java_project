<%@page import="com.mega.mvc03.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>\
    <jsp:useBean id="dto" class="com.mega.mvc03.MemberDTO"></jsp:useBean>
    <jsp:setProperty property="*" name="dto"/>
    <!-- jsp 액션 태그 -->
    <%
    MemberDAO dao = new MemberDAO();
    dao.insert(dto);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body background="yellow">
회원가입 신청이 완료되었습니다.
</body>
</html>