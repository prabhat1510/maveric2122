package daythreebatch1.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	//Static member holds only on instance of the SingletonClass class.
	private static DBConnection singletonClass;
	
	//making constructor private prevents the instantiation from any other class
	private DBConnection() {
		
	}
	
	//Now we are going to provide access 
	public static DBConnection getInstance() {
		if(singletonClass ==null) {
			singletonClass= new DBConnection();
		}
		
		return singletonClass;
	}
	
	
	public static Connection getConnection() throws ClassNotFoundException,SQLException{
			Connection connection = null;
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","password");
			return connection;
	}
}

