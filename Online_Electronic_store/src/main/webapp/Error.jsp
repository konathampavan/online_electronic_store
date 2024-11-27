<%@page import="java.net.http.HttpResponse"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><center><h1>
<%
 String msg=(String)request.getAttribute("msg");
 out.println(msg+"<br><br>"); 
response.sendError(400, msg);

%>

		<a href="AddProduct.html">AddProduct</a><br>
		<br> <a href="view1">View product</a><br>
		<br> <a href="Logout">Logout</a><br>
		<br>
</h1></center>

</body>
</html>