<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>회원가입</title>
</head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
	$(document).ready(()=>{
		var form = $("#member");
		$("#regBtn").on("click", ()=>{
			form.attr("action", "/member/register");
			form.attr("method", "post")
			form.submit();
		})
	})
</script>
<body>
	<h1>회원가입</h1>
	<form:form modelAttribute="member">
		<table>
			<tr>
				<td>아이디</td>
				<td><form:input path="id" /></td>
				<td><font color="red"><form:errors path="id" /></font></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><form:input path="passwd" /></td>
				<td><font color="red"><form:errors path="passwd" /></font></td>
			</tr>
			<tr>
				<td>아이디</td>
				<td><form:input path="name" /></td>
				<td><font color="red"><form:errors path="name" /></font></td>
			</tr>
		</table>
	</form:form>
	<div>
		<button id="regBtn">회원가입</button>
	</div>
</body>
</html>