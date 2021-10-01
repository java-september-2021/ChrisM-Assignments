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
<h1>New License</h1>
	<div class="row">
	<form:form action="/license/new" method="POST" modelAttribute="license">
		<div class="col-3">
			<form:label class="me-4" path="person">Person</form:label>
			<form:errors path="person"/>
			<form:select path="person">
				<c:forEach items="${people}" var="thisPerson">
					<option value="${thisPerson.id}">${thisPerson.firstName} ${thisPerson.lastName}</option>
				</c:forEach>
			</form:select>
			<form:label class="me-4" path="state">State : </form:label>
			<form:errors path="state"/>
			<form:input path="state" type="text"/>
			
			<form:label class="me-4" path="expiration_date">Expiration Date</form:label>
			<form:errors path="expiration_date"/>
			<form:input path="expiration_date" type="date"/>
			<input type="submit" value="Submit"/>
		</div>
	</form:form>
	</div>
	
</body>
</html>