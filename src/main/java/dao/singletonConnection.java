package dao;

import java.sql.Connection;

public class singletonConnection {
	
	public static Connection connection;
	// le block statique lorsque une class charge au memoire 
	static {
		
		try {
			Class.forName("conn.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
