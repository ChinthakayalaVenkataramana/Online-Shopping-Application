package com.MyShope.Servlets;
import java.io.*;
import com.MyShope.Beans.CustomerBean;
import com.MyShope.DAOs.CUSTOMER_UpdateCustomerDAO;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/update")
public class CUSTOMER_UpdateCustomerServlet extends HttpServlet {
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
	  int x=new CUSTOMER_UpdateCustomerDAO().updating(cb);
		/*PrintWriter pw=res.getWriter();
		pw.println(req.getParameter("fname")+" "+req.getParameter("lname")+" "+req.getParameter("mail")+" "+
			  req.getParameter("pword")+" "+req.getParameter("mandal")+" "+req.getParameter("dist")+" "+req.getParameter("vilg")
			  +" "+Long.parseLong(req.getParameter("phno"))+" "+Long.parseLong(req.getParameter("pin")));*/
		if(x>0) {
		  req.setAttribute("msg","Successfully Updated....");
		  req.getRequestDispatcher("CUSTOMER_UpdateEdit.jsp").forward(req, res);
		}else {
		  req.setAttribute("msg","Enter user details currectly ...");
		  req.getRequestDispatcher("Message.jsp").forward(req, res); 
		}
  }
}
