<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home2</title>
</head>
<body>
	<h1>Member Info</h1>
	<p>
		member.userId =
		<c:out value="${mem.userId}" />
	</p>
	<p>
		member.userName =
		<c:out value="${mem.userName}" />
	</p>
	<p>
		member.password =
		<c:out value="${mem.password}" />
	</p>
</body>
</html>