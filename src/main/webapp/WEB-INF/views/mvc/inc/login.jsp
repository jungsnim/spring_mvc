<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<form method="post">
아이디: <input type="text" name="id" value="${stud.id}"/>
<form:errors path="stud.id"/><br> <!-- form:errors 상응하는 에러가 발생된다. -->
암호: <input type="password" name="pw" value="${stud.pw}"/>
<form:errors path="stud.pw"/><br>
<input type="submit" value="제출">
</form>

</body>
</html>