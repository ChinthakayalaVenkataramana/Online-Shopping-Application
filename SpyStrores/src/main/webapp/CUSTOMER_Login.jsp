<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.*,com.MyShope.Beans.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MyShop</title>
</head>
<body style="text-align:center;">
<%
Vector<CustomerBean> vector=(Vector<CustomerBean> )session.getAttribute("vector");
Iterator<CustomerBean> it=vector.iterator();
String name;
if(it.hasNext()){
CustomerBean cb=(CustomerBean)it.next();
out.println("<h2 style='text-align:center; background-color:lime;'>This Page Belongs To "+cb.getFname()+"</h2><h1><a href='myorders?mail="+cb.getMail()+"'>My Orders</a>&nbsp;&nbsp;<a href='ViewAllProducts'>View All Products</a></h1>");
}
%>
<h1><a href="view" Style="width:30px;">View Profile</a>&nbsp;&nbsp;&nbsp;<a href="logoutCustomer">Logout</a></h1>
</body>
<style>
h2{
margin-top:50px;
}
a{
width:50px;
color:white;
background-color:black;
border-radius: 30px;
}
</style>
</html>