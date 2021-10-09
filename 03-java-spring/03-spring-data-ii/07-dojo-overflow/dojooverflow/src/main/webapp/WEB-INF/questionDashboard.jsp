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
<div class="container">
	<div class="row justify-items-center">
		<div class="col-2">
			<a href="/questions">Questions Dashboard</a>
		</div>
		<div class="col-2">
			<a href="/questions/new">New Question</a>
		</div>
	</div>
	<div class="row justify-items-center">
 		<div class="col-9 justify-self-center">
 			<h1>Questions Dashboard</h1>
 			<table class="table table-primary table-striped">
 				<thead>
 					<tr>
 						<th>Question</th>
 						<th>Tags</th>
 					</tr>
 				</thead>
 				<tbody>
 				<c:forEach items="${allQuestions}" var="question">
 					<tr>
 						<td>${question.questionContent}</td>
 						<td>Fill me in</td>
 					</tr>
 					</c:forEach>
 				</tbody>
 			</table>
 			
 		</div>
 	</div>
</div>
</body>
</html>