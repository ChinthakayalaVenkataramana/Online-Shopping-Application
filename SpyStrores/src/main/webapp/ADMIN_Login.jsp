<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="com.MyShope.Beans.AdminBean,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MyShope</title>
</head>
<body>
<%
LinkedList<AdminBean> LA=(LinkedList<AdminBean>)request.getAttribute("adminB");
Iterator<AdminBean> it=LA.iterator();
out.println("AdminLogin Successfully Completed .....<br>");
if(it.hasNext()){
	AdminBean ab=(AdminBean)it.next();
	out.println("&nbsp;&nbsp;&nbsp;&nbsp;"+ab.getComName()+"&nbsp;&nbsp;&nbsp;&nbsp;"+ab.getLocation()+"&nbsp;&nbsp;&nbsp;&nbsp;"+ab.getMail()+"<br>");
}
%>
<a href="ADMIN_AddProduct.html">AddProducts</a>&nbsp;&nbsp;&nbsp;<a href="viewUpdate">View And Update</a>
</body>
</html>