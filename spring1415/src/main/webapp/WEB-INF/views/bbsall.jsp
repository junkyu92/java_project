<%@page import="java.util.List"%>
<%@page import="com.mega.mvc14.BbsDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
		<td width="100">아이디</td>
		<td width="100">제목</td>
		<td width="100">내용</td>
		<td width="100">작성자</td>
		<td width="100">상세페이지</td>
	</tr>
		<c:forEach items="${list}" var="dto">
		<tr>
		<td width="100">${dto.id}</td>
		<td width="100">${dto.title}</td>
		<td width="100">${dto.content}</td>
		<td width="100">${dto.writer}</td>
		<td width="100"><a href="bbs.one?id=${dto.id}"><button>상세페이지로!</button></a></td>
	</tr>
		</c:forEach>
</table>
</body>
</html>