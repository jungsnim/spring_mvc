<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>리스트</title>
</head>
<body>
<table border="1" cellpadding="1" cellspacing="1">
	<tr>
		<td>번호</td>
		<td>제목</td>
		<td>작성자</td>
		<td>조회</td>
	</tr>
	<c:forEach items="${data}" var="dd" varStatus="no">
		<tr>
			<td>${no.index}</td>
			<td>${dd.title}</td>
			<td>${dd.pname}</td>
			<td>${dd.cnt}</td>
		</tr>
	</c:forEach>
	
</table>
</body>
</html>