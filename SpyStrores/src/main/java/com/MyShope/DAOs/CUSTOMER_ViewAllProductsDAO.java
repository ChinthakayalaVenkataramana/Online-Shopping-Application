package com.MyShope.DAOs;
import java.sql.*;
import java.util.Vector;

import com.MyShope.Beans.AddProductBean;
public class CUSTOMER_ViewAllProductsDAO {
  Vector<AddProductBean> v=new Vector<AddProductBean> ();
  public Vector<AddProductBean> ViewAll(){
	  try {
		  Connection con=DBConnection.getcon();
		  PreparedStatement ps=con.prepareStatement("select * from Addproduct");
		  ResultSet rs=ps.executeQuery();
		  while(rs.next()) {
			  AddProductBean ad=new AddProductBean();
			  ad.setCategory(rs.getString(1));
			  ad.setPmodel(rs.getString(2));
			  ad.setImg(rs.getString(3));
			  ad.setPrice(rs.getDouble(4));
			  ad.setQtly(rs.getString(5));
			  ad.setBrand(rs.getString(6));
			  v.add(ad);
		  }
	  }catch(Exception e) {e.toString();}
	  return v;
  }
}
