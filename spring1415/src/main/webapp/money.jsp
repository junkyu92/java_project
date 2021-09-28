<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    int money = Integer.parseInt(request.getParameter("money"));
    int pay = Integer.parseInt(request.getParameter("pay"));
    String pay2 = "잘못입력하셨습니다.";
    double money2 = money;
    if (pay==1){
    	pay2 = "계좌이체";
    	money2 = (money * 0.8);
    }else if(pay==2){
    	pay2 = "신용카드";
    	money2 = (money * 0.9);
    }else if(pay==3){
    	pay2 = "휴대폰결제";
    }
    %>
결제할 금액 : <%=(int)money2%>원<br>
결제 수단 : <%=pay2%>