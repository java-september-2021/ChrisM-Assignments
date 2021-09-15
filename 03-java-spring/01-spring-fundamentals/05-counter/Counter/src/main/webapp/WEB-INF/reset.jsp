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
	<h1>You have reset the counter </h1>
	<h2>Click for <a href="/">Root Route</a> you have visited <c:out value="${count}"/> times!</h2>
</body>
</html>
