<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:forEach items="${cate2}" var="sub" varStatus="st">
	<a href="../${st.index}/list">${sub}</a><br>
</c:forEach>