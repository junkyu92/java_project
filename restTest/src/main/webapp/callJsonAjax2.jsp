<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
$(function() {
	$('#b1').click(function() {
		$.ajax({
			url: "jsonResponse1",
			success: function(json) {
				//alert(json.id)
				$('div').append("-id:  " + json.id + "<br>")
				$('div').append("-name:  " + json.name + "<br>")
				$('div').append("-url:  " + json.url + "<br>")
				$('div').append("-img:  " + json.img + "<br><hr>")
				imgSrc = "<img src=" + json.img + ">"
				urlGo = "<a href=" + json.url + ">" + json.name + 
				"</a>"
				$('div').append(urlGo + "<br>")
				$('div').append(imgSrc + "<br>")
			}
		})	
	})
	
	
/* 	function a(x, y, c) {
		
	}
	
	a(100) */
	
	$('#b2').click(function() {
		$.ajax({
			url: "jsonResponse2",
			success: function(jsonList) {
				alert(jsonList.length)
				console.log(jsonList)
				$(jsonList).each(function(index, json) {
					one = json.id + ", " 
							+ json.name + ", " 
							+ json.url + ", " 
							+ "<img src=" + json.img + " width=100 height=100>" + "<br>" 
					$('div').append(index + ": " + one)
				})
			}
		})	
	})
})
</script>
</head>
<body>
<button id="b1" style="background:yellow">Bag Json</button>
<button id="b2" style="background:orange">BagList Json</button>
<hr color="red">
<div></div>
</body>
</html>