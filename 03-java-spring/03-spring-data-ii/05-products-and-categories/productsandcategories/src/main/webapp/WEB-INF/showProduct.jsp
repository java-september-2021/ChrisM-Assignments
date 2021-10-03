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
		<div class="col-2 offset-2">
			<a href="/category/new">New Category</a>
		</div>
		<div class="col-2">
			<a href="/product/new">New Product</a>
		</div>
	</div>
	<div class="row">
		<h1 class="offset-2"><c:out value="${thisProduct.name}"/></h1>
		<div class="col-4 offset-2">
			<h2 class="text-info">Categories this Product Belongs to :</h2>
			<c:forEach items="${thisProduct.category}" var="category">
			<ul>
				<li><h3 class="text-secondary">${category.name}</h3></li>
			</ul>
			</c:forEach>
		</div>
		<div class="col-4">
			<form action="/product/${id}" method="POST">
				<select name="categoryToAdd">
					<c:forEach items="${categories}" var="categoryNotProd">
						<option value="${categoryNotProd.id}">${categoryNotProd.name}</option>
					</c:forEach>
				</select>
				<button class="btn btn-success">Add Category</button>			
			</form>
		
		</div>
	</div>
	
</body>
</html>