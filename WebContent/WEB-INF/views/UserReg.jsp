<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Registration</title>
</head>
<body>

<center>
<h1>User Registration form</h1>${message}<hr/>
	
			
	<table >
	<form action="userInsert" method="post">
		<!--  <tr>
			<td>User Id</td><td>:<input type="text" name="userId"></td>
		</tr>  --> 
		
		<tr>
			<td>User Name</td>	<td>: <input type="text" name="userName"/></td>
		</tr>
		<tr>
			<td>User Email</td>	<td>: <input type="text" name="userEmail"></td>
		</tr>
		<tr>
			<td>User contect Number</td><td>: <input type="text" name="userContact"/></td>
		</tr>
		<tr>
			<td>Address</td><td>: <textarea name="userAddr"></textarea></td>
		</tr>
		<tr>
			<td colspan="2"> <center><input type="submit" value="Submit"/></center></td>	
		</tr>
	</table><a href="showLogin">Login</a></center>
	</form>
</body>
</html>