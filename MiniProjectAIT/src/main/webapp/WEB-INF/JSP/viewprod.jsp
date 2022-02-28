<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Products</h1>
<h3 align="center"><a href="viewcart">View Cart</a></h3>
<table border="1" >
<tr>
<th>Name</th>
<th>Description</th>
<th>Price</th>
<td>Action</td>
</tr>
<c:forEach  var="p1" items="${productlist}">
<tr>
<td>${p1.getName()}</td>
<td>${p1.getDescription()}</td>
<td>${p1.getPrice()}</td>
<td><a href="cart?id=${p1.getProductId()}">Add to Cart</a>
</td>
</tr>
</c:forEach>
</table>
</body>
</html>