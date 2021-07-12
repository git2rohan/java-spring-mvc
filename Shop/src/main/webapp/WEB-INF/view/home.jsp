<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3>Welcome dear customer</h3>

<p>Place your order from here</p>

<form action="processOrder" method="post">
	  
	<input type="text" name="customer_name" placeholder="customer name"><br>
	<input type="text" name="customer_email" placeholder="email"><br>
	<input type="text" name="customer_order" placeholder="order item">
	
	<input type="submit">
</form>

</body>
</html>