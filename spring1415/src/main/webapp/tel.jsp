<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String tel = request.getParameter("tel");
    Random r = new Random();
    String result = "333";
    if (tel.substring(0,3).equals("010")){
    	result = "111";
    }else if(tel.substring(0,3).equals("011")){
    	result = "222";
    }
    int num = r.nextInt(900)+100;
    result = result + num;
    %>
<%=result %>
