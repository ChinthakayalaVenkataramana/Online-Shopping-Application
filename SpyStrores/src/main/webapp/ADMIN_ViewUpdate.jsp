<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="com.MyShope.Beans.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width,inicial-scale=1.0">
<title>MyShop</title>
</head>
<body>
<h1>Happy Shopping</h1>
<div style="display:flex; width:100%; flex-wrap:wrap;">
<%
LinkedList<AddProductBean> pq =(LinkedList<AddProductBean>)session.getAttribute("ap");
Iterator<AddProductBean> it=pq.iterator();
while(it.hasNext()){
	AddProductBean ap=(AddProductBean)it.next();
	out.print(" <div id='dis1' > Product Category :"+ap.getCategory()+"<img src='"+ap.getImg()+"' width=270 height=270 >"+"<b> Model :"+ap.getPmodel()+"</b><b> Price "+ap.getPrice()+"</b> <b> Rating "+ap.getQtly()+"</b><br><b> <button><a href='UProduct?pmodel="+ap.getPmodel()+"'>Update</a></button> </b></div>");
}
%>
</div>
</body>
<style>
#dis1{
width:310;
display:flex;
margin:5px;
justify-content:center;
flex-direction:column;
border-style:solid;
padding:1px;
text-align:center;
gap:10px;
}
button{
background-color:yellow;
width:70px;
border-radius:20px;
height:30px;

}

h1{
color:blue;
background-color:yellow;
width:400px;
}
</style>
</html>
