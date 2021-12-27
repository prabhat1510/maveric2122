/**
 * 
 */
package dayone.methodref;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author UD SYSTEMS
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order orderOne = new Order("AUD", 15000);
		Order orderTwo = new Order("INR", 5000);
		Order orderThree = new Order("USD", 150000);
		Order orderFour = new Order("EUR", 25000);
		Order orderFive = new Order("AUD", 8000);
		Order orderSix = new Order("EUR", 5000);
		
		List<Order> orderList = new ArrayList<Order>();
		orderList.add(orderOne);
		orderList.add(orderTwo);
		orderList.add(orderThree);
		orderList.add(orderFour);
		orderList.add(orderFive);
		orderList.add(orderSix);
		
		
		//getAmount method reference of Order is passed to Comparator comapring method
		Collections.sort(orderList,Comparator.comparing(Order::getAmount));
		orderList.forEach(System.out::println);
		
		//Static method reference example
		DisplayInformation displ = Order::displayCurrency;
		displ.display();
		
		//Reference to instance method
		DisplayInformation displayInfo=orderOne::displayAmount;
		displayInfo.display();
		
		//Reference to constructor  
		OrderAmount orderAmount = Order::new;
		System.out.println(orderAmount.getOrderAmount(150000));
		
	}

}
