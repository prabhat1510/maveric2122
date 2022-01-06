package customerjdbcapp.main;

import java.time.LocalDate;

import customerjdbcapp.dao.CustomerDao;
import customerjdbcapp.dao.CustomerDaoImpl;
import customerjdbcapp.model.Customer;

public class CustomerMainApp {

	public static void main(String[] args) {
		CustomerDao customerDao = new CustomerDaoImpl();
		Customer customer = new Customer();
		customer.setCustomerId(1);
		customer.setCustomerName("Shahnawaz");
		customer.setEmail("s@gmail.com");
		customer.setMobile(9999106211L);
		customer.setBirthDate(LocalDate.now());
		
		
		System.out.println(customerDao.addCustomer(customer));

	}

}
