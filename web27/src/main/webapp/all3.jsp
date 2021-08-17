<%@page import="shop.dto.ProductDTO"%>
<%@page import="shop.db.ProductDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    ProductDAO dao = new ProductDAO();
    ArrayList<ProductDTO> list = dao.read();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<tr bgcolor="yellow">
	<td>아이디</td>
	<td>제목</td>
	<td>내용</td>
	<td>작성자</td>
</tr>
<%
	for(ProductDTO dto : list){
%>
	<tr>
		<td><%= dto.getId() %></td>
		<td>
		<%= dto.getName() %>
		</td>
		<td><%= dto.getContent() %></td>
		<td><%= dto.getPrice() %></td>
	</tr>
<%} %>
</table>

</body>
</html>