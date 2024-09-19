package com.MyShope.Servlets;
import java.io.*;
import java.util.*;

import com.MyShope.Beans.AddProductBean;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/UProduct")
public class ADMIN_UpdateProductServlet1 extends HttpServlet {
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		String pname=req.getParameter("pmodel");
		PrintWriter pw=res.getWriter();
		HttpSession hs=req.getSession(false);
		if(hs==null) {
			req.setAttribute("msg", "Products Not Available ...");	
			req.getRequestDispatcher("Message.jsp").forward(req, res);
		}else {
			LinkedList<AddProductBean> pq =(LinkedList<AddProductBean>)hs.getAttribute("ap");
			Iterator<AddProductBean> it=pq.iterator();
			while(it.hasNext()) {
				AddProductBean ap=(AddProductBean)it.next();
				if(ap.getPmodel().equals(pname)) {
					req.setAttribute("update", ap);	
					req.getRequestDispatcher("ADMIN_UpdateProduct.jsp").forward(req, res);
				}
			}
		}
	}

}
