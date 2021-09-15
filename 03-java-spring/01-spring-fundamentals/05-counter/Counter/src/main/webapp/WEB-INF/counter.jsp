<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" href="/css/main.css"/>
	<meta charset="ISO-8859-1">
	<title>Counter Page</title>
</head>
<body>
	<h1 class="text-center">You have visited the
	<a href="/">Root Route</a> <c:out value="${count}"/> times!</h1>
	<h2 class="text-center"><a href="/reset">Click here to reset the count!</a></h2>
</body>
</html>
