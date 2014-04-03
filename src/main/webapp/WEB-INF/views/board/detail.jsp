<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>리스트</title>
</head>
<body>
<table>
	<tr>
		<td>아이디</td>
		<td>제목</td>
		<td>작성자</td>
		<td>조회</td>
	</tr>
	<tr>
		<td>${data.id}</td>
		<td>${data.title}</td>
		<td>${data.pname}</td>
		<td>${data.cnt}</td>
	</tr>
	
</table>
</body>
</html>