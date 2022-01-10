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
	$('#ajaxB').click(function() {
		$.ajax({
			url: 'create.finance2',
			data: {
				code : $('#code').val(),
				company : $('#company').val(),
				today : $('#today').val(),
				yesterday : $('#yesterday').val(),
				high : $('#high').val()
			},
			success: function(a) {
				alert(a)
				}
			})
	})
	$('#crawling').click(function() {
		$.ajax({
			url : 'crawling.code2',
			data : {
				code : $('#code2').val()
			},
			success : function(a) {
				alert(a)
			}
		})
	})
})
</script>
</head>
<body>
<form action="create.finance">
	code : <input id="code" name="code"><br>
	company : <input id="company" name="company"><br>
	today : <input id="today" name="today"><br>
	yesterday : <input id="yesterday" name="yesterday"><br>
	high : <input id="high" name="high"><br>
	<button>request</button>
</form>
<button id="ajaxB">ajax</button>
<hr>
<form action="crawling.code">
	code: <input id="code2" name="code2"><br>
	<button>code로 크롤링</button>
</form>
	<button id="crawling">code로 크롤링(ajax)</button>
</body>
</html>