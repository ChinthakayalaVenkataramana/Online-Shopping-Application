package com.MyShope.DAOs;
import java.sql.*;
import java.util.Vector;

import com.MyShope.Beans.AddProductBean;
public class CUSTOMER_SearchDAO {
	 Vector<AddProductBean> v=new Vector<AddProductBean> ();
	  public Vector<AddProductBean> search(String search){
		  try {
			  Connection con=DBConnection.getcon();
			  PreparedStatement ps=con.prepareStatement("select * from Addproduct where lower(brand)=? or lower(pmodel) = ? or lower(category)=?");
			  ps.setString(1,search);
			  ps.setString(2,search);
			  ps.setString(3,search);
			  ResultSet rs=ps.executeQuery();
			  while(rs.next()) {
				  AddProductBean ad=new AddProductBean();
				  ad.setCategory(rs.getString(1));
				  ad.setPmodel(rs.getString(2));
				  ad.setImg(rs.getString(3));
				  ad.setPrice(rs.getDouble(4));
				  ad.setQtly(rs.getString(5));
				  v.add(ad);
			  }
		  }catch(Exception e) {e.printStackTrace();}
		  return v;
	  }

}
