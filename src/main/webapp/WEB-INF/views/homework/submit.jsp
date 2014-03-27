<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>숙제 학생정보출력</title>
</head>
<body>
<table border="1" cellpadding="1" cellspacing="1">
	<tr>
		<th> 반</th><th>이름</th>
		<th>국어</th><th>영어</th><th>수학</th><th>총점</th><th>평균</th>
		<th>반평균</th>
	</tr>
	<c:forEach var="b" items="${school.banList}">
		<c:forEach var="st" items="${b.stdList}" varStatus="vs">
			<tr>
				<c:if test="${vs.index == 0}">
					<td rowspan="${b.stdList.size()}">${b.ban}</td>
				</c:if>
				
				<td>${st.name}</td>
				<td>${st.kor}</td>
				<td>${st.eng}</td>
				<td>${st.mat}</td>
				<td>${st.sum}</td>
				<td>${st.avg}</td>
				<c:if test="${vs.index == 0}">
					<td rowspan="${b.stdList.size()}">${b.avg}</td>
				</c:if>
			</tr>
		</c:forEach>
	</c:forEach>
</table>
</body>
</html>