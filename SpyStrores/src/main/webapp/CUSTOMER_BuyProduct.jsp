<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.*,com.MyShope.Beans.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MyShop</title>
</head>
<body>
<%
AddProductBean ab=(AddProductBean)request.getAttribute("BuyProduct");
%>
<form action='productBuy' method="post">
Product Category :<%=ab.getCategory() %><br>
<img src=<%=ab.getImg() %> width=400 height=200 ><br>
Product Model :<%=ab.getPmodel() %><br>

Product Price :<input type="tel" name="price" value=<%=ab.getPrice() %> readonly  id="price"><br>
Quantity  :<input type="number" name="quantity" value=1 max=100 min=1 onchange="fun()" id="Qty"><br>

Product Quality:<%=ab.getQtly() %><br>
<input type='hidden' name='category' value=<%=ab.getCategory() %>>
<input type='hidden' name='img' value=<%=ab.getImg() %>>
<input type='hidden' name='pmodel' value=<%=ab.getPmodel() %>>
<input type='hidden' name='qtly' value=<%=ab.getQtly() %>>
<%
Vector<CustomerBean> vector1=(Vector<CustomerBean>)session.getAttribute("vector");
Iterator<CustomerBean> it1=vector1.iterator();
if(it1.hasNext()){
CustomerBean cb=(CustomerBean)it1.next();
out.println("<input type='hidden' name='mail' value='"+cb.getMail()+"'> <br>");
}
%>
<input type="submit" value="Conform Order">
</form>

<script >
function fun(){
	let a=document.getElementById("price").value;
	let b=document.getElementById("Qty").value;
	if(a== -1){
		c=a*b;
		document.getElementById("price").value=c;
	   console.log(a +" "+b);
		
	}
	
}
</script>
</body>
</html>