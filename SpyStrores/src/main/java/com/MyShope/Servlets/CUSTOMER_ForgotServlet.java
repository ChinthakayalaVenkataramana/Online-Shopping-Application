package com.MyShope.Servlets;
import java.io.*;
import com.MyShope.DAOs.CUSTOMER_ForgotDAO;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/forgot")
public class CUSTOMER_ForgotServlet extends HttpServlet{
	@Override
  protected void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException {
	  String mail=req.getParameter("mail");
	  String pword=req.getParameter("pword");
	  int x=new CUSTOMER_ForgotDAO().forgot(mail,pword);
	  if(x>0) {
		  req.setAttribute("msg","Successfully Changed ...");
	  }else {
		  req.setAttribute("msg","Enter Currect Mail  ...");
	  }
	  req.getRequestDispatcher("CUSTOMER_Register.jsp").forward(req, res);
  }
}
