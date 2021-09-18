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
		<div class="col-2 offset-3">
		<h2 class="text-success">Submitted Info</h2>
		</div>
	</div>
	<div class="row">
		<div class="col-2 offset-3">
			<h3>Name : </h3>
			<h3>Location : </h3>
			<h3>Language : </h3>
			<h3>Comment : </h3>
		</div>
		<div class="col-3">
			<h3 class=""><c:out value="${name}"/></h3>
			<h3 class=""><c:out value="${location}"/></h3>
			<h3 class=""><c:out value="${language}"/></h3>
			<h3 class=""><c:out value="${comment}"/></h3>
		</div>
	</div>
	<div class="row">
		<div class="col-2 offset-5">
			<a href="/" class="btn btn-success">Go Back</a> 
		</div>
	</div>
	
</body>
</html>
