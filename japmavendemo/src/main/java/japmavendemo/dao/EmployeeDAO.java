package japmavendemo.dao;

import java.util.List;

import japmavendemo.entities.Employee;

public interface EmployeeDAO {
	public boolean isEmployeeAvailable(Integer employeeId);
	public String addEmployee(Employee employee);
	public List<Employee> findAllEmployees();
	public void removeEmployee(int id);
	public void updateEmployee(Employee employee);
	public List<Employee> findEmployeeByName(String empName);
	public String getEmployeeName(Integer empId) ;
}
