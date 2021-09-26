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
	<h1 class="offset-2">Add A New Language</h1>
	<form:form action="/languages/new" method="POST" modelAttribute="language">
	<div class="row mb-3">
	<div class="col-3 form-group offset-2">
		<form:label class="me-3" path="creator">Creator</form:label>
		<form:errors path="creator"/>
		<form:input path="creator"/>
		</div>
	</div>
	<div class="row mb-3">
		<div class="col-3 form-group offset-2">
			<form:label path="languageName">Language</form:label>
			<form:errors path="languageName"/>
			<form:input path="languageName"/>
		</div>
	</div>
	<div class="row mb-3">
		<div class="col-3 form-group offset-2">
			<form:label class="me-3" path="version">Version</form:label>
			<form:errors path="version"/>
			<form:input path="version"/>
		</div>
	</div>
	<div class="row">
		<div class="col-3 form-group offset-2">
			<input type="submit" value="Submit"/>
		</div>
	</div>
	</form:form>
	</div>
</body>
</html>