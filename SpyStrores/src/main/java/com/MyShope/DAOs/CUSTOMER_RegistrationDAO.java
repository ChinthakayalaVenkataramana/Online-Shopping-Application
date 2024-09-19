package com.MyShope.DAOs;
import java.sql.*;
import com.MyShope.Beans.CustomerBean;
public class CUSTOMER_RegistrationDAO {
public int x=0;
public int registration(CustomerBean cb) {
	try {
	Connection con=DBConnection.getcon();
	PreparedStatement ps=con.prepareStatement("Insert into my_customer values(?,?,?,?,?,?,?,?,?)");
	ps.setString(1,cb.getFname());
	ps.setString(2,cb.getLname());
	ps.setString(3,cb.getMail());
	ps.setString(4,cb.getPword());
	ps.setString(5,cb.getMadal());
	ps.setString(6,cb.getDist());
	ps.setString(7,cb.getVillage());
	ps.setLong(8,cb.getPhno());
	ps.setLong(9,cb.getPin());
	x=ps.executeUpdate();
	}catch(Exception e) {e.toString();}
	return x;
}
}
