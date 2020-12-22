<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
	table{
	width:750px;
	text-align:center;
	padding:20px;
	}
	td{
			font-size:20px;
			color:#FF10CC;
	}
	th,h1{
	text-decoration:underline;
	color:green;
	}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<center><h1 style="color:green;">All Items Data </h1> <a href="itemExcelView">Item Data Excel View</a> | <a href="itempdfView">Item Data Pdf View</a>
	<table>
	<tr>
		<th>ITEM ID</th>
		<th>ITEM NAME</th>
		<th>COST</th>
		<th>DISCOUNT</th>
		<th>CUSTOMER ID</th>
		<th>DELETE</th>
		<th>UPDATE</th>
	</tr>
	<c:forEach items="${items}" var="i">
	<tr>
		<td><c:out value="${i.itemId}"/></td>
		<td><c:out value="${i.itemName}"/></td>
		<td><c:out value="${i.itemCost}"/></td>
		<td><c:out value="${i.discount}"/></td>
		<td><c:out value="${i.custId}"/></td>
		<td><a href="deleteItem?itemId=${i.itemId}">Delete</a></td>
		<td><a href="editItem?itemId=${i.itemId}">Update</a></td>
	</tr>	
		</c:forEach>
	</table>
	</center>
</body>
</html>