package com.MyShope.DAOs;
import java.util.Vector;
import java.sql.*;
import com.MyShope.Beans.AddProductBean;
public class CUSTOMER_FilterDAO {
	public Vector<AddProductBean> vb=new Vector<AddProductBean>();
   public Vector<AddProductBean> Search(int filter,int filter2){
	   try {
	  Connection con=DBConnection.getcon();
	  PreparedStatement ps=con.prepareStatement("select * from Addproduct where PRICE between "+filter+" AND "+filter2+"");
	  //ps.setInt(1, filter);
	  //ps.setInt(2, filter2);
	  ResultSet rs=ps.executeQuery();
	  while(rs.next()) {
		  AddProductBean ad=new AddProductBean();
		  ad.setCategory(rs.getString(1));
		  ad.setPmodel(rs.getString(2));
		  ad.setImg(rs.getString(3));
		  ad.setPrice(rs.getDouble(4));
		  ad.setQtly(rs.getString(5));
		  vb.add(ad);
	  }
	  
   }catch(SQLException sq) {sq.printStackTrace();}
	 return vb;   
   }
}
