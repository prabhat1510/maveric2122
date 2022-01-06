package customerjdbcapp.dao;

import customerjdbcapp.model.Customer;

public interface CustomerDao {
	
	public Customer getCustomerById(Integer customerId);
	public String addCustomer(Customer customer);
}
