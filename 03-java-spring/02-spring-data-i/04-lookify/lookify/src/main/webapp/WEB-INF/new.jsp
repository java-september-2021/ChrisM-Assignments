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
	<title>Add a new Song</title>
</head>
<body>
	<div class="row mt-5">
		<div class="col-1 offset-2">
			<a href="/dashboard"><input type="button" class="btn btn-primary" value="Dashboard"></a>
		</div>
		<div class="col-2">
			<a href="/songs/top"><input type="button" class="btn btn-info" value="Top Songs"></a>
		</div>
		<div class="col-4 offset-3 form-group">
			
			<form action="/search" method="POST">
			<input type="text" name="searchBox" >
		
			<a href="/search"><input type="button" class="btn btn-warning" value="Search by Artist"></a>
			</form>
		</div>
	</div>
	<div class="row justify-content-center">
		<form:form action="/songs/new" method="POST" modelAttribute="music">
		<div class="col-5 offset-3">
			<div class="row justify-content-center">
				<div class="form-group col-5">
					<form:label class="form-label" path="songName">Title</form:label>
					<form:errors path="songName"/>
					<form:input class="form-control" path="songName"/>
				</div>
			</div>
			<div class="row justify-content-center">
				<div class="form-group col-5">
					<form:label class="form-label" path="artistName">Artist</form:label>
					<form:errors path="artistName"/>
					<form:input class="form-control" path="artistName"/>
				</div>
			</div>
			<div class="row justify-content-center">
				<div class="form-group col-5">
					<form:label class="form-label" path="rating">Rating (1-10)</form:label>
					<form:errors path="rating"/>
					<form:input class="form-control" path="rating"/>
					<input type="submit" class="btn btn-success mt-3" value="Add Song">	
				</div>
			</div>
		</div>
		</form:form>
	</div>
	
</body>
</html>