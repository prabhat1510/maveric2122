/**
 * 
 */
package dayone.comparator;

import java.util.Comparator;

/**
 * @author UD SYSTEMS
 *
 */
public class SortEmployeeByEmpNo implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		
		return e1.getEmpNo() - e2.getEmpNo();
	}

}
