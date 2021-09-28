<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript">
/* location.href="bbs.one?id=a" */
	</script>
</head>
<body>
<form action="bbs.mega">
	id : <input name="id"> <br>
	title : <input name="title"> <br>
	content : <input name="content"> <br>
	writer : <input name="writer"> <br>
	<button>게시글 작성</button>
</form>

<form action="bbs.one">
	id : <input name="id"> <br>
	<button>게시글 검색</button>
</form>
<a href="bbs.all">게시글 전체 검색</a>
</body>
</html>