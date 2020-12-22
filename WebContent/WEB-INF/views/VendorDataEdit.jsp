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
<center><h1>Welcome to Vendor Registration Form </h1>
	
	
	
	
	<form action="updateVendor" method="post">
		<label>Id</label>:<input type="text" name="venId" value="${ven.venId}"/>
		<label>Code</label>:<input type="text" name="venCode" value="${ven.venCode}"/>
		<label>Name</label>:<input type="text" name="venName" value="${ven.venName}"/>
		
		<c:forEach items="${venTypeId}" var="venTypeOb">
		<c:choose>
			<c:when test="${ven.venType eq venTypeOb}">
				<input type="radio" name="venType" value="${venTypeOb}" checked="checked">${venTypeOb}
			</c:when>
			<c:otherwise>
				<input type="radio" name="venType" value="${venTypeOb}">${venTypeOb}
			</c:otherwise>
		</c:choose>
		
		</c:forEach>
		
		
		<label>Address</label>:<textarea name="venAddr">${ven.venAddr}</textarea><br>
		
	
		
		<label>ID Proof</label>:	<select name="venIdType">
										<option>-Select</option>
										<c:forEach items="${venIdType}" var="IdTypeOb">
											<c:choose>
												<c:when test="${ven.venIdType eq  IdTypeOb}">
													<option value="${IdTypeOb}"  selected="selected">${IdTypeOb}</option>
												</c:when>
												<c:otherwise>
													<option value="${IdTypeOb}">${IdTypeOb}</option>
												</c:otherwise>
											</c:choose>
										</c:forEach>
									</select>
			
		
										 
		<label>ID Number</label>:<input type="text" name="venIdNum" value="${ven.venIdNum}"/>
		<label>Note</label>:<textarea name="venDsc">${ven.venDsc}</textarea>
		<input type="submit" value="Update"/>
		
	
		</form>
		
	</center>

</body>
</html>