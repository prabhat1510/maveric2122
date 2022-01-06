package customerjdbcapp.dao.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MySQLDataSource {

	public static Connection getConnection() {
		Connection connection = null;
		try {

			// connection =
			// DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root",
			// "password");
			Properties prop = getDataProperties();
			connection = DriverManager.getConnection(prop.getProperty("MYSQL_URL"), prop.getProperty("MYSQL_USERNAME"),
					prop.getProperty("MYSQL_PASSWORD"));

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

	public static Properties getDataProperties() {
		Properties props = new Properties();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("src/main/resources/application.properties");
			props.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return props;

	}
}
