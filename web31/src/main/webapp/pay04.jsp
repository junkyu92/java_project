<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String pId = request.getParameter("productId");
    String pName = request.getParameter("productName");
    String total = request.getParameter("total");
    String uId = request.getParameter("uId");
    int total2 = Integer.parseInt(total);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript"
	src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<script type="text/javascript"
	src="https://cdn.iamport.kr/js/iamport.payment-1.1.5.js"></script>

<script type="text/javascript">
	function pay() {
		var IMP = window.IMP;
		IMP.init('iamport');
		
		IMP.request_pay({
		pg : 'inicis', // version 1.1.0부터 지원.
		pay_method : 'card',
		merchant_uid : 'merchant_' + new Date().getTime(),
		name : '<%= pName%>',
		amount : <%= total2%>,
		buyer_email : 'iamport@siot.do',
		buyer_name : '<%= uId%>',
		buyer_tel : '010-1234-5678',
		buyer_addr : '서울특별시 강남구 삼성동',
		buyer_postcode : '123-456',
		m_redirect_url : 'www.yourdomain.com/payments/complete'
		}, function(rsp) {
			if ( rsp.success ) {
				var msg = '결제가 완료되었습니다.';
				msg += '고유ID : ' + rsp.imp_uid;
				msg += '상점 거래ID : ' + rsp.merchant_uid;
				msg += '결제 금액 : ' + rsp.paid_amount;
				msg += '카드 승인번호 : ' + rsp.apply_num;
				alert(msg);
			} else {
				var msg = '결제에 실패하였습니다.';
				msg += '에러내용 : ' + rsp.error_msg;
				alert(msg)
			}
		});
	}
	
	pay();
</script>
</head>
<body>

</body>
</html>