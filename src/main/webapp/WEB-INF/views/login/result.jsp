<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:choose>
	<c:when test="${loginfo.succLogin == true }">
	<form action="logout">
		<table border="1" cellpadding="1" cellspacing="1">
			<tr>
				<td>아이디</td><td>${loginfo.id }</td>
			</tr>
			<tr>
				<td><input type="submit" value="로그아웃"/></td>
			</tr>
			
			
		</table>
	</form>
	</c:when>
	<c:otherwise>
		로그인 실패<br>
		<a href="form">로그인 다시시도</a>
	</c:otherwise>
</c:choose>
</body>
</html>