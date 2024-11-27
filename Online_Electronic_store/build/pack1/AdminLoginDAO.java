package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminLoginDAO
{
   public AdminBean checkAdminLogin(String userName,String password)
   {
	   AdminBean abean=null;
	   try
	   {
		   Connection con=DBConnect.getCon();
		   PreparedStatement pstm=con.prepareStatement("select * from admin where  UNAME =? and PWORD=?");
		   pstm.setString(1, userName);
		   pstm.setString(2, password);
		   ResultSet rs=pstm.executeQuery();
		   if(rs.next())
		   {
			   abean=new AdminBean();
			   abean.setUname(rs.getString(1));
			   abean.setUpwd(rs.getString(2));
			   abean.setFname(rs.getString(3));
			   abean.setLname(rs.getString(4));
			   abean.setAddress(rs.getString(5));
			   abean.setMailid(rs.getString(6));
			   abean.setMobile(rs.getString(7));
			   }
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
	   return abean;
   }
}
