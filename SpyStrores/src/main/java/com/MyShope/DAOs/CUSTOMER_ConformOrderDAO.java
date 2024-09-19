package com.MyShope.DAOs;
import java.sql.*;
import com.MyShope.Beans.OrderBean;
public class CUSTOMER_ConformOrderDAO {
  public int x=0;
  public int conform(OrderBean ob) {
	  try {
	  Connection con=DBConnection.getcon();
	  PreparedStatement ps=con.prepareStatement("insert into myorders values(?,?,?,?,?,?,?,sysdate)");
	  ps.setString(1,ob.getCategory());
	  ps.setString(2,ob.getPmodel());
	  ps.setString(3,ob.getImg());
	  ps.setString(4,ob.getMail());
	  ps.setString(5,ob.getQuality());
	  ps.setDouble(6,ob.getPrice());
	  ps.setByte(7,ob.getQuantity());
	  x=ps.executeUpdate();
	  }catch(Exception e) {e.toString();}	
	  return x;
  }
}
