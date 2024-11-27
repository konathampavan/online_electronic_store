<%@page import="pack1.ProductBean"%>
<%@page import="pack1.AdminBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
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
			font-size:25px;
			overflow:auto;
			scrollbar-width:none;
		}
		
</style>
</head>
<body>
<div>
<%

AdminBean abean=(AdminBean)session.getAttribute("abean");
ArrayList<ProductBean> al=(ArrayList<ProductBean>)session.getAttribute("ProductList");
out.println("Mr."+abean.getFname()+"  here are your product details!!!<br><br>");
if(al.size()==0)
{
	out.println("there are no products available!!!<br><br>");
}
else
{   Iterator<ProductBean>i=al.iterator();
	while(i.hasNext())
	{
		ProductBean pb=i.next();
		out.println(pb.getPcode()+" "+pb.getPname()+" "+pb.getPcompany()+" "+pb.getPprice()+" "+pb.getPqty()+" "+
		"<a href='edit?pcode="+pb.getPcode()+"'>Edit</a>"+" "+"<a href='delete?pcode="+pb.getPcode()+"'>Delete</a>"+"<br><br> ");
	}
}
%>
<span>
 <a href="Logout">Logout</a><br><br>
 </span>
 </div>
</body>
</html>