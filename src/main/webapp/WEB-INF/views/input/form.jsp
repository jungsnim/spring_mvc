<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시물 작성</title>
</head>
<body>
<form method="post">
번호 : <input type="text" name="num" value="${st.num}"/><br>
이름 : <input type="text" name="name" value="${st.name}"/><br>
국어 : <input type="text" name="kor" value="${st.kor}"/><br>
영어 : <input type="text" name="eng" value="${st.eng}"/><br>
수학 : <input type="text" name="mat" value="${st.mat}"/><br>
<input type="submit" value="작성"/>
</form> 
</body>
</html>