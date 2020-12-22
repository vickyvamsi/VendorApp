<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<center>	
<h1> Item Registration Form</h1> <a href="showItems">View All Items</a>
		<p style="color:red">${msg}</p>
	<form action="saveItemReg" method="post">
		<table>
			
				<tr>
					<td>Id </td><td>:<input type="text" name="itemId"/></td>
				</tr>
				<tr>
					<td>Item Name </td><td>:<input type="text" name="itemName"/></td>
				</tr>
				<tr>
					<td>Cost </td><td>:<input type="text" name="itemCost"/></td>
				</tr>
				<tr>
					<td>Disc </td><td>:<input type="text" name="discount"/></td>
				</tr>
				<tr>
					<td>Cust Id </td><td>:<input type="text" name="custId"/></td>
				</tr>
				<tr>
				<td colspan="2"><input type="submit" value="Register"/></td>
				</tr>
			</table>
			</form>
			</center>
</body>
</html>