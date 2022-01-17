package japmavendemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import japmavendemo.entities.Employee;
import japmavendemo.utility.EntityManagerUtility;

public class EmployeeDAOImpl implements EmployeeDAO {

	public boolean isEmployeeAvailable(Integer employeeId) {
		EntityManager entityManager = EntityManagerUtility.getEntityManager();
		Employee employee = entityManager.find(Employee.class, employeeId);

		if (employee == null) {
			return false;
		}
		return true;
	}

	public String addEmployee(Employee employee) {
		EntityManager entityManager = EntityManagerUtility.getEntityManager();
		entityManager.getTransaction().begin();
		//Save employee to the database
		entityManager.persist(employee);
		entityManager.getTransaction().commit();
		entityManager.close();
		return "Employee added successfully";
	}

	/**
	 * Entity Manager's find() method can be used to locate single entity only based on primary key value
	 * What if you want to load data based on complex criteria?
	 * --JPQL--
	 * Java Persistence Query Language - is a platform independent Object Oriented Query Language defined as part of the JPA specification 
	 */
	//Here we want to get all entities instances from RDBMS
	public List<Employee> findAllEmployees() {
		EntityManager entityManager = EntityManagerUtility.getEntityManager();
		entityManager.getTransaction().begin();
		
		TypedQuery<Employee> query = entityManager.createQuery("Select e from Employee e", Employee.class);
		
		List<Employee> employees = query.getResultList();
		
		entityManager.getTransaction().commit();
		entityManager.close();
		return employees;
	}
	//Find employee by name this is an example of JPQL with condition
	public List<Employee> findEmployeeByName(String empName) {
		EntityManager entityManager = EntityManagerUtility.getEntityManager();
		entityManager.getTransaction().begin();
		
		TypedQuery<Employee> query = entityManager.createQuery("Select e from Employee e where e.employeeName=:empName", Employee.class);
		query.setParameter("empName", empName);
		List<Employee> employees = query.getResultList();
		
		entityManager.getTransaction().commit();
		entityManager.close();
		return employees;
	}
	
	//Find employee by name this is an example of JPQL with condition
		public String getEmployeeName(Integer empId) {
			EntityManager entityManager = EntityManagerUtility.getEntityManager();
			entityManager.getTransaction().begin();
			
			TypedQuery<String> query = entityManager.createQuery("Select e.employeeName from Employee e where e.employeeId=:empId",String.class);
			query.setParameter("empId", empId);
			List<String> empNames = query.getResultList();
			
			entityManager.getTransaction().commit();
			entityManager.close();
			return empNames.get(0);
		}

	public void removeEmployee(int id) {
		EntityManager entityManager = EntityManagerUtility.getEntityManager();
		Employee employee = entityManager.find(Employee.class, id);
		if(employee != null) {
			entityManager.getTransaction().begin();
		
			//Delete employee from database
			entityManager.remove(employee);
			entityManager.getTransaction().commit();
			entityManager.close();
		}

	}

	public void updateEmployee(Employee employee) {
		EntityManager entityManager = EntityManagerUtility.getEntityManager();
		entityManager.getTransaction().begin();
		//Using JPQL how to update the employee entity details
		Query  query =entityManager.createQuery("Update Employee SET employeeName=:empName where employeeId=:id");
		query.setParameter("empName", employee.getEmployeeName());
		query.setParameter("id", employee.getEmployeeId());
		
		int result = query.executeUpdate();
		System.out.println(result);
		
		
		entityManager.getTransaction().commit();
		entityManager.close();
		
	}

}
