package com.MyShope.Servlets;
import java.io.*;

import com.MyShope.Beans.OrderBean;
import com.MyShope.DAOs.CUSTOMER_ConformOrderDAO;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/productBuy")
public class CUSTOMER_ConformOrderServlet extends HttpServlet {
	@Override
	  protected void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
			 OrderBean ob=new OrderBean();
			 ob.setCategory(req.getParameter("category"));
			 ob.setImg(req.getParameter("img"));
			 ob.setMail(req.getParameter("mail"));
			 ob.setPmodel(req.getParameter("pmodel"));
			 ob.setQuality(req.getParameter("qtly"));
			 ob.setPrice(Double.parseDouble(req.getParameter("price")));
			 ob.setQuantity(Byte.parseByte(req.getParameter("quantity")));
				/*PrintWriter pw=res.getWriter();
				 pw.println(Integer.parseInt(req.getParameter("quantity"))+" "+Double.parseDouble(req.getParameter("price"))+" "+req.getParameter("qtly")
				 +" "+req.getParameter("pmodel")+" "+req.getParameter("mail")+" "+req.getParameter("img")+" "+req.getParameter("category"));*/
				int x=new CUSTOMER_ConformOrderDAO().conform(ob);
				if(x>0) {
				 req.setAttribute("msg","Your Order Is Conform ..... ");
				 req.getRequestDispatcher("CUSTOMER_OrderConform.jsp").forward(req, res);
				}else {
				 req.setAttribute("msg","NetWork Issue Try Again ...");
				 req.getRequestDispatcher("Message.jsp").forward(req, res);
				}
	  }
}
