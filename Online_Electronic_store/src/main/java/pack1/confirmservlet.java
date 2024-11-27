package pack1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/confirm")
public class confirmservlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       int rowsUpdated=0;
    	String pcode = request.getParameter("pcode");
        String price = request.getParameter("price");
        int requestedQty = Integer.parseInt(request.getParameter("req"));
        int availableQty = Integer.parseInt(request.getParameter("pqty"));
        
        
        //int newQty = availableQty - requestedQty;

        // Database connection and update logic
        try  {
        	Connection conn = DBConnect.getCon();
            String updateQuery = "UPDATE product SET PQTY = ? WHERE PCODE = ?";
           
            	PreparedStatement stmt = conn.prepareStatement(updateQuery);
               
				stmt.setInt(1, availableQty);
                stmt.setString(2, pcode);

                 rowsUpdated = stmt.executeUpdate();
            } catch (SQLException e) 
            {
                e.printStackTrace();
                
            }
                
                if (rowsUpdated > 0) 
                {
                	request.setAttribute("msg", "Purchase confirmed and quantity updated successfully.");
                	 request.getRequestDispatcher("confirm.jsp").forward(request, response);
                } else {
                	request.setAttribute("msg","Error: Could not update product quantity.");
                        	 request.getRequestDispatcher("confirm.jsp").forward(request, response);
                
                }
    }
}
        
    

