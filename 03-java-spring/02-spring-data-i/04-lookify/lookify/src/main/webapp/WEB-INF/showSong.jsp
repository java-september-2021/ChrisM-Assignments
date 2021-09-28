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
	<div class="row mt-5">
		<div class="col-1 offset-2">
			<a href="/songs/new"><input type="button" class="btn btn-primary" value="Add New"></a>
		</div>
		<div class="col-2">
			<a href="/songs/top"><input type="button" class="btn btn-info" value="Top Songs"></a>
		</div>
		<div class="col-4 offset-3 form-group">
			<a href="/dashboard"><input type="button" class="btn btn-primary" value="Dashboard"></a>
		</div>
	</div>
	<div class="row justify-content-center mt-5">
		<div class="col-1">
			<h3>Title</h3>
		</div>
		<div class="col-4">
			<h3><c:out value="${thisSong.songName}"/></h3>
		</div>
	</div>
	<div class="row justify-content-center mt-5">
		<div class="col-1">
			<h3>Artist</h3>
		</div>
		<div class="col-4">
			<h3><c:out value="${thisSong.artistName}"/></h3>
		</div>
	</div>
	<div class="row justify-content-center mt-5">
		<div class="col-1">
			<h3>Rating</h3>
		</div>
		<div class="col-4">
			<h3><c:out value="${thisSong.rating}"/></h3>
		</div>
	</div>
	<div class="row">
		<div class="col-5 offset-2">
			<a href="/${thisSond.id}/delete"><input type="button" class="btn btn-danger" value="Delete"></a>
		</div>
	</div>
				
				
				
				
		
	
	
	
	
</body>
</html>