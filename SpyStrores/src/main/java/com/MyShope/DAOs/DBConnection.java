package com.MyShope.DAOs;
import java.sql.*;
public class DBConnection {
  public static Connection con=null;
  static {
	  try {
		  Class.forName("oracle.jdbc.driver.OracleDriver");
		 con=DriverManager.getConnection(DBInfo.url,DBInfo.uname,DBInfo.pword); 
	      }catch(Exception e) {e.toString();} 
	  }
  public static Connection getcon() {
		 return con;
     }
}
