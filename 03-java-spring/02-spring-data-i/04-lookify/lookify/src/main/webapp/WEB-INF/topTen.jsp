<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" href="/css/main.css"/>
	<meta charset="ISO-8859-1">
	<title>Top Ten Songs</title>
</head>
<body>
	<div class="row mt-5">
		<div class="col-1 offset-2">
			<a href="/songs/new"><input type="button" class="btn btn-primary" value="Add New"></a>
		</div>
		<div class="col-2">
			<a href="/dashboard"><input type="button" class="btn btn-info" value="Dashboard"></a>
		</div>
		<div class="col-4 offset-3 form-group">
			<!-- This needs reworked.  Trying to get this to pass the artist name somehow -->
			<form action="/search" method="GET">
			<input type="text" name="searchBox" >
		
			<a href="/search"><input type="submit" class="btn btn-warning" value="Search by Artist"></a>
			</form>
		</div>
	</div>
	<div class="row justify-content-center">
		<div class="col-6">
		<h1 class="mt-3 text-center text-primary">Top 10 Songs Right Now</h1>
			<ul class="list-group mt-3">
				<c:forEach items="${topMusic}" var="thisSong">
				<li class="list-group-item"><h3><c:out value="${thisSong.rating}"/> -<a href="/songs/${thisSong.id}"> <c:out value="${thisSong.songName}"/></a> - <c:out value="${thisSong.artistName}"/></h3></li>
				</c:forEach>
			</ul>
		
		</div>
	
	</div>
</body>
</html>