package Assignment1;
import java.sql.Connection;
import java.sql.DriverManager;


public class CreateConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try 
		{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/manishm";
			Connection con=DriverManager.getConnection(url,"root","Manya@750");
			System.out.println("Connection Established");
		}
		catch(Exception e)
			{ 
				System.out.println("REJECTED");
			}
			
		
	}

}
