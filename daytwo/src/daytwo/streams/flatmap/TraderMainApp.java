/**
 * 
 */
package daytwo.streams.flatmap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author UD SYSTEMS
 *
 */
public class TraderMainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Trader> traders = new ArrayList<>();
		//Creating traders
		IntStream.range(1, 4).forEach(i->traders.add(new Trader(i)));
		System.out.println(traders.size());
		
		traders.forEach(t->
				IntStream.range(1, 6).forEach(o->t.addOrder(new Order()))
				);
		/**
		System.out.println(traders);
		for(Trader trader:traders) {
			trader.getOrders().forEach(System.out::println);
		}**/
		
		//Below code is Printing the number of Stream<List<Order>> which will equal to the number of traders
		Long totalNumberOfOrders = traders.stream().map(t->(t.getOrders())).count();
		System.out.println(totalNumberOfOrders);
	
		//Print the number of orders
		Long totalNumberOrders = traders.stream().flatMap(t->(t.getOrders().stream())).count();
		System.out.println(totalNumberOrders);
		
		traders.stream().map(t->(t.getOrders())).forEach(System.out::println);
		
		System.out.println("********************");
		traders.stream().flatMap(t->(t.getOrders().stream())).forEach(System.out::println);

	}

}
