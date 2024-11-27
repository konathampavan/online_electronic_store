package pack1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/delete")
public class DeleteProductServlet extends HttpServlet
{
   @Override
protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
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
			  int rowcount= new DeleteProductDAO().DeleteProductDetails(pbean);
			  if(rowcount>0)
			  {
				 req.setAttribute("msg", "product Deleted suceessfully");
				 req.getRequestDispatcher("DeleteProduct.jsp").forward(req, res);
			  }
			 
		  }
}
}

