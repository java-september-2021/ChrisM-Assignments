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
	<div class="col-2">
		<a href="/person/new">New Person</a>
	</div>
	<div class="col-2">
		<a href="/license/new">New License</a>
	</div>
</div>
	<h1><c:out value="${thisPerson.firstName} ${thisPerson.lastName}"/></h1>
	<div class="row">
		<div class="col-2">
			<h4>License Number :</h4>
			<h4>State :</h4>
			<h4>Expiration Date :</h4>
		</div>
		<div class="col-2">
			<h4><c:out value="${thisPerson.license.stringifyLicenseNumber()}"/> </h4>
			<h4><c:out value="${thisPerson.license.state}"/></h4>
			<h4><c:out value="${thisPerson.license.getFormattedExpiration_date()}"/></h4>
		</div>
	</div>
	
</body>
</html>