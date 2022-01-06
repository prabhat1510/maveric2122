package customerjdbcapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import customerjdbcapp.dao.utility.MySQLDataSource;
import customerjdbcapp.dao.utility.QueryMapper;
import customerjdbcapp.model.Customer;

public class CustomerDaoImpl implements CustomerDao {

	public Customer getCustomerById(Integer customerId) {
		try {
			Connection connection =MySQLDataSource.getConnection();
			PreparedStatement prepStmt = connection.prepareStatement(QueryMapper.GET_CUSTOMER_BY_ID);
			prepStmt.setInt(1, customerId);
			ResultSet resultSet = prepStmt.executeQuery();
			if (resultSet.next()) {
				Customer customer = new Customer();
				populateCustomer(customer, resultSet);
				return customer;
			} else {
				throw new SQLException("Invalid customerId");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	public String addCustomer(Customer customer) {

		try {
			Connection connection =MySQLDataSource.getConnection();
			// Preparing prepared statement with query string - INSERT INTO
			// Customer(customerId,customerName,birthDate,mobile,email) VALUES (?,?,?,?,?)
			PreparedStatement prepStmt = connection.prepareCall(QueryMapper.ADD_CUSTOMER);
			// set parameters value
			prepStmt.setInt(1, customer.getCustomerId());
			prepStmt.setString(2, customer.getCustomerName());
			prepStmt.setString(3, String.valueOf(customer.getBirthDate()));
			prepStmt.setLong(4, customer.getMobile());
			prepStmt.setString(5, customer.getEmail());

			int rows = prepStmt.executeUpdate();
			if (rows > 0) {
				System.out.println("A new customer is inserted successfully");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "A new customer is inserted successfully";
	}

	public List<Customer> getAllCustomers() {
		List<Customer> customerList = new ArrayList<Customer>();
		try {
			Connection connection =MySQLDataSource.getConnection();

			Statement stmt = connection.createStatement();
			ResultSet resultSet = stmt.executeQuery(QueryMapper.GET_ALL_CUSTOMERS);
			
			while (resultSet.next()) {
				Customer customer = new Customer();
				populateCustomer(customer, resultSet);
				customerList.add(customer);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return customerList;
	}

	private void populateCustomer(Customer customer, ResultSet resultSet) throws SQLException {
		customer.setCustomerId(resultSet.getInt("customerId"));
		customer.setCustomerName(resultSet.getString("customerName"));
		customer.setBirthDate(resultSet.getDate("birthDate").toLocalDate());
		customer.setMobile(resultSet.getLong("mobile"));
		customer.setEmail(resultSet.getString("email"));
	}

}
