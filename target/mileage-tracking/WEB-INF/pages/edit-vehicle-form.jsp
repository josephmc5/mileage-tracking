<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<?xml version="1.0" encoding="ISO-8859-1" ?>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Edit vehicle page</title>
</head>
<body>
<h1>Edit vehicle page</h1>
<p>Here you can edit the existing vehicle.</p>
<p>${message}</p>
<form:form method="POST" commandName="vehicle" action="${pageContext.request.contextPath}/vehicle/edit/${vehicle.id}.html">
<table>
<tbody>
	<tr>
		<td>Make:</td>
		<td><form:input path="make" /></td>
	</tr>
	<tr>
		<td>Model:</td>
		<td><form:input path="model" /></td>
	</tr>
	<tr>
		<td>Year:</td>
		<td><form:input path="year" /></td>
	</tr>
	<tr>
		<td>Mileage:</td>
		<td><form:input path="mileage" /></td>
	</tr>
	<tr>
		<td>Plate:</td>
		<td><form:input path="plate" /></td>
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
