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
		<div class="col-2 offset-2">
			<a href="/category/new">New Category</a>
		</div>
		<div class="col-2">
			<a href="/product/new">New Product</a>
		</div>
	</div>
	<div class="row">
		<h1 class="offset-2"><c:out value="${thisCategory.name}"/></h1>
		<div class="col-4 offset-2">
			<h2 class="text-info">Products in Category :</h2>
			<c:forEach items="${thisCategory.products}" var="product">
			<ul>
				<li><h3 class="text-secondary">${product.name}</h3></li>
			</ul>
			</c:forEach>
		</div>
		<div class="col-4">
			<form action="/category/${id}" method="POST">
				<select name="productToAdd">
					<c:forEach items="${products}" var="productsNotInCat">
						<option value="${productsNotInCat.id}">${productsNotInCat.name}</option>
					</c:forEach>
				</select>
				<button class="btn btn-success">Add Product</button>			
			</form>
		
		</div>
	</div>
	
	
</body>
</html>