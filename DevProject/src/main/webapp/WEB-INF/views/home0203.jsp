<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home0203</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>\${userId == "hongkd"}</td>
			<td>${userId == "hongkd"}</td>
		</tr>
		<tr>
			<td>\${userId == "hongkd"}</td>
			<td>${userId eq "hongkd"}</td>
		</tr>
	</table>

</body>
</html>