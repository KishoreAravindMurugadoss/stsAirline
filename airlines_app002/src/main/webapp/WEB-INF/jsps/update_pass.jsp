<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Passenger</title>
</head>
<body>
<h2>Update Passenger</h2>
<form action="updatepass" method ="post">
<pre>
<input type="hidden" name="id" value="${passenger.id}">

First Name : <input type ="text" name ="passengerFirstName" value="${passenger.passengerFirstName}">

Last Name : <input type ="text" name ="passengerLastName" value="${passenger.passengerLastName}">

Email ID : <input type ="text" name ="passengerEmail" value="${passenger.passengerEmail}">

Mobile No. : <input type ="text" name ="passengerMobile" value="${passenger.passengerMobile }">

			<input type ="submit" value="Update Passenger">
</pre>
</form>
</body>
</html>