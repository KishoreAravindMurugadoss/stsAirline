<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ include file = "menuBill.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Generated Bill</title>
</head>
<body>
<h2>Generated Bill</h2>
<form action="updateBillpass" method ="post">
<pre>
<input type="hidden" name="id" value="${bill.id}">

First Name 	: <input type ="text" name ="passengerFirstName" value="${bill.passengerFirstName}">

Last Name 	: <input type ="text" name ="passengerLastName" value="${bill.passengerLastName}">

Email ID 	: <input type ="text" name ="passengerEmail" value="${bill.passengerEmail}">

Mobile No. 	: <input type ="text" name ="passengerMobile" value="${bill.passengerMobile }">

Quantity 	: <input type ="number" name ="qty" value="${bill.qty }">

Description : <input type ="text" name ="desp" value="${bill.desp }">

Price 		: <input type ="number" name ="price" value="${(bill.qty)*8000 }">
			
				<input type="button" value="Print Bill">
</pre>
</form>
</body>
</html>