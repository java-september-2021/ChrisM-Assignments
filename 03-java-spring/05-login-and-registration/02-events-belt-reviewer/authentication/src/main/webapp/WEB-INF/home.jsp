<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
			<div class="col-8">
				<p>Here are some of the events in your state</p>
				<table class="table table-info table-striped border-primary">
					<thead>
						<tr>
							<th>Name</th>
							<th>Date</th>
							<th>Location</th>
							<th>Host</th>
							<th>Action / Status</th>
						</tr>
					</thead>
					<tbody>
					<c:forEach items="${eventsInState}" var="event">
						<tr>
							<td><a href="/events/${event.id}">${event.eventName}</a></td>
							<td><fmt:formatDate pattern="MMMM dd, yyyy" value="${event.eventDate}"/> </td>
							<td>${event.city}</td>
							<td>${event.eventCreator.firstName}</td>
							<td>
							<c:choose>
								<c:when test="${event.participants.contains(user)}">
									<a href="/events/${event.id}/unjoin">Unjoin</a>
								</c:when>
								<c:otherwise>
									<a href="/events/${event.id}/join">Join</a>
								</c:otherwise>
							</c:choose>
							</td>
						</tr>
					</c:forEach>
						
					</tbody>
				</table>
			</div>
		</div>
		<div class="row">
			<div class="col-8">
				<p>Here are some of the events in other states</p>
				<table class="table table-success table-striped border-primary">
					<thead>
						<tr>
							<th>Name</th>
							<th>Date</th>
							<th>Location</th>
							<th>State</th>
							<th>Host</th>
							<th>Action / Status</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${outOfStateEvents}" var="event">
						<tr>
							<td><a href="/events/${event.id}">${event.eventName}</a></td>
							<td><fmt:formatDate pattern="MMMM dd, yyyy" value="${event.eventDate }"/> </td>
							<td>${event.city}</td>
							<td>${event.state}</td>
							<td>${event.eventCreator.firstName} ${event.eventCreator.lastName}</td>
							<td><c:choose>
							<c:when test="${event.participants.contains(user)}">
								<a href="/events/${event.id}/unjoin">UnJoin </a>
							</c:when>
							<c:otherwise>
								<a href="/events/${event.id}/join">Join </a>
							</c:otherwise>
							</c:choose>
							<c:choose>
							<c:when test="${user.id == event.eventCreator.id}">
								<a href="events/${event.id}/edit">&nbsp&nbsp Edit</a>
								<a href="events/${event.id}/delete">Delete</a>
							</c:when>
							
							</c:choose>
							</td>
						</tr>
					</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
		<div class="row">
			<h3>Create an Event</h3>
			<div class="col-8">
				<div class="form-row">
				<form:form action="/events" method="POST" modelAttribute="event">
					<form:label class="col-sm-2 col-form-label" path="eventName">Event Name:</form:label>
					<form:errors path="eventName"/>
					<form:input path="eventName" type="text" class="form-control col-sm-3"/>
					
					<form:label class="col-sm-2 col-form-label" path="eventDate">Date</form:label>
					<form:errors path="eventDate"/>
					<form:input path="eventDate" type="date" class="form-control col-sm-3"/>
					
					<form:label class="col-sm-2 col-form-label" path="city">City</form:label>
					<form:errors path="city"/>
					<form:input path="city" type="text" class="form-control col-sm-3"/>
					
					<form:label class="col-sm-3 col-form-label" path="state">State (Choose from list)</form:label>
					<form:errors path="state"/>
					<form:select class="form-control col-sm-3" path="state">
						<c:forEach items="${states}" var="state">
						<option value="${state}">${state}</option>
						</c:forEach>
					</form:select>
					<button class="btn btn-primary mt-3">Create Event</button>
				</form:form>
				</div>
			</div>
		
		</div>
	</div>
	
	
</body>
</html>