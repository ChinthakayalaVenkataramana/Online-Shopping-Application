package com.MyShope.DAOs;
import java.sql.*;
import com.MyShope.Beans.CustomerBean;
public class CUSTOMER_UpdateCustomerDAO {
public int x=0;
public int updating(CustomerBean cb) {
	try {
	Connection con=DBConnection.getcon();
	PreparedStatement ps=con.prepareStatement("update my_customer set fname=?,lname=?,mandal=?,dist=?,village=?,phno=?,pin=? where mail=? and pword=?");
	ps.setString(1,cb.getFname());
	ps.setString(2,cb.getLname());
	ps.setString(3,cb.getMadal());
	ps.setString(4,cb.getDist());
	ps.setString(5,cb.getVillage());
	ps.setLong(6,cb.getPhno());
	ps.setLong(7,cb.getPin());
	ps.setString(8,cb.getMail());
	ps.setString(9,cb.getPword());
	x=ps.executeUpdate();
	}catch(Exception e) {e.toString();}
	return x;
}
}
