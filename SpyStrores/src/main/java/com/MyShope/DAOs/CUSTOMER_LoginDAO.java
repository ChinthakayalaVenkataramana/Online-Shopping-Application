package com.MyShope.DAOs;
import java.sql.*;
import java.util.Vector;

import com.MyShope.Beans.CustomerBean;
public class CUSTOMER_LoginDAO {
Vector<CustomerBean> v=new Vector<CustomerBean>();
   public Vector<CustomerBean> login(String Em,String pw){
	   try {
	   Connection con=DBConnection.getcon();
		PreparedStatement ps=con.prepareStatement("select * from my_customer where mail=? and pword=?");
		ps.setString(1, Em);
		ps.setString(2, pw);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
		CustomerBean cb=new CustomerBean();
		cb.setFname(rs.getString(1));
		cb.setLname(rs.getString(2));
		cb.setMail(rs.getString(3));
	    cb.setPword(rs.getString(4));
		cb.setMadal(rs.getString(5));
		cb.setDist(rs.getString(6));
		cb.setVillage(rs.getString(7));
		cb.setPhno(rs.getLong(8));
		cb.setPin(rs.getLong(9));
		v.add(cb);
		}
	   }catch(Exception e) {e.toString();}
	   
	   return v;
   }
}
