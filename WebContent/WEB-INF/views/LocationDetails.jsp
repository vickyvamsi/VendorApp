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
<%@include file="userMenu.jsp" %>
<table>
	<p style="color:red">${error}</p> <p style="color:red"></p> <p>${strs}</p>
	<td>Location Id </td><td>:${locs.locId}</td>
</tr>
<tr>
	<td>Location Name </td><td>:${locs.locName}</td>
</tr>

<tr>
	<td>Location Description </td><td>:${locs.locDesc}</td>
</tr>
<tr>
	<td>Location Type </td><td>:${locs.locType}</td>
</tr>
<tr>
	<td>Location Code</td><td>:${locs.locCode}</td>
</tr>
<tr>
	
	</table>
</body>
</html>