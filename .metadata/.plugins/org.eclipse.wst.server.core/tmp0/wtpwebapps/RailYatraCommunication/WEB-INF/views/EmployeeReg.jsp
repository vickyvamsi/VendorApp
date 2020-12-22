<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Register</title>
</head>
<body>
<pre>
<center>
		<h1>${msg}</h1>
<h1>Welcome Employee Register</h1>
<form action="saveEmp" method="post">
Emp Name     :<input type="text" name="eName"/> <form:errors path="" cssClass="err"/>

Emp F_Name   :<input type="text" name="eFName"/>  <form:errors path="" cssClass="err"/>

Emp Sal      :<input type="text" name="eSal"/> <form:errors path="" cssClass="err"/>

Emp Email    :<input type="text" name="Email"/> <form:errors path="" cssClass="err"/>

Emp pwd      : <input type="password"  name="pwd"/> <form:errors path="" cssClass="err"/>

Gender     : Mail <input type="radio" name="eGenl" value="Mail"/> Femail <input type="radio" name="eGenl" value="Femail"/> <form:errors path="" cssClass="err"/>

Emp Language     : Telugu <input type="checkbox" name="langs" value="Telugu"/> English <input type="checkbox" name="langs" value="English"/> Hindhi <input type="checkbox" name="langs" value="Hindhi"/> <form:errors path="" cssClass="err"/>

<center><input type="submit" value="Register"/></center>
</form>
</center>
</pre>
</body>
</html>