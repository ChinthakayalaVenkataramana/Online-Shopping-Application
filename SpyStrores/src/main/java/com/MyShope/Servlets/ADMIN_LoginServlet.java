package com.MyShope.Servlets;
import java.io.*;
import java.util.LinkedList;
import com.MyShope.Beans.AdminBean;
import com.MyShope.DAOs.ADMIN_LoginDAO;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/admin")
public class ADMIN_LoginServlet extends HttpServlet {
   protected void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
	   String Email=req.getParameter("mail");
	   String pword=req.getParameter("pword");
	   String code=req.getParameter("code");
	   PrintWriter pw=res.getWriter();
	   //pw.println(Email+" "+pword+" "+code);
	   
	   LinkedList<AdminBean> ab=new ADMIN_LoginDAO().Login(Email, pword, code);
	   if(ab.isEmpty()) {
		   req.setAttribute("msg","Invalid Email & Password & Code..");
		   req.getRequestDispatcher("Message.jsp").forward(req, res);
	   }else {
		   req.setAttribute("adminB", ab);
		   req.getRequestDispatcher("ADMIN_Login.jsp").forward(req, res);
	   }
	}
}
