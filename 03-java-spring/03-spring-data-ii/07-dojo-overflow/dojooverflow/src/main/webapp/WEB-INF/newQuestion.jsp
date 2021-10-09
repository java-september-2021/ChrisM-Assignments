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
	<div class="row justify-items-center">
		<div class="col-2">
			<a href="/questions">Questions Dashboard</a>
		</div>
		<div class="col-2">
			<a href="/questions/new">New Question</a>
		</div>
	</div>
	<div class="row">
		<div class="col-9">
			<div class="row">
				<h1>What is your question?</h1>
			</div>
			<div class="row">
				<div class="col-5">
				<form:form action="/questions/new" method="POST" modelAttribute="question">
					<form:label path="questionContent" class="form-label">Question:</form:label>
					<form:errors path="questionContent"/>
					<form:textarea path="questionContent" class="form-control"/>
					
					<form:label path="frontEndTagsToSplit" class="form-label">Tags :</form:label>
					<form:errors path="frontEndTagsToSplit"/>
					<form:input path="frontEndTagsToSplit" class="form-control"/>
					
					<button class="btn btn-primary mt-3 float-end">Submit</button>
				
				</form:form>
				</div>
			
			</div>
		
		</div>
	
	</div>
	
</body>
</html>