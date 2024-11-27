<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String data = (String) request.getAttribute("msg");
out.println("<center><h1>");
out.println(data);
out.println("</h1></center>");
%>
<jsp:include page="index.html"/>
</body>
</html>