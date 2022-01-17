package japmavendemo.app;

import javax.persistence.EntityManager;

import japmavendemo.entities.onetomany.Department;
import japmavendemo.entities.onetomany.Employees;
import japmavendemo.utility.EntityManagerUtility;

public class EmployeeInfoMainApp {

	public static void main(String[] args) {
		
		Department department = new Department();
		department.setId(1);
		department.setName("Marketing");
		Employees employee = new Employees();
		employee.setId(2);
		employee.setName("Rajeev Khanna");
		employee.setDepartment(department);
		
		Employees emp = new Employees();
		emp.setId(3);
		emp.setName("Dimple Khanna");
		emp.setDepartment(department);
		EntityManager entityManager = EntityManagerUtility.getEntityManager();
		entityManager.getTransaction().begin();
		
		entityManager.persist(employee);
		entityManager.persist(emp);
		entityManager.getTransaction().commit();
		entityManager.close();

	}

}
