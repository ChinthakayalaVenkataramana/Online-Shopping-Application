package com.MyShope.DAOs;
import java.sql.*;
import com.MyShope.Beans.AddProductBean;
public class ADMIN_updateDAO {
 private int x=0;
 private static String UPDATE_PRODUCT="update Addproduct set category=?,pmodel=?,img=?,price=?,quality=? where img=? or pmodel=?"; 
 public int updates(AddProductBean ab) {
	 try {
	 Connection con=DBConnection.getcon();
	 PreparedStatement ps=con.prepareStatement(UPDATE_PRODUCT);
	 ps.setString(1,ab.getCategory());
	 ps.setString(2, ab.getPmodel());
	 ps.setString(3,ab.getImg());
	 ps.setDouble(4,ab.getPrice());
	 ps.setString(5,ab.getQtly());
	 ps.setString(6,ab.getImg());
	 ps.setString(7,ab.getPmodel());
	 x=ps.executeUpdate();
	 }catch(Exception e) {e.toString();}
	 return x;
 }
}
