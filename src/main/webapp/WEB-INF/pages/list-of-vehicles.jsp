<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<?xml version="1.0" encoding="ISO-8859-1" ?>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>List of vehicles</title>
</head>
<body>
<h1>List of vehicles</h1>
<p>Here you can see the list of the vehicles, edit them, remove or update.</p>
<table border="1px" cellpadding="0" cellspacing="0" >
<thead>
<tr>
	<th width="10%">id</th>
	<th width="15%">Make</th>
	<th width="10%">Model</th>
	<th width="10%">Year</th>
	<th width="10%">Mileage</th>
	<th width="10%">Plate</th>
	<th width="10%">actions</th>
</tr>
</thead>
<tbody>
<c:forEach var="vehicle" items="${vehicles}">
<tr>
	<td>${vehicle.id}</td>
	<td>${vehicle.make}</td>
	<td>${vehicle.model}</td>
	<td>${vehicle.year}</td>
	<td>${vehicle.mileage}</td>
	<td>${vehicle.plate}</td>
	<td>
	<a href="${pageContext.request.contextPath}/vehicle/edit/${vehicle.id}.html">Edit</a><br/>
	<a href="${pageContext.request.contextPath}/vehicle/delete/${vehicle.id}.html">Delete</a><br/>
	</td>
</tr>
</c:forEach>
</tbody>
</table>

<p><a href="${pageContext.request.contextPath}/index.html">Home page</a></p>

</body>
</html>
