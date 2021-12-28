/**
 * 
 */
package daytwo.streams.collector;

import java.util.ArrayList;
import java.util.List;

/**
 * @author UD SYSTEMS
 *
 */
public class EmployeeMainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Department marketing = new Department(1,"Marketing");
		Department finance = new Department(2,"Finance");
		Department informationTech = new Department(3,"IT");
		Department operations = new Department(4,"Operations");
		
		Employee emp1 =new Employee(1,"Rakesh",marketing,15000.00);
		Employee emp2 =new Employee(2,"Rajesh",finance,15500.00);
		Employee emp3 =new Employee(3,"Ram",marketing,25000.00);
		Employee emp4 =new Employee(4,"Raja",operations,10500.00);
		Employee emp5 =new Employee(5,"Kumar",marketing,45000.00);
		Employee emp6 =new Employee(6,"Sita",finance,65500.00);
		Employee emp7 =new Employee(7,"Geeta",informationTech,35000.00);
		Employee emp8 =new Employee(8,"Neeta",operations,11500.00);
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		empList.add(emp6);
		empList.add(emp7);
		empList.add(emp8);
		
		
	}

}
