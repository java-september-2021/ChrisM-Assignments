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
		<div class="col-6 ">
			<h1>Welcome, <c:out value="${user.firstName}!"/> </h1>
		</div>
		<div class="col-2 offset-3">
			<a href="/logout" class="btn btn-danger mt-2">Logout</a>
		</div>		
	</div>
	<div class="row">
		<div class="col-6 offset-1">
			<div class="form-row">
				<form:form action="/events/${event.id}/edit" method="POST" modelAttribute="event">
					<form:label class="col-sm-2 col-form-label" path="eventName">Event Name:</form:label>
					<form:errors path="eventName"/>
					<form:input path="eventName" type="text" class="form-control col-sm-3" value="${event.eventName}"/>
					
					<form:label class="col-sm-2 col-form-label" path="eventDate">Date</form:label>
					<form:errors path="eventDate"/>
					<form:input path="eventDate" type="date" class="form-control col-sm-3"/>
					
					<form:label class="col-sm-2 col-form-label" path="city">City</form:label>
					<form:errors path="city"/>
					<form:input path="city" type="text" class="form-control col-sm-3" value="${event.city}" />
					
					<form:label class="col-sm-3 col-form-label" path="state">State (Choose from list)</form:label>
					<form:errors path="state"/>
					<form:select class="form-control col-sm-3" path="state">
						<c:forEach items="${states}" var="state">
							<option value="${state}">${state}</option>
							<option selected value="${event.state}">${event.state}</option>
						</c:forEach>
					</form:select>
					<button class="btn btn-primary mt-3">Update Event</button>
				</form:form>
				</div>
		</div>
	</div>	
</div>
	
</body>
</html>