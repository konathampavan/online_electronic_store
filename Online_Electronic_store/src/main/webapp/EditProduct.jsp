<%@page import="pack1.AdminBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="pack1.ProductBean"%>
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
			height: 300px;
			text-align: center;
			color:white;
			font-size:30px;
		}

</style>
</head>
<body>
<div>
 <%
 AdminBean abean=(AdminBean)session.getAttribute("abean");
 ArrayList<ProductBean> al=( ArrayList<ProductBean>)session.getAttribute("ProductList");
 ProductBean pb=(ProductBean)request.getAttribute("pbean");
 
 out.println("Mr."+abean.getFname()+" please edit"+"<br><br>");
 
 %>
 
 <form action="update" method="post">
 Product price : <input type="text" name="pprice" value="<%=pb.getPprice()%>"><br><br>
 Product quantity : <input type="text" name="pqty" value="<%=pb.getPqty()%>"><br><br>
<input type="hidden" name="pcode" value="<%=pb.getPcode()%>">
 <input type="submit" value="Update product Details">
 </form>
 </div>
</body>
</html>