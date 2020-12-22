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
table th{
 background-color:#452125;
 color:white;

}
table{
width:1250px;
height:50px;
border:2px;


}td{text-align:center;}
table,tr,td{


}	
	
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="userMenu.jsp" %>
		<center><h1>Customer Data</h1> <a href="excelViewData">Download Excel Customer Data</a> || <a href="custPdf">Download PDF Customer Data</a> |<a href="CustReport">Customer Report</a></center>
	<br><br>
	<table >
		<tr>
		<th>ID</th><th>NAME</th><th>EMAIL</th>
		<th>TYPE</th><th>ADDRESS</th>
		<th>PASSWORD</th><th>TOKEN</th>
		<th>Delete</th><th>Update</th>
		</tr>
		
		<c:forEach items="${Customers}" var="cust">
		<tr>
		<td><c:out value="${cust.custId}"/></td>
		<td><c:out value="${cust.custName}"/></td>
		<td><c:out value="${cust.custEmail}"/></td>
		<td><c:out value="${cust.custType}"/></td>
		<td><c:out value="${cust.custAddr}"/></td>
		<td><c:out value="${cust.password}"/></td>
		<td><c:out value="${cust.accTock}"/></td>
		<td><a href="deleteCust?custId=${cust.custId}"><img src="../images/delete.png" width="30" height="30"/></a></td>
		<td><a href="updateCust?custId=${cust.custId}"><img src="../images/edit.png" width="30" height="30"/></a></td>
		
		</tr>
		</c:forEach>
	</table>
</body>
</html>