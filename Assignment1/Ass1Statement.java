package Assignment1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Ass1Statement {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/manishm";
			Connection con=DriverManager.getConnection(url,"root","Manya@750");
			System.out.println("Connection Established");
			
			
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("Select * from emp");
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getFloat(6));
				

			}
			

	}

}
