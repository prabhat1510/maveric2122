package customerjdbcapp.dao;

import java.util.List;

import customerjdbcapp.model.Customer;

public interface CustomerDao {
	
	public Customer getCustomerById(Integer customerId);
	public String addCustomer(Customer customer);
	public List<Customer> getAllCustomers();
}
