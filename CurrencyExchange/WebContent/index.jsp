<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Currency Exchange</title>
<script type="text/javascript" src="script.js"></script>
</head>
<body>
	
	<form action="ExchangeServlet" method="GET" name="exchangeForm" onsubmit="return validate();">
		<table>
			<tr>
				<td>Enter the Amount(INR): </td>
				<td><input type="text" name="amount" id="amount"></td>
				<td><input type="submit" value="Convert to USD"></td>
			</tr>
		</table>
	</form>
	
</body>
</html>