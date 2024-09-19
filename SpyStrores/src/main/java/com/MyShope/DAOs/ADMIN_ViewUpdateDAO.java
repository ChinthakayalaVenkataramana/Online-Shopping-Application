package com.MyShope.DAOs;
import java.sql.*;
import java.util.*;

import com.MyShope.Beans.AddProductBean;
public class ADMIN_ViewUpdateDAO {
   LinkedList<AddProductBean> a=new LinkedList<AddProductBean>();
   public LinkedList<AddProductBean> view_update(){
	   try {
	   Connection con=DBConnection.getcon();
	   PreparedStatement ps=con.prepareStatement("select * from Addproduct");
	   ResultSet rs=ps.executeQuery();
	   while(rs.next()) {
		  AddProductBean ab=new AddProductBean();
		  ab.setCategory(rs.getString(1));
		  ab.setPmodel(rs.getString(2));
		  ab.setImg(rs.getString(3));
		  ab.setPrice(rs.getDouble(4));
		  ab.setQtly(rs.getString(5));
		  ab.setBrand(rs.getString(6));
		  a.add(ab);
	   }
	   }catch(Exception e) {e.toString();}
	   return a;
   }
}
