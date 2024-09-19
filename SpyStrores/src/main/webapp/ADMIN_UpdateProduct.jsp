<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="com.MyShope.Beans.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
AddProductBean ap=(AddProductBean)request.getAttribute("update");
%>
<form action="UpdatePd" method="Post">
Category      :<input type="text" name="category" value=<%=ap.getCategory() %>><br>
<img src=<%=ap.getImg() %> width=400 height=300 ><br>
Image Path    :<input type="text" name="img" value=<%=ap.getImg() %>><br>
Product Model :<input type="text" name="pname" value=<%=ap.getPmodel() %>><br>
Product Price : <input type="text" name="price" value=<%=ap.getPrice() %>><br>
Quality       :<input type="text" name="quty" value=<%=ap.getQtly() %>><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="Update"> &nbsp;&nbsp;&nbsp;<input type="reset" value="No Change">            
</form>
</body>
</html>