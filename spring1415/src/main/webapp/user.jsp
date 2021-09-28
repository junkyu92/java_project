<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String user = request.getParameter("user");
    String[] list = {"root", "summer", "park"};
    String result = "사용 가능한 아이디입니다.";
    for(String i:list){
	    if (user.equals(i)){
	    	result = "중복된 아이디입니다.";
	    }
    }
    %>
<%=result%>