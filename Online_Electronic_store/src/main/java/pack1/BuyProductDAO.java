package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BuyProductDAO 
{
	
	 public  void BuyProduct(String username)
	 {
		 try
		 {
			 Connection con=DBConnect.getCon();
			   PreparedStatement pstm=con.prepareStatement("select * from product where pcode=? ");
			   pstm.setString(1, username);
			   ResultSet rs=pstm.executeQuery();
			   while(rs.next())
			   {
			   ProductBean pb=new ProductBean();
			   pb.setPcode(rs.getString(1));
			   pb.setPname(rs.getString(2));
			   pb.setPcompany(rs.getString(3));
			   pb.setPprice(rs.getString(4));
			   pb.setPqty(rs.getString(5));
			 
				   
			   }
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		 
		 
		
}
}
