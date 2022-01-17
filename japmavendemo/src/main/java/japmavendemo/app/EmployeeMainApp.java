package japmavendemo.app;

import japmavendemo.dao.EmployeeDAO;
import japmavendemo.dao.EmployeeDAOImpl;
import japmavendemo.entities.Employee;

public class EmployeeMainApp {

	public static void main(String[] args) {
		
		EmployeeDAO employeeDao =  new EmployeeDAOImpl();
		boolean isEmployeeAvailable;
		isEmployeeAvailable=employeeDao.isEmployeeAvailable(1);
		System.out.println(isEmployeeAvailable);
		/**
		//To save an employee entity in DB we need entity instance
		Employee employee = new Employee();
		employee.setEmployeeId(3);
		employee.setEmployeeName("Rajesh");
		//Save an employee or add an employee in DB
		String message =employeeDao.addEmployee(employee);
		System.out.println(message);**/
		
		/**
		 * Delete employee invoking remove() of EntityManager
		 */
		//employeeDao.removeEmployee(3);
		//Find all employee from the DB
		System.out.println(employeeDao.findAllEmployees());
		//Find employee from the DB
		System.out.println(employeeDao.findEmployeeByName("Abhishek"));
		System.out.println(employeeDao.findEmployeeByName("Sagar"));
		
		//Want to get name of employee whose employee Id is name
		System.out.println(employeeDao.getEmployeeName(2));
		
		//Update employee name of a particular employee Id 
		Employee emp = new Employee();
		emp.setEmployeeId(1);
		emp.setEmployeeName("Neethu");
		employeeDao.updateEmployee(emp);
	}

}
