<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css" href="/css/style.css"/>
	<script type="text/javascript" src="/js/date.js"></script>
	<meta charset="ISO-8859-1">
	<title>Date Page</title>
</head>
<body>
	<script>alertInfo("date")</script>
	<h1 class="blue text-center">
		<fmt:formatDate type="date" dateStyle="long" pattern="EEEE 'the' dd 'of' MMMM, YYYY " value="${date}"/> 
	</h1>
</body>
</html>