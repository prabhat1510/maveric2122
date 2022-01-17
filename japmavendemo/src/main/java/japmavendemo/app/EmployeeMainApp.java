package japmavendemo.app;

import java.util.HashSet;
import java.util.Set;

import japmavendemo.dao.EmployeeDAO;
import japmavendemo.dao.EmployeeDAOImpl;
import japmavendemo.dao.EmployeeInfoDAO;
import japmavendemo.dao.EmployeeInfoDAOImpl;
import japmavendemo.entities.onetomany.Department;
import japmavendemo.entities.onetomany.Employees;

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
		/**
		//Update employee name of a particular employee Id 
		Employee emp = new Employee();
		emp.setEmployeeId(1);
		emp.setEmployeeName("Neethu");
		employeeDao.updateEmployee(emp);
		**/
		/**
		System.out.println("***********Student information details added");
		Address address = new Address();
		address.setAddressId(2);
		address.setCity("Bengaluru");
		address.setPinCode(560091);
		address.setStreet("Margrath Road");
		
		Student student = new Student();
		student.setStudentId(2);
		student.setAddress(address);
		student.setStudentName("Apna Modi");
		
		StudentInfromationDAO studentInfoDao = new StudentInformationDAOImpl();
		studentInfoDao.addStudentDetails(student);**/
		/**
		System.out.println("***********Student information details added");
		AddressBi address = new AddressBi();
		address.setAddressId(1);
		address.setCity("Bengaluru");
		address.setPinCode(560091);
		address.setStreet("Margrath Road");
		
		StudentBi student = new StudentBi();
		student.setStudentId(1);
		
		student.setStudentName("Apna Modi");
		student.setAddressBi(address);
		address.setStudentbi(student);
		StudentInfromationDAO studentInfoDao = new StudentInformationDAOImpl();
		studentInfoDao.addStudentDetailsBi(student);
		**/
		
		Department department = new Department();
		department.setId(1);
		department.setName("Marketing");
		Employees employee = new Employees();
		employee.setId(1);
		employee.setName("Rajesh Khanna");
		employee.setDepartment(department);
		
		Employees emp = new Employees();
		emp.setId(2);
		emp.setName("Dimple Khanna");
		emp.setDepartment(department);
		/**
		Set<Employees> employees = new HashSet();
		
		department.setEmployee(employees);
		**/
		EmployeeInfoDAO employeeInfoDao=new EmployeeInfoDAOImpl();
		employeeInfoDao.addEmployeeInfoDetails(employee);
		employeeInfoDao.addEmployeeInfoDetails(emp);
	}

}
