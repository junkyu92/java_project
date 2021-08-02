<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%
	    String errMsg = (String)session.getAttribute("errMsg");
	    if(errMsg == null) errMsg = "";
	    
	    session.invalidate();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JEJU Hotel Booking_login</title>
<link rel="stylesheet" href="css/project1.css">
</head>
<body>
<div id="total">
	<div id="menu_frame">
		<jsp:include page="menu.jsp"></jsp:include>
	</div>
	<hr>
	<div id="notice_frame">
		notice. 고객님의 여정이 코로나19(COVID-19)발생 상황에 영향을 받을 수 있으니 예약시 코로나 현황을 꼭 확인해주세요.
	</div>
	<div>
		<form action="login_result.jsp">
		아이디: <input name='id'><br>
		비밀번호:<input name='pw'><br>
		<div id="errMsg" style="color:red"><%= errMsg %></div><br>
		<button>로그인</button>
		</form>	
	</div>
</div>

</body>
</html>