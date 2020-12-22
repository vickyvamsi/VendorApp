<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
table{
	width:500px;
align:center;	
}
td{


}
tr{
width:450px;
align:center;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@include file="userMenu.jsp" %>
<center>
<h2>All Document Data</h2><hr/>
			<table border="1" >
			<tr>
				<th>File Id</th>
				<th>File Data</th>
				<th>Download</th>
				
			</tr>
			<c:forEach items="${docs}" var="ob">
			<tr>
				<td><c:out value="${ob[0]}"/></td>
				<td><c:out value="${ob[1]}"/></td>
				<td><a href="downloadDoc?fileId=${ob[0]}"><img src="../images/down1.png" width="100" height="45"/></a></td>			
			</tr>
			</c:forEach>
			</table>
			</center>
</body>
</html>