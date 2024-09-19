package com.MyShope.Servlets;
import java.io.*;
import java.util.*;
import com.MyShope.Beans.AddProductBean;
import com.MyShope.Beans.CustomerBean;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/buy")
public class CUSTOMER_BuyProductServlet extends HttpServlet {
	@Override
	  protected void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		HttpSession hs=req.getSession(false);
		String pname=req.getParameter("pmodel");
		if(hs==null) {
			req.setAttribute("msg","NetWork Issue Try Again ...");
			req.getRequestDispatcher("Message.jsp").forward(req, res);
		}else {
		Vector<AddProductBean> vector=(Vector<AddProductBean> )hs.getAttribute("Products");
		Iterator<AddProductBean> it=vector.iterator();
		 while(it.hasNext()){
			AddProductBean ab=(AddProductBean)it.next();
			while(pname.equals(ab.getPmodel())) {
				req.setAttribute("BuyProduct",ab);
				req.getRequestDispatcher("CUSTOMER_BuyProduct.jsp").forward(req, res);
			}
		}
	  }
	}
}
