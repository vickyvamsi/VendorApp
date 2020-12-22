<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Login</title>


</head>
<body>
	<center>
		<h1>------ User Login ------ </h1> <hr/><p>${message}</p>
		<table>
			<form action="login" method="post">
				<tr>
					<td>User Name</td><td>: <input type="text" name="userName"/></td>
				</tr>
				<tr>
					<td>Password</td><td>: <input type="password" name="password"/></td>
				</tr>
				<tr>
					<td colspan="2"><center><input type="submit" value="Login"/></center></td>
				</tr>
				
			</form>
		</table>
		<p>New Registration</p><a href="userReg">Registration</a>
	</center>
</body>
</html>