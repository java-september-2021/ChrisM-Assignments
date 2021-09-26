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
		<div class="col-4 offset-4">
			<h1>Languages</h1>
		</div>
	</div>
	<div class="row">
		<div class="col-4 offset-4">
		<table class="table table-info table-striped">
			<thead>
				<tr>
					<th>Creator</th>
					<th>Language</th>
					<th>Version</th>
					<th>Stuff</th>
					<th>To</th>
					<th>Do</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${languages}" var="thisLanguage">
					<tr>
						<td><a href="/languages/${thisLanguage.id}"><c:out value="${thisLanguage.creator}"></c:out></a></td>
						<td><a href="/languages/${thisLanguage.id}"><c:out value="${thisLanguage.languageName}"></c:out></a></td>
						<td><c:out value="${thisLanguage.version}"></c:out></td>
						<td><a href="/languages/${thisLanguage.id}"><input type="button" class="btn btn-info" value="View Language"></a></td>
						<td><a href="/languages/${thisLanguage.id}/delete"><input type="submit" class="btn btn-danger" value="Delete"></a></td>
						<td><a href="/languages/${thisLanguage.id}/edit"><input type="button" class="btn btn-success" value="Edit"></a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		</div>
		<div class="row">
		<div class="col-2 offset-4">
			<a href="/languages/new"><input type="button" class="btn btn-primary" value="New Language"></a>
			
		</div>
		</div>
		
	</div>
	
	
	
</body>
</html>