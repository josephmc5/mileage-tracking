<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<?xml version="1.0" encoding="ISO-8859-1" ?>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Edit employee page</title>
</head>
<body>
<h1>Edit employee page</h1>
<p>Here you can edit the existing employee.</p>
<p>${message}</p>
<form:form method="POST" commandName="employee" action="${pageContext.request.contextPath}/employee/edit/${employee.id}">
<table>
<tbody>
	<tr>
		<td>First Name:</td>
		<td><form:input path="firstName" /></td>
	</tr>
	<tr>
		<td>Last Name:</td>
		<td><form:input path="lastName" /></td>
	</tr>
	<tr>
		<td>Phone Number:</td>
		<td><form:input path="phoneNumber" /></td>
	</tr>
	<tr>
		<td><input type="submit" value="Edit" /></td>
		<td></td>
	</tr>
</tbody>
</table>
</form:form>

<p><a href="${pageContext.request.contextPath}/index.html">Home page</a></p>
</body>
</html>
