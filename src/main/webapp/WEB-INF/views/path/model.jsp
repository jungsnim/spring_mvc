<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>모델</title>
</head>
<body>
<table border="1" cellpadding="1" cellspacing="1">
	<tr>
		<td colspan="2">
			<c:forEach items="${mainMenu}" var="main" varStatus="st">
				<a href="../../${st.index}/0/list">${main}</a>
			</c:forEach>
		</td>
		
		
	</tr>
	<tr>
		<td>
			<c:forEach items="${subMenu}" var="sub" varStatus="st">
				<a href="../${st.index}/list">${sub}</a><br>
			</c:forEach>
		</td>
		<td><jsp:include page="${main}.jsp"/></td>
	</tr>
	<tr>
		<td colspan="2">바닥</td>
	</tr>

</table>
모델이지
</body>
</html>