<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%
	String id = request.getParameter("id");
	
	session.setAttribute("id2", id);
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script type="text/javascript">
		function go_news() {
			location.href="news.jsp"
		}
		function go_mail() {
			location.href="mail.jsp"
		}
		function go_cafe() {
			location.href="cafe.jsp"
		}
	</script>
</head>
<body>
<button onclick='go_news()'>news페이지로 이동</button>
<button onclick='go_mail()'>mail페이지로 이동</button>
<button onclick='go_cafe()'>cafe페이지로 이동</button>
</body>
</html>