<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인 페이지</title>
</head>
<body>
<form action="result" method="post">
<table border="1" cellpadding="1" cellspacing="1">
	<tr>
		<td>아이디</td><td><input type="text" name="id" value="${id}"/></td>
	</tr>
	<tr>
		<td>패스워드</td><td><input type="password" name="pass"/></td>
	</tr>
	<tr>
		<td colspan="2"><input type="submit" value="로그인"/></td>
	</tr>
</table>
</form>
</body>
</html>