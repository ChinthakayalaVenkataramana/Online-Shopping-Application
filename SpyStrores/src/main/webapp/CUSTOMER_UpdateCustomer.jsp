<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="com.MyShope.Beans.CustomerBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
CustomerBean cb=(CustomerBean)request.getAttribute("customer");
%>
<form action="update" method="post">
<b>
<input type="hidden" name="mail" value=<%=cb.getMail()%>> <br>
<input type="hidden" name="pword" value=<%=cb.getPword()%>><br>
First Name : <input type="text" name="fname" value=<%=cb.getFname()%>> <br>
Last Name  : <input type="text" name="lname" value=<%=cb.getLname()%>> <br>
Phone No   : <input type="tel" name="phno" pattern=[0-9]{10} value=<%=cb.getPhno()%>> <br>
Pin Code   :<input type="text" name="pin"pattern=[0-9]{6} value=<%=cb.getPin()%>> <br>
Mandal     : <input type="text" name="mandal" value=<%=cb.getMadal()%>> <br>
District   : <input type="text" name="dist" value=<%=cb.getDist()%>> <br>
Village    : <input type="text" name="vilg" value=<%=cb.getVillage()%>> </b><br><br>
 <input type="submit" value="Save">
</form>
</body>
</html>