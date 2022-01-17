package japmavendemo.dao;

import javax.persistence.EntityManager;

import japmavendemo.entities.onetomany.Employees;
import japmavendemo.utility.EntityManagerUtility;

public class EmployeeInfoDAOImpl implements EmployeeInfoDAO {

	public String addEmployeeInfoDetails(Employees employee) {
		EntityManager entityManager = EntityManagerUtility.getEntityManager();
		entityManager.getTransaction().begin();
		
		entityManager.persist(employee);
		
		entityManager.getTransaction().commit();
		entityManager.close();
		return "Employee Info added";
	}

}
