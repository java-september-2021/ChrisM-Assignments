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
		
		<div class="col-3 offset-3">
		<h1><c:out value="${book.title}"/></h1>
		<h3><c:out value="${book.description}"/></h3>
		<h3><c:out value="${book.language}"/></h3>
		<h3><c:out value="${book.numberOfPages}"/></h3>
		<a href="/books/${book.id}/edit">Edit Book</a>
		<form action="/books/${book.id}/delete">
			<input type="hidden" name="_method" value="delete">
			<input type="button" class="btn btn-danger" value="Delete">
		</form>
		</div>
	
	</div>
	
</body>
</html>
