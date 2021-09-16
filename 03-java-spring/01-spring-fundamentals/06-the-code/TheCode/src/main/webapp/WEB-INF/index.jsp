<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" href="/css/main.css"/>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
</head>
<body>
	<div class="col-4 offset-4">
		<h2 class="text-danger"><c:out value="${errors}"/></h2>
		<h1 class="text-info">What is the code?</h1>
		<form action="/passcode" method="POST">
			<input type="text" name="password">
			<input type="submit">
		</form>
	</div>
	
</body>
</html>
