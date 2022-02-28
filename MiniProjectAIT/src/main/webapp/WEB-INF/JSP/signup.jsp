<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addsignup" method="post">
<h1>Sign UP</h1>
<table >
<tr>
<th>UserName</th><td><input type="text"  name="userName"></td>
</tr>
<tr>
<th>Password</th><td><input type="password"  name="password"></td>
</tr>
<tr>
<th>Email</th><td><input type="text"  name="email"></td>
</tr>
<tr>
<th>Mobile</th><td><input type="number"  name="mobile"></td>
</tr>

<tr>
<td colspan="2"><input type="submit" value="submit"></td>
</tr>
</table>

</body>
</html>