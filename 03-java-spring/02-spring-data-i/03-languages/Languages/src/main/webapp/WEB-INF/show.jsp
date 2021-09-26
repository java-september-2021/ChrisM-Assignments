<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" href="/css/main.css"/>
	<meta charset="ISO-8859-1">
	<title><c:out value="${thisLanguage.languageName}"/></title>
</head>
<body>
	<div class="row">
		<div class="col-3 offset-5">
			<a href="/languages"><input type="button" class="btn btn-info" value="Dashboard"></a>
		
		
		</div>
	
	</div>
	<div class="row">
		<div class="col-2 offset-3">
			<h3>Creator</h3>
			<h3>Language</h3>
			<h3>Version</h3>
			<a href="/languages/${thisLanguage.id}/delete"><input type="submit" class="btn btn-danger" value="Delete"></a>
				
		
		</div>
		<div class="col-3">
			<h3><c:out value="${thisLanguage.creator}"/></h3>
			<h3><c:out value="${thisLanguage.languageName}"/></h3>
			<h3><c:out value="${thisLanguage.version}"/></h3>
			<a href="/languages/${thisLanguage.id}/edit"><input type="button" class="btn btn-success" value="Edit"></a>
		</div>
	</div>
	
</body>
</html>