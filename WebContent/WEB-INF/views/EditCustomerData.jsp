<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
		height:500px;
		border: 1px solid black;
		border-radius:20px;
	}
	
</style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center" style="text-decoration:underline;color:purple;">Customer Edit Registration Form </h1>
	
	<center><div class="tab">
			<h1></h1>
	<form action="updatecustReg" method="post">
			
	<table padding="65">
		<tr><td><label>ID</label> </td> <td>: <input type="text" name="custId" value="${cust.custId}"/></td></tr>
			<tr><td><label> Name</label></td> <td>: <input type="text" name="custName" value="${cust.custName}"/></td></tr>
			<tr><td><label> Email</label></td> <td>: <input type="text" name="custEmail" value="${cust.custEmail}"/></td></tr>
				
			<tr>
				<td><label>Type</label></td>
				<td>:
					<select name="custType">
					<option>-Select-</option>
					<c:forEach items="${UicustType}" var="cType">
						<c:choose>
							<c:when test="${ cust.custType eq cType}">
								<option value="${cType}" selected="selected">${cType}</option>>
							</c:when>
							<c:otherwise>
							<option value="${cType}">${cType}</option>>
							</c:otherwise>
						</c:choose>
					</c:forEach>
					</select>
				</td>
			</tr>
<tr><td><label> Address </label></td><td>: <textarea name="custAddr">${cust.custAddr}</textarea></td></tr>

										<!-- Password and Tocken Internally Generator -->
			<!--  <tr><td><label> Password</label></td> <td>: <input type="password" name="password" value="${cust.password}"/></td></tr>
			<tr><td><label> Token</label></td> <td>: <input type="password" name="accTock" value="${cust.accTock}"/></td></tr>
			 -->
			<tr align="center"><td colspan="2"><input type="submit" value="Update"/></td></center>
			</tr>
		
	</form>	
	</table></center></div>

</body>
</html>yy