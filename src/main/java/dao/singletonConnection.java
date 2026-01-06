package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class singletonConnection {
	
	public static Connection connection;
	// le block statique lorsque une class charge au memoire 
	static {
		
		try {
			Class.forName("conn.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306:/db_cat","root","");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static Connection getConnection() {
		return connection;
	}	

}
