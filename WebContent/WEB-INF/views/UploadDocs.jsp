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
<center>
<a href="allUploadDoc">All Upload Documents</a>
	<h1>File Upload Documents </h1><br><p>${msg}</p>
	<hr/>
	<form action="uploadDocs" method="post" enctype="multipart/form-data">
		<table>
			<tr>
				<td>File Id:</td><td><input type="text" name="fileId"></td>
			</tr>
				<tr>
				<td>Upload Document:</td><td><input type="file" name="fileOb"></td>
				</tr>
				<tr>
					<td colsapn="2"><input type="submit" value="Upload"/></td>
				</tr>
		</table>
	</form>
	</center>
</body>
</html>