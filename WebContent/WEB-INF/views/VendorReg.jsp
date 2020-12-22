R<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="userMenu.jsp" %>
	<center><h1>Welcome to Vendor Registration Form </h1>
	<p>${msg}</p>
	<a href="viewData">View All Vendor Details</a>
	<pre>
	
	<form action="saveVen" method="post">
		<label>Id</label>:<input type="text" name="venId"/><br><br>
		<label>Code</label>:<input type="text" name="venCode"/><br><br>
		<label>Name</label>:<input type="text" name="venName"/><br><br>
		<label>Type</label>:<input type="radio" name="venType" value="CONTRACT"/> CONTRACT <input type="radio" name="venType" value="FULL TIME"/>FULL TIME <input type="radio" name="venType" value="PART TIME"/> PART TIME<br><br>
		<label>Address</label>:><textarea name="venAddr"></textarea><br><br>
		<label>ID Proof</label>:<select name="venIdType"><option>SELECT</option>
											 <option value="PAN">PAN</option>
											 <option value="VOTER ID">VOTER ID</option>
											 <option value="OTHER">OTHER</option>
											 </select>
		<label>ID Number</label>:<input type="text" name="venIdNum"/><br><br>
		<label>Note</label>:<textarea name="venDsc"></textarea><br><br>
		<input type="submit" value="Register"/><br><br>
		
	
		</form>
		</pre>
	</center>
</body>
</html>