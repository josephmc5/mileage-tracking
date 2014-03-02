<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<?xml version="1.0" encoding="ISO-8859-1" ?>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>List of employees</title>
</head>
<body>
<h1>List of employees</h1>
<p>Here you can see the list of the employees, edit them, remove or update.</p>
<table border="1px" cellpadding="0" cellspacing="0" >
<thead>
<tr>
	<th width="10%">id</th>
	<th width="15%">First name</th>
	<th width="10%">Last name</th>
	<th width="10%">Phone Number</th>
</tr>
</thead>
<tbody>
<c:forEach var="employee" items="${employees}">
<tr>
	<td>${employee.id}</td>
	<td>${employee.firstName}</td>
	<td>${employee.lastName}</td>
	<td>${employee.phoneNumber}</td>
	<td>
	<a href="${pageContext.request.contextPath}/employee/edit/${employee.id}.html">Edit</a><br/>
	<a href="${pageContext.request.contextPath}/employee/delete/${employee.id}.html">Delete</a><br/>
	</td>
</tr>
</c:forEach>
</tbody>
</table>

<p><a href="${pageContext.request.contextPath}/index">Home</a></p>

</body>
</html>
