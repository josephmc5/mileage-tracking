<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Mileage Logger</title>
</head>
<body>
<h1>Mileage Logger</h1>

<p>${message}</p>

<h3>Vehicles</h3>
<p><a href="${pageContext.request.contextPath}/vehicle/add">Add new vehicle</a></p>
<p><a href="${pageContext.request.contextPath}/vehicle/list">Vehicle list</a></p>

<h3>Employees</h3>
<p><a href="${pageContext.request.contextPath}/employees/add">Add new employee</a></p>
<p><a href="${pageContext.request.contextPath}/employees/list">Employee list</a></p>

<h3>Logs</h3>
<p><a href="${pageContext.request.contextPath}/employees/add">Add new log entry</a></p>
<p><a href="${pageContext.request.contextPath}/employees/list">Log list</a></p>
</body>
</html>
