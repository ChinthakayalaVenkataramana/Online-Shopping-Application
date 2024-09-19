<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.*,com.MyShope.Beans.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width='device-width',inicial-scale=1.0">
<title>MyShop</title>
</head>
<body>
<hl><b><h1>MyShop  Happy Shopping</h1></b></hl>
<div id=search1>
<form action="Search" method="post">
<input type="search" name="searching" id='search' placeholder="search product"> 
</form></div>

<form action='Filters' method="post" id='filters'>
Filter<select name="f-price">
      <option>Below 500
      <option>500-1000
      <option>1000-2000
      <option>2000-5000
      <option>5000-10000
      <option>10000-20000
      <option>Above 20000      
      </select>

 <input type="submit" value="Apply">
</form>


<div style="display:flex; flex-wrap:wrap; width:100%">
<%
Vector<AddProductBean> vector=(Vector<AddProductBean> )session.getAttribute("Products");
Iterator<AddProductBean> it=vector.iterator();
while(it.hasNext()){
	AddProductBean ab=(AddProductBean)it.next();
	out.print("<div id='dis1'> &nbsp;&nbsp;&nbsp; Product Category :"+ab.getCategory()+"<center><img src='"+ab.getImg()+"' width=270 height=270 ></center>"+"<b>Brand :"+ab.getBrand()+"</b><b> Model :"+ab.getPmodel()+"</b> <b> Price "+ab.getPrice()+"</b> <b> Rating "+ab.getQtly()+"</b><b> <button><a href='buy?pmodel="+ab.getPmodel()+"'>Buy</a></button> </b></div> <br>");
} 
%>
</div>
</body>
<style>
#dis1{
width:310px;
margin:5px;
display:flex;
justify-content:center;
flex-direction:column;
border-style:solid;
padding:1px;
text-align:center;
gap:5px;
}
button{
width:70px;
height:30px;
background-color:yellow;
border-radius:20px;
}
h1{
color:blue;
background-color:yellow;
text-align:center;
}
#search{
border-width:3px;
width:300px;
height:35px;
border-radius:15px;
text-align:center;
}
#search1{ 
text-align:center;
}
</style>
</html>