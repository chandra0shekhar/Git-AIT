<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
${cartlist}
<div class="container" mt-3>
<c:if test="${cartlist==null}">
<h1>your cart is empty</h1>
</c:if>

<c:if test="${cartlist!=null}">
<form action="place-order">

<h2>hi <%=session.getAttribute("username") %></h2>
<p>View your cart</p>
<% int total=0; %>
<table class="table table-striped">
<thead>
<tr>
<th>Name</th>
<th>Price</th>
<th>Quantity</th>
<th>amount</th>th>
</tr>
</thead>
<tbody>
 <c:forEach var="p" items="${cartlist}"> 
<tr>
<td>${p.getProductname()}</td>
<td>${p.getPrice()}</td>
<td>${p.getQty()}</td>
<td>${p.getQty()*p.getPrice()}</td>

</tr>

</c:forEach>
</tbody>

</table>
Total amount: ${total}
<br>
<input type="submit" value="place order">
</c:if>
</form>
</div>
<br>
<h4><a href="/viewproducts">Back to view products</a></h4>
</body>
</html>