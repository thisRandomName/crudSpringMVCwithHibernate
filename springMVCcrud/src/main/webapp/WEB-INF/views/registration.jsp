<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Trainer Registration Form</title>

<style>

	.error {
		color: #ff0000;
	}
</style>

</head>

<body>

	<h2>Registration Form</h2>
 
	<form:form method="POST" modelAttribute="trainer">
		<form:input type="hidden" path="id" id="id"/>
		<table>
			<tr>
				<td><label for="fname">First Name: </label> </td>
				<td><form:input path="fname" id="fname"/></td>
				<td><form:errors path="fname" cssClass="error"/></td>
		    </tr>
                    
                    <tr>
				<td><label for="lname">Last Name: </label> </td>
				<td><form:input path="lname" id="lname"/></td>
				<td><form:errors path="lname" cssClass="error"/></td>
		    </tr>
	    
			<tr>
				<td><label for="subject">Trainer's subject: </label> </td>
				<td><form:input path="subject" id="subject"/></td>
				<td><form:errors path="subject" cssClass="error"/></td>
		    </tr>
	
			
	
			
	
			<tr>
				<td colspan="3">
					<c:choose>
						<c:when test="${edit}">
							<input type="submit" value="Update"/>
						</c:when>
						<c:otherwise>
							<input type="submit" value="Register"/>
						</c:otherwise>
					</c:choose>
				</td>
			</tr>
		</table>
	</form:form>
	<br/>
	<br/>
	Go back to <a href="<c:url value='/list' />">List of All Trainers</a>
</body>
</html>