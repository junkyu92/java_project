<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript">
$(function() {
	$('#b1').click(function() {
		contentVal = $('#in1').val()
		$.ajax({
			url : "reply.add",
			data : {
				content : contentVal,
				writer : '${dto.writer}',
				bbsid : '${dto.id}'
			},
			success: function() {
				location.href="bbs.one?id=${dto.id}"
			}
		})
	})
})
</script>
</head>
<body>
<a href="bbs.all">게시판 전체 목록으로 가기</a><br>
id : ${dto.id} <br>
title : ${dto.title}<br>
content : ${dto.content}<br>
writer : ${dto.writer}<br>
댓글 입력 : <input id="in1"> <button id="b1">등록</button>
<hr>
<table>
	<tr>
		<td width="100">아이디</td>
		<td width="100">내용</td>
		<td width="100">작성자</td>
	</tr>
		<c:forEach items="${list}" var="dto">
		<tr>
		<td width="100">${dto.id}</td>
		<td width="100">${dto.content}</td>
		<td width="100">${dto.writer}</td>
	</tr>
		</c:forEach>
</table>
<div id='reply'></div>
</body>
</html>