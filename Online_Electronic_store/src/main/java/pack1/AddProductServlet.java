 package pack1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/aps")
public class AddProductServlet extends HttpServlet
{
  protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
  {
	 try {
		 HttpSession session=req.getSession(false);
	  if(session==null)
	  {
		req.setAttribute("msg", "session expired!!!"); 
		 RequestDispatcher rd=req.getRequestDispatcher("AdminLogin.html");
		   rd.forward(req, res);
	   }
	  else
	  {
		  ProductBean pbean=new ProductBean();
		  pbean.setPcode(req.getParameter("pcode"));
		  pbean.setPname(req.getParameter("pname"));
		  pbean.setPcompany(req.getParameter("pcompany"));
		  pbean.setPprice(req.getParameter("pprice"));
		  pbean.setPqty(req.getParameter("pqty"));
		  int rowcount= new AddProductDAO().insertproduct(pbean);
		  if(rowcount>0)
		  {
			 req.setAttribute("msg", "product added suceessfully");
			 req.getRequestDispatcher("AddProduct.jsp").forward(req, res);
		  }
		  
	  }
	 
	} catch (Exception e) {
		req.setAttribute("msg", "Duplicates are not allowed");
		req.getRequestDispatcher("Error.jsp").forward(req, res);
	}
	 
	  
  }
}
