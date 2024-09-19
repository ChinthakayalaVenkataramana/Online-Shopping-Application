package com.MyShope.Servlets;
import java.io.*;
import java.util.*;

import com.MyShope.Beans.AddProductBean;
import com.MyShope.DAOs.CUSTOMER_SearchDAO;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/Search")
public class CUSTOMER_SearchingProduct extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException {
		HttpSession hs=req.getSession(false);
		String searching=req.getParameter("searching").toLowerCase();
		/*PrintWriter pw=res.getWriter();
		pw.println(searching);*/
		Vector<AddProductBean> v=new CUSTOMER_SearchDAO().search(searching);
		if(v.isEmpty()) {
			req.setAttribute("msg", "Product Not Available");
			req.getRequestDispatcher("Message.jsp").forward(req, res);
		}else {	
			hs.setAttribute("Products", v);
			req.getRequestDispatcher("CUSTOMER_ViewAllProducts.jsp").forward(req, res);
		}
		
	}

}
