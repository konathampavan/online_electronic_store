<%@ page import="pack1.CustomerBean"%>
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
		div{
			border:1px solid white;
			padding: 15px;
			border-radius: 10px;
			background-color: rgba(0,0,0,0.5);
			box-shadow: 5px 5px 15px black;
			width: 500px;
			height: 250px;
			text-align: center;
			color:white;
			font-size:40px;
			
		}



</style>
</head>
<body><div>
<%
CustomerBean cbean=(CustomerBean)session.getAttribute("cbean");
 out.println(" welcome : "+cbean.getUfname()+"<br><br>"); 

%>
<a href="view">view profile</a><br><br>
<a href="Logout">Logout</a><br><br>
</div>
</body>
</html>