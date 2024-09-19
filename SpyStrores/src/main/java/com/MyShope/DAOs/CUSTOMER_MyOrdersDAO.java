package com.MyShope.DAOs;
import java.sql.*;
import java.util.Vector;

import com.MyShope.Beans.OrderBean;
public class CUSTOMER_MyOrdersDAO {
	Vector<OrderBean> v=new Vector<OrderBean>();
	public Vector<OrderBean> orders(String EM) {
		try {
		Connection con=DBConnection.getcon();
		PreparedStatement ps=con.prepareStatement("Select * from myorders where mail=?");
		ps.setString(1, EM);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			OrderBean ob=new OrderBean();
			ob.setCategory(rs.getString(1));
			ob.setPmodel(rs.getString(2));
			ob.setImg(rs.getString(3));
			ob.setMail(rs.getString(4));
			ob.setQuality(rs.getString(5));
			ob.setPrice(rs.getDouble(6));
			ob.setQuantity(rs.getByte(7));
			ob.setDate(rs.getString(8));
			v.add(ob);
		 }
		}catch(Exception e){e.toString();}
		return v;
	}
}
