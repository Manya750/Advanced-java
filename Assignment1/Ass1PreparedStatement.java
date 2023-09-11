package Assignment1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class Ass1PreparedStatement {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/manishm";
			Connection con=DriverManager.getConnection(url,"root","Manya@750");
			System.out.println("Connection Established");
			
			PreparedStatement ps=con.prepareStatement("update emp set sal=? where empno=?");
			ps.setFloat(1, 10000);
			ps.setInt(2,7499);
			
			int n=ps.executeUpdate();
			System.out.println("affected rows:"+n);
	}
}
