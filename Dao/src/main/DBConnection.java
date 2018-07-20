package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {

	private static Connection connection=null;
	private DBConnection(){
		
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
	 connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/supply","root","root");
			
			
			
			
		}
		catch (ClassNotFoundException  e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static Connection getConnection(){
		try {
			if(connection==null || connection.isClosed()){
				new DBConnection();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
}
