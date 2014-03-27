<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>업로드 작성</title>
</head>
<body>
<table border="1" cellpadding="1" cellspacing="1">
	<tr>
		<td>이름</td>
		<td>${stud.name}</td>
	</tr>
	<tr>
		<td>학번</td>
		<td>${stud.fileData.num}</td>
	</tr>
	<tr>
		<td>전화번호</td>
		<td>${stud.tel}</td>
	</tr>
	<tr>
		<td>사진</td>
		<td><img alt="증명사진" src="${stud.fileData.sysFile}"/></td>
	</tr>
</table>

</body>
</html>