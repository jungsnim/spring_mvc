<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- <spring:hasBindErrors name="stud"/>
<form:errors path="stud"/> --%>
<form method="post">
아이디: <input type="text" name="id" value="${stud.id}"/>
<form:errors path="stud.id"/><br> <!-- form:errors 상응하는 에러가 발생된다. -->
암호: <input type="password" name="pw" value="${stud.pw}"/>
<form:errors path="stud.pw"/><br>
<input type="submit" value="제출">
</form>

</body>
</html>