<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인</title>
</head>
<body>
<form action="login" method="post">
	<input type="text" name="id"/>
	<form:errors path="user.id"/><br>
	<input type="password" name="pw"/>
	<form:errors path="user.pw"/><br>
	<input type="submit" value="로그인"/><br>
</form>
</body>
</html>