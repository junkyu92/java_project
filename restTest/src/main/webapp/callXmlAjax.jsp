<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script type="text/javascript">
$(function() {
	$.ajax({
		url: "resources/text/rank.xml",
		success: function(xmlResult) {
			alert(xmlResult)
			list = $(xmlResult).find('rank')
			alert(list.length + "개 ")
			for (var i = 0; i < list.length; i++){
				$('div').append($(list[i]).find('name').text() + " " + $(list[i]).find('tel').text() + "<br>")
			}
			$(list).each(function() {
				n = $(this).find('name').text()
				t = $(this).find('tel').text()
				$('div').append(n + " " + t + "<br>")
				$.ajax({
					url : "dbGo",
					data : {
						name : n,
						tel : t
					},
					success : function(success) {
						alert("success")
					}
				})
			})
		}
	})
})
</script>
</head>
<body>
<div></div>
</body>
</html>