<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.*,com.MyShope.Beans.CustomerBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MyShope</title>
</head>
<body>
<%
Vector<CustomerBean> vector=(Vector<CustomerBean>)request.getAttribute("View");
Iterator<CustomerBean> it=vector.iterator();
if(it.hasNext()){
CustomerBean cb=(CustomerBean)it.next();
out.println("This Page Belongs To "+cb.getFname()+"<br><br> First Name :"+cb.getFname()+"<br>Last Name:"+cb.getLname()+"<br> Email Id :"+cb.getMail()
+"<br> Mandal :"+cb.getMadal()+"<br> District :"+cb.getDist()+"<br>Village :"+cb.getVillage()+"<br>Phone Number :"+cb.getPhno()+"<br> Pin Code :"+cb.getPin()+"<br><a href='logoutCustomer'>LogOut</a>&nbsp;&nbsp;&nbsp;<a href='edit?name="+cb.getFname()+"'>Edit</a>");
}
%>
</body>
</html>