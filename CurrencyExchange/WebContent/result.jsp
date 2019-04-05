<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
</head>
<body>
<table border="1">
<tr>
<td>INR</td>
<td>USD</td>
<tr>
<tr>
<td><%= session.getAttribute("amount") %></td>
<td><%= session.getAttribute("exchangedAmount") %></td>
</tr>
</table>
</body>
</html>