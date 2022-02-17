<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@page import="com.ait.Model.Student" isELIgnored="false" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>welcome</h1>
<br>
<h3>${sobj.getname()}</h3>

${stud}
<table border="2">
<tr>
<th>ID</th>
<th>Name</th>
<th>Percent</th>
<th>City</th>
<th>Action</th>
</tr>

<tr>
<td>${s1.getSid()}</td>
<td>${s1.getSname()}</td>
<td>${s1.getPercent()}</td>
<td>${s1.getCity()}</td>
<td><a href="Edit?sid=${s1.getSid()}">Edit</a> &nbsp;&nbsp;<a href="Delete">Delete</a></td>
</tr>


</body>
</html>