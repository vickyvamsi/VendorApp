<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
body{
	background-color:Pink;
	color:green:
	font-size:50px;
}
	select{
		width:200px;
		height:25px;
		font-size:20px;
		text-align:center;
		color:white;
		background-color:pink;
	}
	td{
		padding:8px;
	}
	label
	{
		color:oblic;
		font-size:20px;
	}
	textarea{
	background-color:pink;
		width:250px;
		height:50px;border-style: solid white;}
	input[type="text"],[type="password"]
	{
	background-color:pink;
	outline:none;
		width:250px;
		height:20px;
		color:white;
		font-size:20px;
		border:none;
		padding:5px;
		border-bottom: 2px solid white;
	}
	input[type="submit"]{
		width:100px;
		height:35px;
		font-size:20px;
		color:white;
		background-color:green;
	}
	.tab
	{
		width:500px;
		display:fixed;
		position:center;
		height:350px;
		border: 1px solid black;
		border-radius:20px;
	}
	
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="userMenu.jsp" %>
			<h1 align="center" style="text-decoration:underline;color:purple;">Customer Registration Form </h1> <a href="CustomerData">All Customer Data</a><br>
			<p style="color:red;font-size:20px;">${message}</p>
	<center><div class="tab"><form action="custReg" method="post">
	
	
	<table padding="65">
		<tr><td><label>ID</label> </td> <td>: <input type="text" name="custId"/></td></tr>
			<tr><td><label> Name</label></td> <td>: <input type="text" name="custName"/></td></tr>
			<tr><td><label> Email</label></td> <td>: <input type="text" name="custEmail"/></td></tr>
			<tr><td><label> Type</label></td> <td>: <select name="custType"><option>-Select-</option> <option value="Consumer">Consumer</option>
								<option value="Seller">Seller</option>
								</select></td></tr>
			<tr><td><label> Address </label></td><td>: <textarea name="custAddr"></textarea></td></tr>
			
			<tr align="center"><td colspan="2"><input type="submit" value="Submit"/></td></center>
			</tr>

	</form>	
	</table></center></div>
</body>
</html>