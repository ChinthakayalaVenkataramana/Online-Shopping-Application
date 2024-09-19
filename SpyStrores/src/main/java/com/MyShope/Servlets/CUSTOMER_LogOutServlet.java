package com.MyShope.Servlets;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/logoutCustomer")
public class CUSTOMER_LogOutServlet extends HttpServlet {
	  protected void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		  HttpSession hs=req.getSession(false);
		  if(hs==null) {
			  req.setAttribute("msg","Session Expired ...");
		  }else {
			 hs.removeAttribute("vector");
			 
			 req.setAttribute("msg","LogOut Successfully ...");
		  }
		  req.getRequestDispatcher("Message.jsp").forward(req, res);
	  }  
}
