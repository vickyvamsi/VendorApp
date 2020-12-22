<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Location Register Page</title>
<style type="text/css">
	body
	{background-color:#859632;
	}
	table{
	width:100px;
	}
	h1{
	text-decoration:underline;
	}
	p{
			font-color:red;
			font-size:25px;	
	}
	
</style>
</head>
<body>
	<%@include file="userMenu.jsp" %>
 <form action="searchLocation" method="get">Search Location Id : <input type="text" name="locId"/> <input type="submit" value="Search"> </form>
 <h4 style="color:white"> Note: Please Enter ID Number.</h4>
<center>
<h1>Welcome to Location Register Page!!</h1> 
<p>${msg}</p>
<p>${exitError}</p>
<form action="insertLoc" method="post">
<table border="">
<tr><td>ID </td> <td> :<input type="text" name="locId"></td></tr>
<tr><td>NAME</td> <td>:<input type="text" name="locName"/></td></tr>
<tr><td>CODE</td> <td>:<input type="text" name="locCode"/></td></tr>
<tr><td>TYPE</td> <td>:<input type="radio" name="locType" value="Urban"> URBAN  <input type="radio" name="locType" value="Rural">RURAL</td></tr>
<tr><td>DESCRIPTION </td> <td>:<textarea name="locDesc"></textarea></td></tr>
<tr ><td colspan="2"><center><input type="submit" value="INSERT"/></center> </td></tr>
</table>
</form>
<br>
<a href="viewAllLoc">View All</a>
</center>
</body>
</html>