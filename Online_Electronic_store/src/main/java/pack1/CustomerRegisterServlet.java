package pack1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/urs")
public class CustomerRegisterServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		CustomerBean bean=new CustomerBean();
		bean.setUname(req.getParameter("uname"));
		bean.setUpwd(req.getParameter("upwd"));
		bean.setUfname(req.getParameter("ufname"));
		bean.setUlname(req.getParameter("ulname"));
		bean.setUadress(req.getParameter("uaddress"));
		bean.setUmail(req.getParameter("umail"));
		bean.setUmob(req.getParameter("umob"));
		int rowcount=new customerRegisterDAO().insertcustomerdetails(bean);
		if(rowcount>0)
		{
			req.setAttribute("msg", "data registered sucessfully!!!<br>");
			RequestDispatcher rd=req.getRequestDispatcher("CustomerRegister.jsp");
			rd.forward(req, res);
			
		}
		else
		{
			req.setAttribute("msg", "data  not registered sucessfully!!!<br>");
			RequestDispatcher rd=req.getRequestDispatcher("CustomerRegister.jsp");
			rd.forward(req, res);
		}
		
	}
}
