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
	<div class="row ">
		<h1>New Person</h1>
		<form:form action="/createPerson" method="POST" modelAttribute="person">
		<div class="col-2">
			<form:label class="form-label" path="firstName">First Name</form:label>
			<form:errors path="firstName"/>
			<form:input class="form-control" path="firstName"/>
			<form:label class="form-label" path="lastName">Last Name</form:label>
			<form:errors path="lastName"/>
			<form:input class="form-control" path="lastName"/>
		<input type="submit" value="Create">
		</div>
		</form:form>
	</div>
	
</body>
</html>