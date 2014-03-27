<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>업로드 작성</title>
</head>
<body>
<form method="post" action="upload1" enctype="multipart/form-data">
학번 : <input type="text" name="num"/><br>
파일 : <input type="file" name="upfile"/><br>
<input type="submit" value="작성"/>
</form> 

<form method="post" action="upload2" enctype="multipart/form-data">
학번 : <input type="text" name="num"/><br>
파일 : <input type="file" name="upfile"/><br>
<input type="submit" value="작성"/>
</form> 


<form method="post" action="upload3" enctype="multipart/form-data">
학번 : <input type="text" name="num"/><br>
파일 : <input type="file" name="upfile"/><br>
<input type="submit" value="작성"/>
</form> 


</body>
</html>