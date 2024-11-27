<%@page import="pack1.AdminBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
			/*background-color:greenyellow;*/
			background-image: url("107033-light-blue-abstract.jpg");
			display: flex;
			justify-content: center;
			align-items: center;
			height: 100vh;

		}

		div {
			border: 1px solid white;
			padding: 15px;
			border-radius: 10px;
			background-color: rgba(0, 0, 0, 0.5);
			box-shadow: 5px 5px 15px black;
			width: 500px;
			height: 400px;
			text-align: center;
			color: white;
			font-size: 30px;

		}

</style>
</head>
<body><div>
<%
AdminBean abean=(AdminBean)session.getAttribute("abean");
String msg=(String)request.getAttribute("msg");
out.println("hello Mr."+abean.getFname()+"<br><br>");
out.println(msg+"<br><br>");
%>
<a href="AddProduct.html">AddProduct</a><br><br>
<a href="view1">View product</a><br><br>
<a href="Logout">Logout</a><br><br>
</div>
</body>
</html>