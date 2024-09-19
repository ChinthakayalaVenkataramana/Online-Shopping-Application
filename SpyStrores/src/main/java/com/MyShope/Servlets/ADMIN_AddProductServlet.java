package com.MyShope.Servlets;
import java.io.*;
import com.MyShope.Beans.AddProductBean;
import com.MyShope.DAOs.ADMIN_AddProductDAO;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/addproducts")
public class ADMIN_AddProductServlet extends HttpServlet{
	   protected void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		   AddProductBean Ab=new AddProductBean();
		   Ab.setCategory(req.getParameter("catego"));
		   Ab.setPmodel(req.getParameter("pname"));
		   Ab.setImg(req.getParameter("img"));
		   Ab.setPrice(Double.parseDouble(req.getParameter("price")));
		   Ab.setQtly(req.getParameter("qtly"));
		   Ab.setBrand(req.getParameter("brand"));
		   int x=new ADMIN_AddProductDAO().Addproduct(Ab);
			/* PrintWriter pw=res.getWriter();
			 pw.println(req.getParameter("catego")+" "+req.getParameter("pname")+" "+req.getParameter("img")+" "+Double.parseDouble(req.getParameter("price"))+" "+req.getParameter("qtly"));*/
		   if(x>0) {
			   req.setAttribute("msg","Successfully Added Product ...");
			   req.getRequestDispatcher("ADMIN_AddProduct.jsp").forward(req, res);
		   }else {
			   req.setAttribute("msg","Enter currectly ...");
			   req.getRequestDispatcher("Message.jsp").forward(req, res); 
		   }
	   }
}
