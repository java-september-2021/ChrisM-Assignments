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
			<div class="col-5 offset-1">
				<h1><c:out value="${event.eventName}"/></h1>
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
				
				</div>
				<div class="row">
					<form:form action="events/newMessage" method="POST" modelAttribute="message">
						
						<form:label path="messageText" class="form-label">Add Comment</form:label>
						<form:errors path="messageText"/>
						<form:input path="messageText" class="form-control" type="text"/>
						
						<button class="btn btn-primary">Submit</button>
					</form:form>
				</div>
			</div>
		
		</div>
	</div>
</body>
</html>