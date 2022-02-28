<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="st">
<script src="https://cdn.jsdelivr.net/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<%
if(session!=null)
{
RequestDispatcher rd=request.getRequestDispatcher("home");
rd.forward(request,response);
}

%>
<H3>${status}</H3>
<form action="validateuser" method="get">
<h1>Sign in Details</h1>

<table>
<tr>
<th>UserName</th><td><input type="text"  name="userName"></td>
</tr>
<tr>
<th>Password</th><td><input type="password"  name="password"></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="submit"></td>
</tr>
</table>


</form>
</body>
</html>