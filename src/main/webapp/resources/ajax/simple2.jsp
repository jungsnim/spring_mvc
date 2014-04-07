<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	ArrayList<String> ids = new ArrayList<String>();
	ids.add("aaa");
	ids.add("bbb");
	ids.add("ccc");
	boolean loginsuc = ids.contains(request.getParameter("name"));
%>
<c:choose>
	<c:when test="${true}">
		true
	</c:when>
	<c:otherwise>
		false
	</c:otherwise>
</c:choose>

