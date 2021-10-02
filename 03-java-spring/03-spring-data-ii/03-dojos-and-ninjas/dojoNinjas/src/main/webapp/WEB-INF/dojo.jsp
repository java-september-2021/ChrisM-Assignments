<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" href="/css/main.css"/>
	<meta charset="ISO-8859-1">
	<title>New Dojo</title>
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
		<h1 class="offset-2">New Dojo</h1>
	</div>
	<div class="row">
		<div class="col-4 offset-2">
			<form:form action="/dojo/new" method="POST" modelAttribute="dojo">
				<form:label path="name">Name:</form:label>
				<form:errors path="name"/>
				<form:input type="text" path="name"/>
				<button class="btn btn-primary">Create</button>				
			</form:form>
		
		
		</div>
			
	</div>
	
</body>
</html>