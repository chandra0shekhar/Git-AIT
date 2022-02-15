<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.List,com.model.Student" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2">

<tr>
<c:forEach var="s1" items="${studlist}"></c:forEach>
<th>id</th>
<th>Name</th>
<th>Persent</th>
<th>City</th>
<td>Action</td>
</tr>
<td>${s1.getSid()}</td>
<td>${s1.getSname()}</td>
<td>${s1.getPersent()}</td>
<td>${s1.getCity()}</td>
<td><a href="edit?id=${s1.getSid()}">Edit</a>
<a href="delete?id=${s1.getSid()}">Delete</a>
</td>
</table>
</body>
</html>