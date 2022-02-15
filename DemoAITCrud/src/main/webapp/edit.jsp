<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Edit Details</h1>
<form action="save">
Sid:<input type="text" name="sid" value="${sobj.getSid()}">
<br>
Name:<input type="text" name="sname" value="${sobj.getName()}">
<br>
Persent:<input type="text" name="persent" value="${sobj.getPersent()}">
<br>
City:<input type="text" name="city" value="${sobj.getCity()}">
<br>
<input type="submit" value="save">
</form>

</body>
</html>