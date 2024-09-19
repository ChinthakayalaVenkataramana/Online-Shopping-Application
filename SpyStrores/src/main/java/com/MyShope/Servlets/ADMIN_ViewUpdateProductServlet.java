package com.MyShope.Servlets;
import java.io.*;
import java.util.LinkedList;
import java.util.PriorityQueue;

import com.MyShope.Beans.AddProductBean;
import com.MyShope.DAOs.ADMIN_ViewUpdateDAO;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/viewUpdate")
public class ADMIN_ViewUpdateProductServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
		LinkedList<AddProductBean> pq=new ADMIN_ViewUpdateDAO().view_update();
		if(pq==null) {
		req.setAttribute("msg", "Products Not Available ...");	
		req.getRequestDispatcher("Message.jsp").forward(req, res);
		}else {
			HttpSession hs=req.getSession();
			hs.setAttribute("ap",pq);
			req.getRequestDispatcher("ADMIN_ViewUpdate.jsp").forward(req, res);
		}
		
	}

}
