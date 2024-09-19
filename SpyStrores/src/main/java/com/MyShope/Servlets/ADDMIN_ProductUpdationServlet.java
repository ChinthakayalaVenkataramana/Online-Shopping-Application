package com.MyShope.Servlets;
import java.io.*;
import com.MyShope.Beans.AddProductBean;
import com.MyShope.DAOs.ADMIN_updateDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
@WebServlet("/UpdatePd")
public class ADDMIN_ProductUpdationServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException {
		AddProductBean ab=new AddProductBean();
		ab.setPmodel(req.getParameter("pname"));
		ab.setCategory(req.getParameter("category"));
		ab.setImg(req.getParameter("img"));
		ab.setPrice(Float.parseFloat(req.getParameter("price")));
		ab.setQtly(req.getParameter("quty"));
		int x=new ADMIN_updateDAO().updates(ab);
		if(x>0) {
			req.setAttribute("updates", "update successfully....");
			req.getRequestDispatcher("ADMIN_ViewUpdate.jsp").forward(req, res);
		}else {
			req.setAttribute("msg","Product Not Available....");
			req.getRequestDispatcher("Message.jsp").forward(req, res);
		}
	}
}
