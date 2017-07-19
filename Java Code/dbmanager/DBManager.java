package dbmanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager 
{
	
	public static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String USER = "Jaap";
	public static final String PASS = "1234";
	
	public static Connection getConnection()
	{
		
		try {
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				} 
			catch (ClassNotFoundException e) 
				{
				e.printStackTrace();
				}
			
			return DriverManager.getConnection(URL, USER, PASS);
			
			}
		
		catch (SQLException ex) 
			{
			throw new RuntimeException("Error connecting to the database", ex);
			}
	
	}
	
}
