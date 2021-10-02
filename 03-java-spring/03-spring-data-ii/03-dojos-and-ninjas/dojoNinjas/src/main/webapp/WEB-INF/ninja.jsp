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
	<title>New Ninja</title>
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
		<h1 class="offset-2">New Ninja</h1>
	</div>
	<div class="row">
		<div class="col-3 offset-2">
			<form:form action="/ninja/new" method="POST" modelAttribute="ninja">
				<form:label class="form-label" path="firstName">First Name :</form:label>
				<form:errors path="firstName"/>
				<form:input class="form-control" type="text" path="firstName"/>
				
				<form:label class="form-label" path="lastName">Last Name :</form:label>
				<form:errors path="lastName"/>
				<form:input class="form-control" type="text" path="lastName"/>
				
				<form:label class="form-label" path="age">Age : </form:label>
				<form:errors path="age"/>
				<form:input class="form-control" type="text" path="age"/>
				
				<form:label class="form-label" path="dojo">Select Dojo</form:label>
				<form:select class="form-control" path="dojo">
					<c:forEach items="${dojos}" var="dojo">
					<option value="${dojo.id}">${dojo.name}</option>
					</c:forEach>
				</form:select>
				<button class="btn btn-primary mt-3">Create</button>				
			</form:form>
		</div>
		
		</div>
</body>
</html>