/**
 * 
 */
package dayone.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
		List<Employee> empList = new ArrayList<Employee>();
		
		empList.add(new Employee(111, "Hitha"));
		empList.add(new Employee(132, "Sagar"));
		empList.add(new Employee(121, "Rakesh"));
		empList.add(new Employee(101, "Sneha"));
		empList.add(new Employee(131, "Shahnawaz"));

		// Unsorted
		System.out.println(empList);
		Collections.sort(empList, new SortByEmployeeByEmpName());
		System.out.println(empList);

		Collections.sort(empList, new SortEmployeeByEmpNo());
		System.out.println(empList);
		System.out.println("******************************************");
		// Collections.reverseOrder(empList,SortEmployeeByEmpNo.class);
		//Collections.sort(empList, Collections.reverseOrder());
		
		List<String> empList=Arrays.asList();
	}

}
