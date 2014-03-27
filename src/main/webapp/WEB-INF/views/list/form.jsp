<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>리스트 작성</title>
</head>
<body>
<form method="post">
	<table border="1" cellpadding="1" cellspacing="1">
		<tr>
			<td>상품ID</td>
			<td>상품명</td>
			<td>수량</td>
		</tr>
		<c:forEach begin="0" end="2" var="i">
			<tr>
				<td><input type="text" name="product[${i}].pid" size="6"/> </td>
				<td><input type="text" name="product[${i}].name" size="6"/> </td>
				<td><input type="text" name="product[${i}].cnt" size="6"/> </td>
			</tr>
		</c:forEach>
		<tr>
			<td rowspan="3">배송지</td>
			<td>우편번호</td>
			<td><input type="text" name="addr.zipcode" size="6"/></td>
		</tr>
		<tr>
			<td>기본주소</td>
			<td><input type="text" name="addr.addr1" size="6"/></td>
		</tr>
		<tr>
			<td>상세주소</td>
			<td><input type="text" name="addr.addr2" size="6"/></td>
		</tr>
		<tr>
			<td><input type="submit" value="작성"/></td>
		</tr>
	</table>
</form> 
</body>
</html>