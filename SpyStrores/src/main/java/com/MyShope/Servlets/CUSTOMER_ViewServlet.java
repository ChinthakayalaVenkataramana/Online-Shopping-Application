package com.MyShope.Servlets;
import java.io.*;
import java.util.Vector;
import com.MyShope.Beans.CustomerBean;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/view")
public class CUSTOMER_ViewServlet extends HttpServlet{
	  protected void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		  HttpSession hs=req.getSession(false);
		  if(hs==null) {
			  req.setAttribute("msg","Session Expired ...");
			  req.getRequestDispatcher("Message.jsp").forward(req, res);
		  }else {
			  Vector<CustomerBean> vector=(Vector<CustomerBean>)hs.getAttribute("vector");
			  req.setAttribute("View", vector);
			  req.getRequestDispatcher("CUSTOMER_ViewCustomerDetails.jsp").forward(req, res);

		  }
	  }
}
