package com.MyShope.DAOs;
import java.sql.*;
import com.MyShope.Beans.AddProductBean;
public class ADMIN_AddProductDAO {
  public int x=0;
  public int Addproduct(AddProductBean ab) {
	  try {
	  Connection con=DBConnection.getcon();
	  PreparedStatement ps=con.prepareStatement("insert into Addproduct values(?,?,?,?,?,?)");
	  ps.setString(1, ab.getCategory());
	  ps.setString(2,ab.getPmodel());
	  ps.setString(3,ab.getImg());
	  ps.setDouble(4,ab.getPrice());
	  ps.setString(5,ab.getQtly());
	  ps.setString(6,ab.getBrand());
	  x=ps.executeUpdate();
	  }catch(Exception e) {e.toString();}
	 return x;
  }
}
