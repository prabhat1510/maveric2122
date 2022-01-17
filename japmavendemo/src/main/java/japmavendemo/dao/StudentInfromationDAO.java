package japmavendemo.dao;

import japmavendemo.entities.Student;
import japmavendemo.entities.bidirectional.StudentBi;

public interface StudentInfromationDAO {
	
	public String addStudentDetails(Student student);
	public String addStudentDetailsBi(StudentBi studentBi);

}
