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
	<div class="container">
		<div class="row">
			<div class="col-4 offset-1">
				<h2>Register</h2>
				<form:form action="/registration" method="POST" modelAttribute="user">
				
					<form:label path="firstName" class="form-label">First Name :</form:label>
					<form:errors path="firstName"/>
					<form:input path="firstName" class="form-control" type="text"/>
					
					<form:label path="lastName" class="form-label">Last Name :</form:label>
					<form:errors path="lastName"/>
					<form:input path="lastName" class="form-control" type="text"/>
					
					<form:label path="city" class="form-label">City :</form:label>
					<form:errors path="city"/>
					<form:input path="city" class="form-control" type="text"/>
					
					<form:label path="state" class="form-label">State(2 letter abbreviation) :</form:label>
					<form:errors path="state"/>
					<form:input path="state" class="form-control" type="text"/>
					
					<form:label path="email" class="form-label">Email :</form:label>
					<form:errors path="email"/>
					<form:input path="email" class="form-control" type="email"/>
					
					<form:label path="password" class="form-label">Password :</form:label>
					<form:errors path="password"/>
					<form:input path="password" class="form-control" type="password"/>
					
					<form:label path="passwordConfirmation" class="form-label">Confirm Password :</form:label>
					<form:errors path="passwordConfirmation"/>
					<form:input path="passwordConfirmation" class="form-control" type="password"/>
					
					<input type="submit" value="Register" class="btn btn-primary mt-3">
				
				</form:form>
			
			</div>
			<div class="col-4 offset-2">
				<h2>Login</h2>
				${error}
				<form action="/login" method="POST">
					<label for="loginEmail" class="form-label">Email :</label>
					<input type="email" id="loginEmail" class="form-control" name="loginEmail"/>
					
					<label for="loginPassword" class="form-label">Password :</label>
					<input type="password" id="loginPassword" class="form-control" name="loginPassword"/>
				
					<input type="submit" value="Login" class="btn btn-success mt-3"/>
				</form>
				
			</div>
		
		</div>
	
	</div>

	
</body>
</html>