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
<div class="row">
		<div class="col-2">
			<a href="/ninja/new">Ninja Click</a>
		</div>
		<div class="col-2">
			<a href="/dojo/new">Dojo Click</a>
		</div>
	</div>
	<div class="row">
		<h1 class="offset-2"><c:out value="${thisDojo.name}"/></h1>
	</div>
	<div class="row">
		<c:forEach items="${thisDojo.ninjas}" var="ninja">
		<h3 class="offset-2">${ninja.firstName} ${ninja.lastName} - ${ninja.age}</h3>
		</c:forEach>
	</div>
	
</body>
</html>