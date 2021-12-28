/**
 * 
 */
package daytwo.streams.collector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
		Employee emp4 =new Employee(4,"Raja",operations,15500.00);
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
		
		Map<Department,List<Employee>> groupedEmployee =empList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		System.out.println(groupedEmployee);
		
		Map<Double,List<Employee>> groupedEmployeBySalary = empList.stream().collect(Collectors.groupingBy(Employee::getSalary));
		System.out.println(groupedEmployeBySalary);
		
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> oddsquares = numbers.stream().filter(n->{
															System.out.println("filtering "+n); 
															return n%2 !=0;})
													.map(n->{
															System.out.println("mapping "+n); 
															return n*n;})
													.limit(3)
													.collect(Collectors.toList());
		
		System.out.println(oddsquares);
		List<Integer> number = Arrays.asList(2,2,2,2,2,2,2,2,2,2);
		System.out.println(number.stream().allMatch(x->x==5));
		System.out.println(number.stream().anyMatch(x->x>2));
		System.out.println(number.stream().allMatch(x->x==2));
		System.out.println(number.stream().noneMatch(x->x>2));
		List<String> currencies = Arrays.asList("USD","INR","HKD","AUD","PESO");
		System.out.println(currencies.stream().anyMatch(x->x.equals("EUR")));
		
		DoubleSummaryStatistics summaryStats = empList.stream().collect(Collectors.summarizingDouble(e->e.getSalary()));
		System.out.println(summaryStats);
	}

}
