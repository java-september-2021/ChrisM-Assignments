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
			<div class="col-5 offset-1">
				<h2><c:out value="${event.eventName}"/></h2>
				<p>Host: <c:out value="${event.eventCreator.firstName} ${event.eventCreator.lastName}"/></p>
				<p>Date: <c:out value="${date}"/></p>
				<p>Location : <c:out value="${event.city}, ${event.state}"/></p>
				<p>People who are attending this event : <c:out value="${event.participants.size() }"/></p>
				<table class="table table-danger table-striped border-danger">
						<thead>
						<tr>
							<th>Name</th>
							<th>Location</th>
						</tr>
						</thead>
						<tbody>
							<c:forEach items="${event.participants}" var="participant">
							<tr>
								<td>${participant.firstName} ${participant.lastName}</td>
								<td>${participant.city}</td>	
							</tr>						
							</c:forEach>
						</tbody>
					</table>
			</div>
			
			<div class="col-5">
				<div class="row">
				<h2>Message Wall</h2>
				<table>
					<tr>
						<td></td>
					</tr>
					
				</table>
				<textarea rows="15" cols="35" style="overflow:auto"><c:forEach items="${messages}" var="message">${message.messageCreator.firstName} :: ${message.messageText}&#13;&#10--------------------------------------------------&#13;&#10</c:forEach>
				</textarea>
				</div>
				<div class="row">
					<form:form action="/events/${event.id}" method="POST" modelAttribute="message">
						
						<form:label path="messageText" class="form-label">Add Comment</form:label>
						<form:errors path="messageText"/>
						<form:input path="messageText" class="form-control" type="text"/>
						
						<button class="btn btn-primary mt-3">Submit</button>
					</form:form>
				</div>
			</div>
		
		</div>
	</div>
</body>
</html>