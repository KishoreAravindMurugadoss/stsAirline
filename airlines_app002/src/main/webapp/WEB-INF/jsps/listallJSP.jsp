<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ include file = "menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Passenger List</title>
</head>
<body>
<h2>Passenger List</h2>
<hr>
<table border=1>
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
<th>Mobile</th>
<th>Update</th>
<th>Delete</th>
</tr>
<c:forEach var="passengers" items ="${passengers}">
<tr>
<td>${passengers.passengerFirstName}</td>
<td>${passengers.passengerLastName}</td>
<td>${passengers.passengerEmail}</td>
<td>${passengers.passengerMobile }</td>
<td><a href="update?id=${passengers.id}">update</a></td>
<td><a href="deletepass?id=${passengers.id}">delete</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>