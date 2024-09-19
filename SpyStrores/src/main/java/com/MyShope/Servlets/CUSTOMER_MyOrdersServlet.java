package com.MyShope.Servlets;
import java.io.*;
import java.util.Iterator;
import java.util.Vector;

import com.MyShope.Beans.OrderBean;
import com.MyShope.DAOs.CUSTOMER_MyOrdersDAO;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/myorders")
public class CUSTOMER_MyOrdersServlet extends HttpServlet {
	  protected void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException {
		  String mail=req.getParameter("mail");
		  Vector<OrderBean> ob=new CUSTOMER_MyOrdersDAO().orders(mail);
		  if(ob==null) {
			  req.setAttribute("msg","Your Not Orderd Any Product...");
			  req.getRequestDispatcher("Message.jsp").forward(req, res); 
		  }else {
			 req.setAttribute("order", ob);
			 req.getRequestDispatcher("CUSTOMER_MyOrder.jsp").forward(req, res);
		  }
	  }
}