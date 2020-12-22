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
<title>Insert title here</title>
</head>
<body>
<%@include file="userMenu.jsp" %>
<a href="ExelViewData">Export data to Excel</a> |<a href="PdfViewData">Export Data to PDF</a> |<a href="VenReport">Vendor Report Generator</a>
	<center><h1>Vendor Record Data  </h1></center>
	
	<table border="1">
		<tr>
			<th>Id</th>
			<th>Code</th>
			<th>Name</th>
			<th>Type</th>
			<th>Address</th>
			<th>Id Proof</th>
			<th>Id Number</th>
			<th>Note</th>
			<th>Delete</th>
			<th>Update</th>
		</tr>
		
		<c:forEach items="${vendor}" var="ven">
		<tr>
		<td><c:out value="${ven.venId}"/></td>
		<td><c:out value="${ven.venCode}"/></td>
		<td><c:out value="${ven.venName}"/></td>
		<td><c:out value="${ven.venType}"/></td>
		<td><c:out value="${ven.venAddr}"/></td>
		<td><c:out value="${ven.venIdType}"/></td>
		<td><c:out value="${ven.venIdNum}"/></td>
		<td><c:out value="${ven.venDsc}"/></td>
		<td><a href="deleteVen?venId=${ven.venId}">Delete</a></td>
		<td><a href="editVendor?venId=${ven.venId}">Update</a></td>
		
		</tr>
		</c:forEach>
	</table>
	
</body>
</html>