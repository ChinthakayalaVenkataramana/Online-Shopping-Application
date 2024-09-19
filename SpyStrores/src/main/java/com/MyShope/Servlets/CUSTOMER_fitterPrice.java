package com.MyShope.Servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;

import com.MyShope.Beans.AddProductBean;
import com.MyShope.DAOs.CUSTOMER_FilterDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@SuppressWarnings("serial")
@WebServlet("/Filters")
public class CUSTOMER_fitterPrice extends HttpServlet{
	@Override
 protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException {
		String filterPrice=req.getParameter("f-price");
		int filter1=0;
		int filter2=0;
		if(filterPrice.equals("Below 500")) {
			filter1=100;
			filter2=500;
		}else if(filterPrice.equals("500-1000")) {
			filter1=500;
			filter2=1000;
		}else if(filterPrice.equals("1000-2000")) {
			filter1=1000;
			filter2=2000;
		}else if(filterPrice.equals("2000-5000")) {
			filter1=2000;
			filter2=5000;
		}else if(filterPrice.equals("5000-10000")) {
			filter1=5000;
			filter2=10000;
		}else if(filterPrice.equals("10000-20000")) {
			filter1=10000;
			filter2=20000;
		}else if(filterPrice.equals("Above 20000")) {
			filter1=20000;
			filter2=1000000;
		}else {	}
		/*PrintWriter pe=res.getWriter();
		pe.println(filter1+" "+filter2);*/
        
		HttpSession hs=req.getSession(false);
		Vector<AddProductBean> vb=new CUSTOMER_FilterDAO().Search(filter1,filter2);
		if(vb==null||vb.isEmpty() ) {
			req.setAttribute("msg","Products Not Available");
			req.getRequestDispatcher("Message.jsp").forward(req, res);
		}else {
			hs.setAttribute("Products",vb);
			req.getRequestDispatcher("CUSTOMER_ViewAllProducts.jsp").forward(req, res);
		}
 }
}
