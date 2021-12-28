/**
 * 
 */
package daytwo.streams.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

import daytwo.streams.collector.Department;
import daytwo.streams.collector.Employee;



/**
 * @author UD SYSTEMS
 *
 */
public class OptionalExample {

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
		Employee emp9 = new Employee(9,"Rita",null,1500.00);
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		empList.add(emp6);
		empList.add(emp7);
		empList.add(emp8);
		empList.add(emp9);
		
		empList.forEach(System.out::println);
		
		for(Employee employee : empList) {
			//ofNullable is allowing the null value as a parameter
			Optional<Department> department =Optional.ofNullable(employee.getDepartment());
			
			//Value is present or not in the department
			if(department.isPresent()) {
				System.out.println(department.get());
			}else {
				System.out.println("Department not assigned to this employee");
				employee.setDepartment(department.orElse(operations));
				System.out.println(employee);
			}
			
		}
		
		
		for(Employee emp :empList) {
			Optional<Department> department =Optional.ofNullable(emp.getDepartment());
			System.out.println("**********************************");
			department.ifPresent(System.out::println);
		}
		
		
		Optional<Employee> employee= empList.stream().filter(e->e.getSalary()>45000).findAny();
		System.out.println(employee);
		
		
		Optional<Employee> emp= empList.stream().filter(e->e.getSalary()>75000).findAny();
		emp.ifPresent(System.out::println);
		
		
		//Reusing the streams
		Stream<String> stream = Stream.of("a","b","c","d","e").filter(s->s.startsWith("a"));
		stream.anyMatch(s->s.startsWith("a"));
		//Below one will throw an exception - stream has already been operated upon or closed
		//stream.noneMatch(s->s.startsWith("b"));
		
		
		/**
		Supplier<Stream<String>> streamSupplier =Stream.of("a","b","c","d","e").filter(s->s.startsWith("a"));
		streamSupplier.anyMatch(s->s.startsWith("a"));
		streamSupplier.noneMatch(s->s.startsWith("b"));
		**/
		List<String> strList= new ArrayList<String>();
		strList.add("a");
		strList.add("b");
		strList.add("c");
		strList.add("d");
		strList.add("e");
		strList.add("f");
		
		/**TODO Need to come back again on this Supplier example or resuing the Stream
		Supplier<Stream<String>> streamSupplier =strList.stream().filter(s->s.startsWith("a")).;
		System.out.println(streamSupplier.get().anyMatch(s->s.startsWith("a")));
		**/
		
	}
	
}
