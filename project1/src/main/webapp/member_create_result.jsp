<%@page import="project1.MemberDAO"%>
<%@page import="project1.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String id = request.getParameter("id");
    	String pw = request.getParameter("pw");
    	String name = request.getParameter("name");
    	String mail = request.getParameter("mail");
    	String tel = request.getParameter("tel");
    	
    	MemberDTO dto = new MemberDTO();
    	dto.setId(id);
    	dto.setPw(pw);
    	dto.setName(name);
    	dto.setMail(mail);
    	dto.setTel(tel);
    	
    	MemberDAO dao = new MemberDAO();
    	String result = dao.create(dto);
    	
    	if (result.equals("회원가입성공")){
    		response.sendRedirect("main_login.jsp");
    	}else{
    		session.setAttribute("errMsg", "로그인 정보가 올바르지 않습니다.");
    		response.sendRedirect("member_create.jsp");
    	}
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
회원가입 실패하였습니다.
</body>
</html>