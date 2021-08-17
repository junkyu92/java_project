<%@page import="shop.db.ProductDAO"%>
<%@page import="shop.dto.ProductDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String id = request.getParameter("id");
    ProductDTO dto = new ProductDTO();
    dto.setId(id);
    
    ProductDAO dao = new ProductDAO();
    ProductDTO dto2 = dao.read(dto);
    
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<table>
			<tr>
				<td>아이디</td>
				<td>이름</td>
				<td>내용</td>
				<td>가격</td>
			</tr>
			<tr>
				<td><%= dto2.getId() %></td>
				<td><%= dto2.getName() %></td>
				<td><%= dto2.getContent() %></td>
				<td><%= dto2.getPrice() %></td>
			</tr>
		</table>
</body>
</html>