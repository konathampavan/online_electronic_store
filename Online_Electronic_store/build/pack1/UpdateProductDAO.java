package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateProductDAO 
{
	public int UpdateProductDetails(ProductBean pb)
	{ int rowcount=0;
	try {
		Connection con=DBConnect.getCon();
		   
		PreparedStatement pstm=con.prepareStatement("update product set pprice=?,pqty=? where pcode=? ");
	pstm.setString(1, pb.getPprice());
	pstm.setString(2, pb.getPqty());
	pstm.setString(3, pb.getPcode());
	rowcount=pstm.executeUpdate();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
		
		
		return rowcount;
	}
}
