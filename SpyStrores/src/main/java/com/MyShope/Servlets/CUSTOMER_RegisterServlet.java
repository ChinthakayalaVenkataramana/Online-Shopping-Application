package com.MyShope.Servlets;
import java.io.*;
import com.MyShope.Beans.CustomerBean;
import com.MyShope.DAOs.CUSTOMER_RegistrationDAO;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/register")
public class CUSTOMER_RegisterServlet extends HttpServlet {
	@Override
  protected void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
	  CustomerBean cb=new CustomerBean();
	  cb.setFname(req.getParameter("fname"));
	  cb.setLname(req.getParameter("lname"));
	  cb.setMail(req.getParameter("mail"));
	  cb.setPword(req.getParameter("pword"));
	  cb.setMadal(req.getParameter("mandal"));
	  cb.setDist(req.getParameter("dist"));
	  cb.setVillage(req.getParameter("vilg"));
	  cb.setPhno(Long.parseLong(req.getParameter("phno")));
	  cb.setPin(Long.parseLong(req.getParameter("pin")));
	 /* PrintWriter pw=res.getWriter();
	  pw.println(req.getParameter("fname")+" "+req.getParameter("lname"));*/
		int x=new CUSTOMER_RegistrationDAO().registration(cb);
		if(x>0) {
		  req.setAttribute("msg","Successfully Register...");
		  req.getRequestDispatcher("CUSTOMER_Register.jsp").forward(req, res);
		}else {
		  req.setAttribute("msg","Enter user details currectly ...");
		  req.getRequestDispatcher("Message.jsp").forward(req, res); 
		}
		     }
}
