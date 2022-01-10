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
	$('#b1').click(function() {
		$.ajax({
			url: "https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Frss.etnews.com%2FSection102.xml&api_key=6ydlgrk3scccjebzyzerrfu4ouphpnjfzgbju831",
			data : {
				url: "http://rss.etnews.com/Section102.xml",
				api_key: "6ydlgrk3scccjebzyzerrfu4ouphpnjfzgbju831",
				count: 20
			},
			success: function(doc) {
				//alert(doc)
				list = doc.items
				//alert(list.length)
				$(list).each(function(index, item) {
					$('div').append("<a href='"+item.link+"'>" + item.title)
					$('div').append(" : " + item.pubDate + "<br>" + item.link + "<br>")
					$('div').append("<hr>")
					$.ajax({
						url : "newsDb",
						data : {
							title : item.title,
							pubDate : item.pubDate,
							link : item.link,
							author : item.author
						},
						success: function() {
							
						}
					})
				})
			}
		})
	})
})
</script>
</head>
<body>
<button id="b1">뉴스리스트</button>
<hr color="red">
<div></div>
</body>
</html>