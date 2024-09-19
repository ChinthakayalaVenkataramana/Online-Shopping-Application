<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MyShop</title>
</head>
<body>
<%
String msg=(String)request.getAttribute("msg");
out.println(msg);
%>
<%@include file="CUSTOMER_Login.html" %>
</body>
</html>