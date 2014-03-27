<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>하이 난 홈웍 스튜디오야</title>
</head>
<body>
<table border="1" cellpadding="1" cellspacing="1">
	<tr>
		<td colspan="2"><jsp:include  page="${page.top}"/></td>
	</tr>
	<tr>
		<td><jsp:include page="${page.midLeft}"/></td>
		<td><jsp:include page="${page.midRight}"/></td>
	</tr>
	<tr>
		<td colspan="2"><jsp:include page="${page.bottom}"/></td>
	</tr>
</table>

</body>
</html>