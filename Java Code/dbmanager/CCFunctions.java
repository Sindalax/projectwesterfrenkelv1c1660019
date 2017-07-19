package dbmanager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CCFunctions 
{
	
	public void changePass(String a, String b)
	{
		Connection connection = DBManager.getConnection();
		String newPass = b;
		
		if(!b.equals(UserLogin.getPassword()) && a.equals(UserLogin.getUsername()))
		{
		try {
			PreparedStatement ps = connection.prepareStatement("UPDATE GEBRUIKER SET WACHTWOORD=" + newPass + " WHERE WACHTWOORD =" + UserLogin.getPassword());
			ps.executeQuery();
		}
		
		catch (SQLException ex){
			ex.printStackTrace();
		}
		}
		
		if(!b.equals(AdminLogin.getPassword()) && a.equals(AdminLogin.getUsername()))
		{
			try {
				PreparedStatement ps = connection.prepareStatement("UPDATE ADMINISTRATOR SET WACHTWOORD=" + newPass + " WHERE WACHTWOORD =" + AdminLogin.getPassword());
				ps.executeQuery();
			}
				
		
			
			catch (SQLException ex){
				ex.printStackTrace();
			}
		}
	}
	
	
	
	
	public static List<EngWordsPOJO> getEnglishWords()
	{
		
		Connection connection = DBManager.getConnection();
		List<EngWordsPOJO> engWords = new ArrayList<EngWordsPOJO>();
		
		try {
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM ENGELSE_WOORDEN");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				EngWordsPOJO getEngWords = new EngWordsPOJO(rs.getInt(1), rs.getString(2));
				engWords.add(getEngWords);
			}
			
		}
		
		catch (SQLException ex){
			ex.printStackTrace();
		}
		
		
		for (EngWordsPOJO o : engWords)
		{
			System.out.println(o.getWoord());
		}
		
		
		return engWords;
		
		
	}
	
	public static List<NedWoordPOJO> getNedWords()
	{
		
		Connection connection = DBManager.getConnection();
		List<NedWoordPOJO> nedWords = new ArrayList<NedWoordPOJO>();
		
		try {
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM NEDERLANDSE_WOORDEN");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				NedWoordPOJO getNedWords = new NedWoordPOJO(rs.getInt(1), rs.getString(2));
				nedWords.add(getNedWords);
			}
			
		}
		
		catch (SQLException ex){
			ex.printStackTrace();
		}
		
		
		for (NedWoordPOJO o : nedWords)
		{
			System.out.println(o.getWoord());
		}
		
		
		return nedWords;
		
		
	}
	
	public String getNedWoordByID(int id)
	{
		Connection connection = DBManager.getConnection();
		String nedWoord = null;
		
		try {
			PreparedStatement ps = connection.prepareStatement("SELECT WOORD FROM NEDERLANDSE_WOORDEN WHERE ID=" + id);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				nedWoord = rs.getString(1);	
			}
		}
		
		catch (SQLException ex){
			ex.printStackTrace();
		}
		
		return nedWoord;
		
		
	}
	
	public String getEngWoordByID(int id)
	{
		Connection connection = DBManager.getConnection();
		String engWoord = null;
		
		try {
			PreparedStatement ps = connection.prepareStatement("SELECT WOORD FROM ENGELSE_WOORDEN WHERE ID=" + id);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				engWoord = rs.getString(1);
			}
		}
		
		catch (SQLException ex){
			ex.printStackTrace();
		}
		
		return engWoord;
		
		
	}
	
	public void woordGoed(String a, String b, int i)
	{
		Connection connection = DBManager.getConnection();

		if(a.equals(AdminLogin.getUsername()) && b.equals(AdminLogin.getPassword()) && (i == 1))
		{
		try {
			PreparedStatement ps = connection.prepareStatement("UPDATE GEBRUIKER SET PUNTENTOTAAL = PUNTENTOTAAL + 1 WHERE ID = 1");
			ps.executeQuery();
		}
		
		catch (SQLException ex){
			ex.printStackTrace();
		}
		}
		
		if(a.equals(AdminLogin.getUsername()) && b.equals(AdminLogin.getPassword()) && (i == 1))
		{
			try {
				PreparedStatement ps = connection.prepareStatement("UPDATE GEBRUIKER SET PUNTENTOTAAL = PUNTENTOTAAL + 1 WHERE ID = 1");
				ps.executeQuery();
			}
			catch (SQLException ex){
				ex.printStackTrace();
			}
		}
		
		else {
			System.out.println("Uw antwoord was helaas fout!");
		}
		
	}
	
	
	public int toetsTotaal(String a, String b)
	{
		Connection connection = DBManager.getConnection();
		int toetsTotaal = 0;
		
		if(a.equals(UserLogin.getUsername()) && b.equals(UserLogin.getPassword()))
		{
		try {
			PreparedStatement ps = connection.prepareStatement("SELECT TOETSAANTAL FROM GEBRUIKER");
			ResultSet rs = ps.executeQuery();
		
		while(rs.next())
		{
			toetsTotaal = rs.getInt(1);
		}
		}

		catch (SQLException ex){
			ex.printStackTrace();
		}
		}
		
		if(a.equals(AdminLogin.getUsername()) && b.equals(AdminLogin.getPassword()))
		{
		try {
			PreparedStatement ps = connection.prepareStatement("SELECT TOETSAANTAL FROM ADMINISTRATOR");
			ResultSet rs = ps.executeQuery();
		
		while(rs.next())
		{
			toetsTotaal = rs.getInt(1);
		}
		}

		catch (SQLException ex){
			ex.printStackTrace();
		}
		}
		
		
		
		return toetsTotaal;
	}
	
	public int puntenTotaal(String a, String b)
	{
		Connection connection = DBManager.getConnection();
		int puntenTotaal = 0;
		
		if(a.equals(UserLogin.getUsername()) && b.equals(UserLogin.getPassword()))
		{
		try {
			PreparedStatement ps = connection.prepareStatement("SELECT PUNTENTOTAAL FROM GEBRUIKER");
			ResultSet rs = ps.executeQuery();
			
		while(rs.next())
		{
			puntenTotaal = rs.getInt(1);
		}
		
		}
		
		catch (SQLException ex){
			ex.printStackTrace();
		}
		}
		
		if(a.equals(AdminLogin.getUsername()) && b.equals(AdminLogin.getPassword()))
		{
		try {
			PreparedStatement ps = connection.prepareStatement("SELECT PUNTENTOTAAL FROM ADMINISTRATOR");
			ResultSet rs = ps.executeQuery();
			
		while(rs.next())
		{
			puntenTotaal = rs.getInt(1);
		}
		
		}
		
		catch (SQLException ex){
			ex.printStackTrace();
		}
		}
		
		return puntenTotaal;
		
	}
	
	public int insertPuntenGemiddeld(String a, String b)
	{
		Connection connection = DBManager.getConnection();
		int puntenTotaal = 0;
		int toetsTotaal = 0;
		int puntenGemiddeld = 0;
		
		if(a.equals(UserLogin.getUsername()) && b.equals(UserLogin.getPassword()))
		{
		//Ophalen van totaal aantal punten behaald
		try {
			PreparedStatement ps = connection.prepareStatement("SELECT PUNTENTOTAAL FROM GEBRUIKER");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				puntenTotaal = rs.getInt(1);
			}
			
			}
		
		catch (SQLException ex){
			ex.printStackTrace();
		}
		
		//Ophalen van totaal aantal toetsen gemaakt
		try {
			PreparedStatement ps = connection.prepareStatement("SELECT TOETSAANTAL FROM GEBRUIKER");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				toetsTotaal = rs.getInt(1);
			}
			
			}
		
		catch (SQLException ex){
			ex.printStackTrace();
		}
		
		//Ophalen van huidig gemiddelde punten behaald
		try {
			PreparedStatement ps = connection.prepareStatement("SELECT PUNTENGEMIDDELD FROM GEBRUIKER");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				puntenGemiddeld = rs.getInt(1);
			}
			
			}
		
		catch (SQLException ex){
			ex.printStackTrace();	
		}
		
		if(toetsTotaal != 0)
		{
		puntenGemiddeld = puntenGemiddeld + (puntenTotaal /toetsTotaal);
		}
		
		//Inserten van nieuw aantal huidige punten behaald
		try {
			PreparedStatement ps = connection.prepareStatement("UPDATE GEBRUIKER SET PUNTENGEMIDDELD = REPLACE(PUNTENGEMIDDELD, PUNTENGEMIDDELD, ?)");
			ps.setInt(1, puntenGemiddeld);
			ps.executeQuery();
		}
			
		catch (SQLException ex){
			ex.printStackTrace();	
		}
		}
		
		if(a.equals(AdminLogin.getUsername()) && b.equals(AdminLogin.getPassword()))
		{
		//Ophalen van totaal aantal punten behaald
		try {
			PreparedStatement ps = connection.prepareStatement("SELECT PUNTENTOTAAL FROM ADMINISTRATOR");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				puntenTotaal = rs.getInt(1);
			}
			
			}
		
		catch (SQLException ex){
			ex.printStackTrace();
		}
		
		//Ophalen van totaal aantal toetsen gemaakt
		try {
			PreparedStatement ps = connection.prepareStatement("SELECT TOETSAANTAL FROM ADMINISTRATOR");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				toetsTotaal = rs.getInt(1);
			}
			
			}
		
		catch (SQLException ex){
			ex.printStackTrace();
		}
		
		//Ophalen van huidig gemiddelde punten behaald
		try {
			PreparedStatement ps = connection.prepareStatement("SELECT PUNTENGEMIDDELD FROM ADMINISTRATOR");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				puntenGemiddeld = rs.getInt(1);
			}
			
			}
		
		catch (SQLException ex){
			ex.printStackTrace();	
		}
		
		puntenGemiddeld = puntenGemiddeld + (puntenTotaal /toetsTotaal);
		
		//Inserten van nieuw aantal huidige punten behaald
		try {
			PreparedStatement ps = connection.prepareStatement("UPDATE ADMINISTRATOR SET PUNTENGEMIDDELD = REPLACE(PUNTENGEMIDDELD, PUNTENGEMIDDELD, ?)");
			ps.setInt(1, puntenGemiddeld);
			ps.executeQuery();
		}
			
		catch (SQLException ex){
			ex.printStackTrace();	
		}
		}
		

		return puntenGemiddeld;
	
	}
	
	
	
}
