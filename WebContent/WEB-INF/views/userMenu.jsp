<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<style>
body
{
	margin:0px;
	padding:0px;
}
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
}

li {
    float: left;
}

li a, .dropbtn {
    display: inline-block;
    color: white;
    font-size:20px;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

li a:hover, .dropdown:hover .dropbtn {
    background-color: green;
}

li.dropdown {
    display: inline-block;
}

.dropdown-content {
    display: none;
    position: absolute;
    background-color: #f9f9f9;
   
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
}

.dropdown-content a {
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
    text-align: left;
}

.dropdown-content a:hover {background-color:pink}

.dropdown:hover .dropdown-content {
    display: block;
}
.head
{	
	width:100%;
	height:50px;
	top:-10px;
	background-color:white;
}


</style>
</head>
<body>
	<div class="head"><h1>G.V.K SOFTWARE SOLUTIONS </h1></div>
<ul>
  <li><a href="#">Home</a></li>
  <li class="dropdown">
  <a href="#news" class="dropbtn">LOCATION</a>
  <div class="dropdown-content">
      <a href="regLoc">Location Registation</a>
      <a href="viewAllLoc">Location Data</a>
      <a href="locExcelView">Location Excel</a>
      <a href="locPdfView">Location Download Pdf</a>
      <a href="showLocReport">Location Report</a>
    </div>
  </li>
  
  <li class="dropdown">
    <a href="#" class="dropbtn">VENDOR</a>
    <div class="dropdown-content">
      <a href="regVen">Vendor Registation</a>
      <a href="viewData">Vendor Data</a>
      <a href="ExelViewData">Vendor Excel Data</a>
      <a href="PdfViewData">Vendor Pdf Data</a>
      <a href="VenReport">Vendor Report</a>
    </div>
  </li>
    <li class="dropdown">
    <a href="#" class="dropbtn">CUSTOMER</a>
    <div class="dropdown-content">
      <a href="regCust">Customer Registation</a>
      <a href="CustomerData">Customer Data</a>
      <a href="excelViewData">Customer Excel Data</a>
      <a href="custPdf">Customer Pdf Data</a>
      <a href="CustReport">Customer Report</a>
    
    </div>
  </li>
  <li class="dropdown">
    <a href="#" class="dropbtn">DOCUMENTS</a>
    <div class="dropdown-content">
      <a href="showDoc">Upload</a>
      <a href="allUploadDoc">View Document's</a>
      
    
    </div>
  </li>
   <h3 style="float:right;padding-right:35px;color:white;"> Welocome : ${un} |   <a href="logout" style="color:white;">Logout</a></h3> 
   </ul>



</body>

<!-- Mirrored from www.w3schools.com/css/tryit.asp?filename=trycss_dropdown_navbar by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 27 Nov 2016 17:56:06 GMT -->
</html>
