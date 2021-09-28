<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    int temp = Integer.parseInt(request.getParameter("temp"));
    String day = request.getParameter("day");
    String temp2 = "가을이군!";
    if(temp >= 30){
    	temp2 = "엄청 덥군!";
    }
    %>
오늘은 <%=day%>인데, <%=temp2%>