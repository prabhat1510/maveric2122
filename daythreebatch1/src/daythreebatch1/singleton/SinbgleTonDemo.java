package daythreebatch1.singleton;

import java.sql.Connection;
import java.sql.SQLException;

public class SinbgleTonDemo {

	public static void main(String[] args) {
		ClassA classA = new ClassA();
		classA.setId(15);
		System.out.println(classA.getId());
		
		ClassA classB= new ClassA();
		classB.setId(10);
		System.out.println(classB.getId());
		System.out.println(classA == classB);
		
		
		//Singleton Example
		SingletonClass singletonClass = SingletonClass.getInstance();
		SingletonClass singletonClassA = SingletonClass.getInstance();
		System.out.println(singletonClass == singletonClassA);
		
		
		DBConnection dbConnection = DBConnection.getInstance();
		try {
			Connection connection =dbConnection.getConnection();
			connection.createStatement();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
