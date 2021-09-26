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
	<title>Edit Language</title>
</head>
<body>
	<div class="row">
	<h1 class="offset-2">Edit This Language</h1>
	<form:form action="/languages/${thisLanguage.id}/edit" method="POST" modelAttribute="thisLanguage">
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
			<input type="submit" class="btn btn-success" value="Edit Language"/>
		</div>
	</div>
	</form:form>
	<div class="col-3 offset-2 mt-2">
		<a href="/languages/${thisLanguage.id}/delete"><input type="submit" class="btn btn-danger" value="Delete"></a>
	</div>
	<div class="row">
	<div class="col-3 offset-2 mt-2">
		<a href="/languages"><input type="submit" class="btn btn-info" value="Dashboard"></a>
	</div>
	</div>
	
	</div>
</body>
</html>