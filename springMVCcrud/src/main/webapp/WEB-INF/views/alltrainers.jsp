<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>List of Trainers</title>

	<style>
		tr:first-child{
			font-weight: bold;
			background-color: #C6C9C4;
		}
	</style>

</head>


<body>
	<h2>List of Trainers</h2>	
	<table>
		<tr>
			<td>First Name</td><td>Last Name</td><td>Trainer's Subject</td>
		</tr>
		<c:forEach items="${trainers}" var="trainer">
			<tr>
			<td>${trainer.fname}</td>
			<td>${trainer.lname}</td>
			<td>${trainer.subject}</td>
			<td><a href="<c:url value='/edit-${trainer.id}-trainer' />">${trainer.id}</a></td>
			<td><a href="<c:url value='/delete-${trainer.id}-trainer' />">delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br/>
	<a href="<c:url value='/new' />">Add New Trainer</a>
</body>
</html>