<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function print(){
	
	var clock = document.getElementById("clock");
	var now = new Date();
	clock.innerHTML = now.getFullYear()+"년"+
	(now.getMonth()+1)+"월"+
	now.getDate()+"일"+
	now.getHours()+"시"+
	now.getMinutes()+"분"+
	now.getSeconds()+"초";
	setTimeout("print()",1000);
}
window.onload = function(){
	print();
}

</script>
</head>
<body>
	<span id="clock">
	
	</span>
</body>
</html>