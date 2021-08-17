<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
button{
color: white;
font-size: 20px;
}
#login {
background: blue;
}
#totalPrice{
background: red;
}
</style>
<script>
	function login() {
		id = prompt('id입력')
		pw = prompt('pw입력')
		
		if(id == 'root' && pw == '1234'){
			location.href = 'http://www.naver.com'
		}else{
			location.href = 'http://www.daum.net'
		}
	}
	function totalPrice() {
		price = prompt('결제금액')
		member = prompt('1)일반회원 2)vip')
		if (member == '1'){
			alert(price * 1.1 + '원')
		}else if (member =='2'){
			alert(price * 0.9 + '원')
		} else{
			alert(price)
		}
	}
</script>
</head>
<body>
<button onclick="login()" id='login'>로그인</button><br>
<button onclick="totalPrice()" id='totalPrice'>결제금액</button><br>

</body>
</html>