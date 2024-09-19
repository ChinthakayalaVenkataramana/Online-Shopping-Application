package com.MyShope.Servlets;
import java.io.*;
import java.util.Vector;
import com.MyShope.Beans.CustomerBean;
import com.MyShope.DAOs.CUSTOMER_LoginDAO;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/login")
public class CUSTOMER_LoginServlet extends HttpServlet {
	@Override
	  protected void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		String email=req.getParameter("mail");
		String pword=req.getParameter("pword1");
		/*
		 * PrintWriter pw=res.getWriter();
		 *  pw.println(email+" "+pword);
		 */
		  Vector<CustomerBean> vector=new CUSTOMER_LoginDAO().login(email,pword);
		  if(vector.isEmpty()) {
		  req.setAttribute("msg","Invalid Email & Password ...");
		  req.getRequestDispatcher("Message.jsp").forward(req, res); 
		  }else {
		  HttpSession hs=req.getSession(); 
		  hs.setAttribute("vector",vector);
		  req.getRequestDispatcher("CUSTOMER_Login.jsp").forward(req, res);
		  }
		 
		 
	}
}
