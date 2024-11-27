package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CustomerLoginDAO 
{
	public CustomerBean Checkcustomerlogin(String userName,String password)
	{    CustomerBean cbean=null;
	
		try
		{
			Connection con=DBConnect.getCon();
			PreparedStatement pstm=con.prepareStatement("select * from customer where  UNAME =? and PWORD=?");
			 pstm.setString(1, userName);
			 pstm.setString(2, password);
			 ResultSet rs=pstm.executeQuery();
			 if(rs.next())
			 {  cbean=new CustomerBean();
			     cbean.setUname(rs.getString(1));
				 cbean.setUpwd(rs.getString(2));
				 cbean.setUfname(rs.getString(3));
				 cbean.setUlname(rs.getString(4));
				 cbean.setUadress(rs.getString(5));
				 cbean.setUmail(rs.getString(6));
				 cbean.setUmob(rs.getString(7));
				 
			 }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return cbean;
	}
}
