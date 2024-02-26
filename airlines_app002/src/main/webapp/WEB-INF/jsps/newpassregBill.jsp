<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file = "menuBill.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Seat Booking</title>
</head>
<body>
<h2>Seat Booking</h2>
<form action="saveBillData">
<pre>

First Name 	:<input type ="text" name ="passengerFirstName" />

Last Name  	:<input type ="text" name ="passengerLastName" />

Email ID   	:<input type ="text" name ="passengerEmail" />

Mobile No. 	:<input type ="text" name ="passengerMobile" />

Quantity   	:<input type="number" name ="qty"/>
		***Note: Price per seat is Rs.8,000/-***

Description :<input type="text" name="desp"/>

			<input type ="submit" value ="Save Bill">
</pre>
</form>

</body>
</html>