package com.MyShope.DAOs;
import java.sql.*;
public class CUSTOMER_ForgotDAO {
 public int x=0;
 public int forgot(String Em,String Pw) {
	 try {
		 Connection con=DBConnection.getcon();
		 PreparedStatement ps=con.prepareStatement("update My_Customer set pword=? where mail=?");
		 ps.setString(1, Pw);
		 ps.setString(2,Em);
		 x=ps.executeUpdate();
	 }catch(Exception e) {e.toString();}
	 return x;
 }
}
