package customerjdbcapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

import com.mysql.cj.xdevapi.PreparableStatement;

import customerjdbcapp.dao.utility.QueryMapper;
import customerjdbcapp.model.Customer;

public class CustomerDaoImpl implements CustomerDao {

	public Customer getCustomerById(Integer customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	public String addCustomer(Customer customer) {

		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "password");
			//Preparing prepared statement with query string - INSERT INTO Customer(customerId,customerName,birthDate,mobile,email) VALUES (?,?,?,?,?)
			PreparedStatement prepStmt=connection.prepareCall(QueryMapper.ADD_CUSTOMER);
			//set parameters value
			prepStmt.setInt(1,customer.getCustomerId() );
			prepStmt.setString(2, customer.getCustomerName());
			prepStmt.setString(3, String.valueOf(customer.getBirthDate()));
			prepStmt.setLong(4, customer.getMobile());
			prepStmt.setString(5, customer.getEmail());
			
			int rows= prepStmt.executeUpdate();
			if(rows>0) {
				System.out.println("A new customer is inserted successfully");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "A new customer is inserted successfully";
	}

}
