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
			
			<form action="/search" method="GET">
			<input type="text" name="searchBox" >
		
			<input type="submit" class="btn btn-warning" value="Search by Artist">
			</form>
		</div>
	</div>
	<div class="row justify-content-center mt-5">
		<div class="col-8">
			<table class="table table-info table-striped">
				<thead>
					<tr>
						<th>Name</th>
						<th>Rating</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${music}" var="thisSong">
						<tr>
							<td><a href="/songs/${thisSong.id}"><c:out value="${thisSong.songName}"/></a></td>
							<td><c:out value="${thisSong.rating}"/></td>
							<form action="/${thisSong.id}/delete" method="POST">
								<input type="hidden" name="_method" value="delete">
								<td><input type="submit" class="btn btn-danger" value="Delete"></td>
							</form>
						</tr>
					</c:forEach>
				</tbody>
				
			</table>
		</div>
	
	</div>
	
</body>
</html>