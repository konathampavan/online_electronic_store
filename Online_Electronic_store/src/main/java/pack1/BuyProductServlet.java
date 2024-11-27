package pack1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/buy")
public class BuyProductServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {
    	String str=req.getParameter("pcode");
     HttpSession hs=req.getSession(false);
	  if(hs==null)
	  {
		req.setAttribute("msg", "session expired!!!"); 
		 RequestDispatcher rd=req.getRequestDispatcher("AdminLogin.html");
		   rd.forward(req, res);
	   }
	  else
	  {
		  
		  ArrayList<ProductBean> al=( ArrayList<ProductBean>)hs.getAttribute("ProductList");
		  PrintWriter pw=res.getWriter();   
		  for(ProductBean p:al) {
			  if(str.equals(p.getPcode())) {
			  req.setAttribute("buy", p);
			  req.getRequestDispatcher("BuyProduct.jsp").forward(req, res);
			  }
		  }
  
	  }
    } 
}
