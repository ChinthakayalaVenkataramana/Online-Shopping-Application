package com.MyShope.Servlets;
import java.io.*;
import java.util.Iterator;
import java.util.Vector;

import com.MyShope.Beans.CustomerBean;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/edit")
public class CUSTOMER_EditCustomerServlet extends HttpServlet{
	  protected void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		  HttpSession hs=req.getSession(false);
       String fname=req.getParameter("name");
       
       if(hs==null) {
			  req.setAttribute("msg","Session Expired ...");
			  req.getRequestDispatcher("Message.jsp").forward(req, res);
       }else {
    	   Vector<CustomerBean> vector=(Vector<CustomerBean> )hs.getAttribute("vector");
    	   Iterator<CustomerBean> it=vector.iterator();
    	   if(it.hasNext()){
    	   CustomerBean cb=(CustomerBean)it.next();
    	   req.setAttribute("customer",cb);
		   req.getRequestDispatcher("CUSTOMER_UpdateCustomer.jsp").forward(req, res);
    	   }
        }
	 }
}
