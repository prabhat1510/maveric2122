package dayone.streamsexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

import dayone.methodref.Order;

public class StreamsExample {

	public static void main(String[] args) {
		List<Integer> listOfNumbers = Arrays.asList(15,11,10,9,12,13,2,5,8,1,7,6,4,14,16);
		
		listOfNumbers.stream() //source of stream
					 .filter(num->num>3)//operation
					 .limit(5)// restricting stream processing for the first 5 elements
					 .forEach(System.out::println);
		System.out.println("********************");
		listOfNumbers.stream() //source of stream
		 .filter(num->num>5)//operation
		 .skip(5)// stream processing skipped for the first 5 elements
		 .forEach(System.out::println);
		
		System.out.println("***********Sort*********");
		listOfNumbers.stream() //source of stream
		 .sorted()//operation // By default, it returns stream items in natural order
		 .forEach(System.out::println);
		
		
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
	
		orderList.stream()
				 .filter(o->o.getAmount()>5000)
				 .sorted(Comparator.comparing(Order::getAmount))
				 .forEach(System.out::println);
		System.out.println("***********Example of map() function ***********************");
		orderList.stream()
				 .filter(o->o.getCurrency().equals("EUR"))
				 .map(Order::getAmount)
				 .forEach(System.out::println);
	
		
		//Generating Results from Streams - reduce() 
		double total = listOfNumbers.stream().filter(n->n>10)
											  .reduce(0, (a,b)->a+b);
		
		System.out.println(total);
		
		//Order Amount
		double totalAmount =orderList.stream()
				 .filter(o->o.getCurrency().equals("EUR"))
				 .map(Order::getAmount)
				 .reduce(0.0, (x,y)->x+y);
		System.out.println(totalAmount);
		
		//Other Terminal Functions -- min(),max(),count()
		double countOfFilteredNumber=listOfNumbers.stream().filter(n->n>10).count();
		System.out.println(countOfFilteredNumber);
		
		System.out.println("************min*********************");
		System.out.println(orderList.stream().filter(o->o.getCurrency().equals("EUR")).min(Comparator.comparing(Order::getAmount)));
		System.out.println("************max*********************");
		System.out.println(orderList.stream().filter(o->o.getCurrency().equals("EUR")).max(Comparator.comparing(Order::getAmount)));
		
		IntStream.range(1, 11).forEach(System.out::println);
	}

}
