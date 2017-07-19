package dbmanager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UserLogin 
{

	public static String getUsername()
	{
		//Neemt de user input om te vergelijken met de resultset van de select statement
		String userValue = null;
		
		Connection connection = DBManager.getConnection();
		
		//Select statement
		try {
			PreparedStatement ps = connection.prepareStatement("SELECT GEBRUIKERSNAAM FROM GEBRUIKER");
			ResultSet rs = ps.executeQuery();
			
			//Als de input van de user gevonden is wordt userValue de input van de user
			if (rs.next())
			{
				userValue = rs.getString(1);
			}
			
			else {
				System.out.println("Username not found!");
			}
			
		}
		
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}

		return userValue;
		
	}
	
	public static String getPassword()
	{
		String passValue = null;
		
		Connection connection = DBManager.getConnection();
		
		
		try {
			PreparedStatement ps = connection.prepareStatement("SELECT WACHTWOORD FROM Gebruiker");
			ResultSet rs = ps.executeQuery();
			
			if (rs.next())
			{
				passValue = rs.getString(1);
			}
			
			else {
				System.out.println("Password not found!");
			}
			
		}
		
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}

		return passValue;
		
	}
	
}
