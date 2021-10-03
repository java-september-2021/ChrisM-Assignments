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
	<title>New Product</title>
</head>
<body>
	<div class="row">
		<div class="col-2 offset-2">
			<a href="/category/new">New Category</a>
		</div>
		<div class="col-2">
			<a href="/product/new">New Product</a>
		</div>
	</div>
	<div class="row">
		<h1 class="offset-2">New Product</h1>
		<div class="col-3 offset-2">
			<form:form action="/product/new" method="POST" modelAttribute="product">
				
				<form:label path="name" class="form-label">Name : </form:label>
				<form:errors path="name"/>
				<form:input path="name" type="text" class="form-control"/>
				
				<form:label path="description" class="form-label">Description : </form:label>
				<form:errors path="description"/>
				<form:input path="description" type="text" class="form-control"/>
				
				<form:label path="price" class="form-label">Price : </form:label>
				<form:errors path="price"/>
				<form:input path="price" type="text" class="form-control"/>
				
				<button class="btn btn-primary mt-3">Create</button>
				
			</form:form>
			
		</div>
	</div>
</body>
</html>