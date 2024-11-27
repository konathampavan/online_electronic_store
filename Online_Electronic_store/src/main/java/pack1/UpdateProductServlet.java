package pack1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/update")
public class UpdateProductServlet extends HttpServlet
{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	 HttpSession session=req.getSession(false);
	  if(session==null)
	  {
		req.setAttribute("msg", "session expired!!!"); 
		 RequestDispatcher rd=req.getRequestDispatcher("AdminLogin.html");
		   rd.forward(req, res);
	   }
	  else
	  {
		  String pcode=req.getParameter("pcode");
		  ArrayList<ProductBean> al=( ArrayList<ProductBean>)session.getAttribute("ProductList");
		  ProductBean pb=null;
		  Iterator<ProductBean>i=al.iterator();
		  int rowcount=0;
		  while(i.hasNext())
		  {
			  pb=i.next();
			  if(pcode.equals(pb.getPcode()))
			  {
				  pb.setPprice(req.getParameter("pprice"));
				  pb.setPqty(req.getParameter("pqty"));
				   rowcount=new UpdateProductDAO().UpdateProductDetails(pb); 
				   break;
				 
			  }
			
	  }
		  if(rowcount>0)
		  {
			  req.setAttribute("msg", "product Details Updated!!!");
			  req.getRequestDispatcher("UpdateProduct.jsp").forward(req, res);
		  }else {
			  req.setAttribute("msg", "product Details Not Updated!!!");
			  req.getRequestDispatcher("UpdateProduct.jsp").forward(req, res);
			  
		  }
}
}
}