<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" href="/css/style.css"/>
	<script type="text/javascript" src="/js/date.js"></script>
	<meta charset="ISO-8859-1">
	<title>Time Template</title>
</head>
<body>
	<script>alertInfo("time")</script>
	<script>lookMa("It's a confirmation box!")</script>
	<h1 class="green text-center">
		<fmt:formatDate type="time" pattern="hh:mm a" value="${time}"/>
	</h1>
</body>
</html>