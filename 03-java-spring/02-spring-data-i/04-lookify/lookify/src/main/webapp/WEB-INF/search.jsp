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
			
			<form action="/search" method="POST">
			<input type="text" name="searchBox" >
		
			<a href="/new"><input type="button" class="btn btn-warning" value="Search by Artist"></a>
			</form>
		</div>
	</div>
	<div class="row justify-content-center">
		<div class="col-6">
		
			<ul class="list-group mt-3">
				<c:forEach items="${songs}" var="thisSong">
				<li class="list-group-item"><h3><c:out value="${thisSong.rating}"/> -<a href="/songs/${thisSong.id}"> <c:out value="${thisSong.songName}"/></a> - <c:out value="${thisSong.artistName}"/></h3></li>
				<!-- TODO: Needs a Delete! -->
				</c:forEach>
			</ul>
		
		</div>
	
	</div>
</body>
</html>