<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <%@ include file = "menuBill.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Billing List</title>
</head>
<body>
<h2>Billing List</h2>
<hr>
<table border=1>
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
<th>Mobile</th>
<th>Quantity</th>
<th>Description</th>
<th>Price</th>
<th>Update</th>
<th>Delete</th>
<th>Bill</th>
</tr>
<c:forEach var="findBills" items ="${findBills}">
<tr>
<td>${findBills.passengerFirstName}</td>
<td>${findBills.passengerLastName}</td>
<td>${findBills.passengerEmail}</td>
<td>${findBills.passengerMobile }</td>
<td>${findBills.qty }</td>
<td>${findBills.desp }</td>
<td>${(findBills.qty)*8000 }</td>
<td><a href="updateBill?id=${findBills.id}">update</a></td>
<td><a href="deleteBill?id=${findBills.id}">delete</a></td>
<td><a href="genBill?id=${findBills.id}">generate bill</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>