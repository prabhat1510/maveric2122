package japmavendemo.dao;

import javax.persistence.EntityManager;

import japmavendemo.entities.Student;
import japmavendemo.utility.EntityManagerUtility;

public class StudentInformationDAOImpl implements StudentInfromationDAO {

	public String addStudentDetails(Student student) {
		EntityManager entityManager = EntityManagerUtility.getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(student);
		
		
		entityManager.getTransaction().commit();
		entityManager.close();
		return "Student details added successfully";
	}

}
