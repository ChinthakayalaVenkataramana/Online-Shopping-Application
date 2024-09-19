package com.MyShope.DAOs;
import java.sql.*;
import java.util.LinkedList;
import com.MyShope.Beans.AdminBean;
public class ADMIN_LoginDAO {
  public LinkedList<AdminBean> cb=new LinkedList<AdminBean>(); 
  public LinkedList<AdminBean> Login(String EM,String PW,String CD) {
	  try {
		  Connection con=DBConnection.getcon();
		  PreparedStatement ps=con.prepareStatement("Select * from AdminLRU where mail=? and pword=? and code=?");
		  ps.setString(1,EM);
		  ps.setString(2,PW );
		  ps.setString(3,CD);
		  ResultSet rs=ps.executeQuery();
		  if(rs.next()) {
			  AdminBean ab=new AdminBean();
			  ab.setComName(rs.getString(1));
			  ab.setMail(rs.getString(2));
			  ab.setLocation(rs.getString(5));
			  cb.add(ab);
		  }
	  }catch(Exception e) {e.toString();}
	  return cb;
  }
}
