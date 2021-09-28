<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach items="${list}" var="dto">

	${dto}<br>

</c:forEach>
<br>
<table>
	<tr bgcolor="lime" align="center">
		<td width="100">아이디</td>
		<td width="100">이름</td>
		<td width="100">전화번호</td>
		<td width="100">상세페이지</td>
		<td width="100">삭제</td>
	</tr>
	<c:forEach items="${list}" var="dto">
	<tr bgcolor="lime" align="center">
		<td width="100">${dto.id}</td>
		<td width="100">${dto.name}</td>
		<td width="100">${dto.tel}</td>
		<td width="100">
			<a href="one.do?id=${dto.id}">
				<button style="background: pink;">상세페이지로</button>
			</a>
		</td>
		<td width="100">
			<a href="del.do?id=${dto.id}">
				<button style="background: pink;">삭제</button>
			</a>
		</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>