<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Item Registration Edit Form</h1>
		
	<form action="updateItem" method="post">
		<table>
			
				<tr>
					<td>Id </td><td>:<input type="text" name="itemId" value="${item.itemId}"/></td>
				</tr>
				<tr>
					<td>Item Name </td><td>:<input type="text" name="itemName" value="${item.itemName}"/></td>
				</tr>
				<tr>
					<td>Cost </td><td>:<input type="text" name="itemCost" value="${item.itemCost}"/></td>
				</tr>
				<tr>
					<td>Disc </td><td>:<input type="text" name="discount" value="${item.discount}"/></td>
				</tr>
				<tr>
					<td>Cust Id </td><td>:<input type="text" name="custId" value="${item.custId}"/></td>
				</tr>
				<tr>
				<td colspan="2"><input type="submit" value="Update"/></td>
				</tr>
			</table>
			</form>
			</center>

</body>
</html>