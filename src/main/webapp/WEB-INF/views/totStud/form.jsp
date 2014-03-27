<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>업로드 작성</title>
</head>

<!-- <script type="text/javascript">
function chagneFile()
{
	document.frm.action = "totStudrefresh";
	alert(document.frm["fileData.upfile"].value);
	document.frm.localFile.value = document.frm["fileData.upfile"].value;
	document.frm.submit();
}
</script> -->
<body>
<form name="frm" method="post" action="totStudRes" enctype="multipart/form-data">
<table border="1" cellpadding="1" cellspacing="1">
	<tr>
		<td>이름</td>
		<td><input type="text" name="name" value= "${stud.name}" /></td>
	</tr>
	<tr>
		<td>학번</td>
		<td><input type="text" name="fileData.num" value= "${stud.fileData.num}"/></td>
	</tr>
	<tr>
		<td>전화번호</td>
		<td><input type="text" name="tel" value= "${stud.tel}"/></td>
	</tr>
	<tr>
		<td>사진첨부</td>
		<td>
			<input type="file" name="fileData.upfile"/>
		</td>
		
	</tr>
</table><br>
<input type="submit" value="제출"/>

</form> 

</body>
</html>