package com.MyShope.Servlets;
import java.io.*;
import java.util.Vector;

import com.MyShope.Beans.AddProductBean;
import com.MyShope.DAOs.CUSTOMER_ViewAllProductsDAO;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/ViewAllProducts")
public class CUSTOMER_ViewAllProductServlet extends HttpServlet {
	  protected void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		  Vector<AddProductBean> v=new CUSTOMER_ViewAllProductsDAO().ViewAll();
		  if(v==null) {
			  req.setAttribute("msg","Product Not Available...");
			  req.getRequestDispatcher("Message.jsp").forward(req, res);
		  }else {
			  HttpSession hs=req.getSession();
			  hs.setAttribute("Products",v);
			  req.getRequestDispatcher("CUSTOMER_ViewAllProducts.jsp").forward(req, res);
		  }
	  }
}
