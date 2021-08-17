<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript">
$(function() {
	alert('dom tree를 모두 읽어들였음!')
	$('#b1').click(function() {
		location.href = "domTree.jsp";
	})
	$('#b2').click(function() {
		in1Value = $('#in1').val();
		
		if(in1Value == 1){
			alert('커피가 먹고싶군요.')
		}else if(in1Value == 2){
			alert('자장면이 먹고싶군요.')
		}else if(in1Value == 3){
			alert('물이 먹고싶군요.')
		}else{
			alert('먹고싶은게 없군요.')
		}
	})
	$('#b3').click(function() {
		in2Value = $('#in2').val();
		in3Value = $('#in3').val();
		result1Tag = $('#result1');
		
		if (in2Value == 1 && in3Value == 1){
			//alert("우산을 챙깁시다!");
			//result1Tag.text('우산을 가지고 가자')
			result1Tag.html('<font color=blue>우산을 가지고 가자</font>')
		} else {
			//alert("우산을 안챙겨도 될 것 같아요.");
			//result1Tag.html('<font color=red>우산을 가지고 가지 말자</font>')
			result1Tag.html('<font color=red>우산을 가지고 가지 말자</font>')
		}
		$('#in2').val('')
		$('#in3').val('')
	})
})
</script>
</head>
<body>
	<button id='b1'>사이트 이동</button> <br>
	먹고 싶은 음식1)커피, 2)자장면, 3)물 : <input id='in1'>
	<button id='b2'>입력값 읽어서 처리</button> <br>
	비가 오나요 1)온다. 2)안온다. <input id='in2'> <br>
	구름이 많은가요 1)많다. 2)적다. <input id='in3'> <br>
	<button id='b3'>입력값 읽어서 처리2</button>
	<hr color="red">
	<div id='result1'>결과가 나타나는 부분</div>
</body>
</html>