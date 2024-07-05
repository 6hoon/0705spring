<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>@DateTimeFormat 애너테이션 처리</h1>
	<a href="registerByDateFormat?userId=hong&dateOfBirth=20001020">registerByDateFormat?user
		Id=hong&ampdateOfBirth=20001020</a>
	<br>
	<a href="registerByDateFormat01?userId=hong&dateOfBirth=2000-10-20">registerByDateFormat01?userId=hong&ampdateOfBirth=2000-10-20</a>
	<br>
	<a href="registerByDateFormat02?userId=hong&dateOfBirth=2000/10/20">registerByDateFormat0
		2?userId=hong&ampdateOfBirth=2000/10/20</a>
	<br>
	<a href="registerByDateFormat03?userId=hong&dateOfBirth=20001020">registerByDateFormat03?
		userId=hong&ampdateOfBirth=20001020</a>
	<br>
	<form action="/register" method="post">
		userId: <input type="text" name="userId" value="hong"><br>
		password: <input type="text" name="password" value="1234"><br>
		dateOfBirth: <input type="text" name="dateOfBirth" value="20001020"><br>
		<input type="submit" value="register">
	</form>
</body>

</html>