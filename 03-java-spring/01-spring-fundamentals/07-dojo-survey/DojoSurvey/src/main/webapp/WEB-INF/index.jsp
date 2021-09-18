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
	<div class="col-6 offset-4">
		<form class="form-inline" action="/survey" method="POST">
		<div class="row mt-3">
		<div class="col-3">
				<label for="name">Your Name</label>
			</div>
			<div class="col-3">
			<input type="text" class="form-control" name="name"></input>
			</div>
		</div>
		<div class="row mt-3">
			<div class="col-3">
				<label for="Location">Dojo Location</label>
			</div>
			<div class="col-3">
			<select class="form-control" name="location">
					<option>San-Jose</option>
					<option>Burbank</option>
					<option>Seattle</option>
				</select>
			</div>
		</div>
		<div class="row mt-3">
		<div class="col-3">
				<label for="language">Favorite Language</label>
		</div>
			<div class="col-3">
				<select class="form-control" name="language">
					<option>Java</option>
					<option>C#</option>
					<option>JavaScript</option>
					<option>Python</option>
				</select>
			</div>
		</div>
		<div class="form-group col-6 mt-3 mb-3">
				<label class="mb-3" for="comment">Comment (Optional)</label>
				<textarea class="form-control" name="comment" rows="3" cols="60"></textarea>
			</div>
			<input type="submit" class="btn btn-primary">
		</form>
	</div>
</body>
</html>
