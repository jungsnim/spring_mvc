<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>이벤트</title>
</head>
<body>
<c:choose>
	<c:when test="${logined == null || logined == '' }">
		<form action="loginreq" method="post">
			<input type="text" name="id"/><br>
			<input type="password" name="pw"/><br>
			<input type="submit" value="로그인"/>
		</form>
	</c:when>
	<c:otherwise>
		<form action="logoutreq" method="post">
			<input type="submit" value="로그아웃"/><br>
		</form>
	</c:otherwise>
</c:choose>
<br>
<a href="content/loginsuc">보고싶지??</a><br>
<a href="content/loginsuc2">로그인하면 보여주지~</a><br>
</body>
</html>