<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="com.MyShope.Beans.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MyShop</title>
</head>
<body>
<a href='ViewAllProducts'>View All Products</a><br>
<%
Vector<OrderBean> ob=(Vector<OrderBean>)request.getAttribute("order");
Iterator<OrderBean> it=ob.iterator();
while(it.hasNext()) {
	  OrderBean o=(OrderBean)it.next();
out.print("<br><br><b>Category :"+o.getCategory()+"<br><img src='"+o.getImg()+"' width=200 height=200>"+"<br>Product Model:"+o.getPmodel()
+"<br>Price :"+o.getPrice()+"<br>Quality :"+o.getQuality()+"<br> Order Date :"+o.getDate()+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
}
%>
</body>
</html>