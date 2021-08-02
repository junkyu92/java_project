<%@page import="project1.MemberDAO"%>
<%@page import="project1.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
	    String id = request.getParameter("id");
	    String pw = request.getParameter("pw");
	    
	    MemberDTO dto = new MemberDTO();
	    dto.setId(id);
	    dto.setPw(pw);
	    
	    MemberDAO dao = new MemberDAO();
	    MemberDTO dto2 = dao.read(dto);
	    if(pw.equals(dto2.getPw())){
	    	response.sendRedirect("main_login.jsp");
	    }else{
    		session.setAttribute("errMsg", "로그인 정보가 올바르지 않습니다.");
    		response.sendRedirect("login.jsp");
    	}
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>.</title>
</head>
<body>
.
</body>
</html>
