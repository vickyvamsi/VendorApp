<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
table th{
 background-color:#452125;
 color:white;

}
table{
width:1200px;
height:50px;
border:2px;


}td{text-align:center;}
table,tr,td{


}
h2{

font-color:red;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Locaton Data</title>
</head>
<body>
<%@include file="userMenu.jsp" %>
<h2>Location AllData Details</h2>
<a href="locExcelView">Data Export Excel</a> |<a href="locPdfView">Data Pdf Excel</a> |<a href="showLocReport">Pie Chart Report View</a>
<table border="2">
	<tr>
	<th>Location Id</th>
	<th>Location Name</th>
	<th>Location Code</th>
	<th>Location Type</th>
	<th>Location Description</th>
	<th>Delete</th>
	<th>Edit</th>
	<th>LOCATION DATA</th>
	
	</tr>
	<c:forEach items="${location}" var="loc">
	<tr>
	<td><c:out value="${loc.locId}"/> </td>
	<td><c:out value="${loc.locName}"/></td>
	<td><c:out value="${loc.locCode}"/></td>
	<td><c:out value="${loc.locType}"/></td>
	<td><c:out value="${loc.locDesc}"/></td>
	<td><a href="deleteLoc?locId=${loc.locId}"><img  src="../images/delete.png" width="30" height="30"></a></td>
	<td><a href="editLoc?locId=${loc.locId}"><img  src="../images/edit.png" width="30" height="30"></a></td>
	<td><a href="locDetails?locId=${loc.locId}">VIEW</a></td>
	</tr>
	</c:forEach>
</table>
</body>
</html>