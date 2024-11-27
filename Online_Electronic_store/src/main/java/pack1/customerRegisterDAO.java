package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class customerRegisterDAO 
{
	public  int insertcustomerdetails(CustomerBean cbean)
	{
		int rowcount=0;
		try
		{
		Connection con=DBConnect.getCon();
		PreparedStatement pstm=con.prepareStatement("insert into customer values(?,?,?,?,?,?,?)");
		pstm.setString(1, cbean.getUname());
		pstm.setString(2, cbean.getUpwd());
		pstm.setString(3, cbean.getUfname());
		pstm.setString(4, cbean.getUlname());
		pstm.setString(5, cbean.getUadress());
		pstm.setString(6, cbean.getUmail());
		pstm.setString(7, cbean.getUmob());
		rowcount=pstm.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return rowcount;
	}
}
