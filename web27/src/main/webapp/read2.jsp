<%@page import="shop.db.게시판DAO"%>
<%@page import="shop.dto.게시판Bag"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String id = request.getParameter("id");
    
    게시판Bag bag = new 게시판Bag();
    bag.setId(id);
    
    게시판DAO dao = new 게시판DAO();
    게시판Bag bag2 = dao.read(bag);
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>게시물 정보 검색 결과입니다.</h3>
	<hr>
	<table>
		<tr>
			<td>아이디</td>
			<td>제목</td>
			<td>내용</td>
			<td>작성자</td>
		</tr>
		
		<tr>
			<td><%= bag2.getId() %></td>
			<td><%= bag2.getTitle() %></td>
			<td><%= bag2.getContent() %></td>
			<td><%= bag2.getWriter() %></td>
		</tr>
	</table>

</body>
</html>