<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file = "menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Passenger Registration</title>
</head>
<body>
<h2>Passenger Registration</h2>
<form action="savedata">
<pre>

First Name :<input type ="text" name ="passengerFirstName" />

Last Name :<input type ="text" name ="passengerLastName" />

Email ID :<input type ="text" name ="passengerEmail" />

Mobile No. :<input type ="text" name ="passengerMobile" />

			<input type ="submit" value ="Save Passenger">
</pre>
</form>

</body>
</html>