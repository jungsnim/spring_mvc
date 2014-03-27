<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>학생정보 입력하시오</title>
</head>
<body>

<form action="homework" method="get">
	반수:<input type="text" name="bancount"/><br>
	학생수:<input type="text" name="stcount"/><br>
	<input type="submit" value="적용"/>
</form>


<form method="post">
<table border="1" cellpadding="1" cellspacing="1">
	<c:forEach begin="0" end="${bancount-1>=0?bancount-1:0}" var="b">
		<tr>
			<th rowspan="${stcount+1}">${b+1}반</th><th>이름</th><th>국어</th><th>영어</th><th>수학</th>
		</tr>
		<input type="hidden" name="banList[${b}].ban" value="${b+1}"/>
		<c:forEach begin="0" end="${stcount-1>=0?stcount-1:0}" var="i">
			<tr>
				<td><input type="text" name="banList[${b}].stdList[${i}].name"/></td>
				<td><input type="text" name="banList[${b}].stdList[${i}].kor"/></td>
				<td><input type="text" name="banList[${b}].stdList[${i}].eng"/></td>
				<td><input type="text" name="banList[${b}].stdList[${i}].mat"/></td>
			</tr>
		</c:forEach>
	</c:forEach>
</table>
<input type="submit" value="제출"/>
</form>
</body>
</html>