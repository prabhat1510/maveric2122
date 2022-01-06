package customerjdbcapp.main;

import java.time.LocalDate;

import customerjdbcapp.dao.CustomerDao;
import customerjdbcapp.dao.CustomerDaoImpl;
import customerjdbcapp.model.Customer;

public class CustomerMainApp {

	public static void main(String[] args) {
		CustomerDao customerDao = new CustomerDaoImpl();
		Customer customer = new Customer();
		customer.setCustomerId(2);
		customer.setCustomerName("SAGAR");
		customer.setEmail("sagar@gmail.com");
		customer.setMobile(9999106212L);
		customer.setBirthDate(LocalDate.now());
		
		
		//System.out.println(customerDao.addCustomer(customer));
		Customer cust = customerDao.getCustomerById(1);
		System.out.println(cust);
		System.out.println(customerDao.getAllCustomers());

	}

}
