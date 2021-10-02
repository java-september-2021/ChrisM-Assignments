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
	<title>Insert title here</title>
</head>
<body>
<div class="row">
	<div class="col-2">
		<a href="/person/new">New Person</a>
	</div>
	<div class="col-2">
		<a href="/license/new">New License</a>
	</div>
</div>
	<div class="row ">
		<h1>New Person</h1>
		
		<div class="col-2">
		<form:form action="/person/new" method="POST" modelAttribute="person">
			<form:label class="form-label" path="firstName">First Name</form:label>
			<form:errors path="firstName"/>
			<form:input class="form-control" path="firstName"/>
			
			<form:label class="form-label" path="lastName">Last Name</form:label>
			<form:errors path="lastName"/>
			<form:input class="form-control" path="lastName"/>
		<input type="submit" value="Create">
		</form:form>
		</div>
		
	</div>
	
</body>
</html>