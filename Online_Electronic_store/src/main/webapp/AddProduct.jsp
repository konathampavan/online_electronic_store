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
	height: 200px;
	text-align: center;
	color: aquamarine;
	font-size: 20px;
}

a {
	color: white;
	font-size: 25px;
}
 </style>
</head>
<body>
	<div>
		<!--  <form action="aps" method="post">
	
		Product code:<input type="text" name="pcode"><br><br>
		Product Name:<input type="text" name="pname"><br><br>
		Product Company:<input type="text" name="pcompany"><br><br>
		Product Price:<input type="text" name="pprice"><br><br>
		Product Quantity:<input type="text" name="pqty"><br><br>
		<input type="submit" value="submit">
		
	</form>	 -->


		<a href="AddProduct.html">AddProduct</a><br>
		<br> <a href="view1">View product</a><br>
		<br> <a href="Logout">Logout</a><br>
		<br>
	</div>
</body>
</html>