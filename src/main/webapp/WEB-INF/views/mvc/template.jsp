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
			<jsp:include page="inc/cate1.jsp"/>
			<jsp:include page="inc/${log}.jsp"/>
		</td>
	</tr>
	<tr>
		<td>
			<jsp:include page="inc/cate2.jsp"/>
		</td>
		<td><jsp:include page="${cate3}.jsp"/></td>
	</tr>
	<tr>
		<td colspan="2"><jsp:include page="inc/bottom.jsp"/></td>
	</tr>

</table>

</body>
</html>