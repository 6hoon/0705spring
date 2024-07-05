<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>registerFileUpForm</title>
</head>
<body>
	<h2>파일 업로드 폼 요청처리</h2>
	<form action="/file/registerFileUp01" method="post" enctype="multipart/form-data">
		1.
		<input type="file" name="picture">
		<input type="submit">
	</form>
	<hr>
	<form action="/file/registerFileUp02" method="post" enctype="multipart/form-data">
		2. userId:
		<input type="text" name="userId" value="hong">
		<br> 2.password:
		<input type="text" name="password" value="1234">
		<br>
		<input type="file" name="picture">
		<input type="submit">
	</form>
	<hr>
	<form action="/file/registerFileUp03" method="post" enctype="multipart/form-data">
		3. userId:
		<input type="text" name="userId" value="hong">
		<br> 3.password:
		<input type="text" name="password" value="1234">
		<br>
		<input type="file" name="picture">
		<input type="submit">
	</form>

</body>
</html>