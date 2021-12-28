/**
 * 
 */
package daytwo.streams.collector;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author UD SYSTEMS
 *
 */
public class ProductMainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Product> productList = new ArrayList<Product>();
		
		productList.add(new Product(1,"iPhone 13",100000.00));
		productList.add(new Product(2,"iPhone 13 Pro",150000.00));
		productList.add(new Product(3,"iPhone 13 Pro Max",170000.00));
		productList.add(new Product(4,"Samsung Galaxy Edge",190000.00));
		productList.add(new Product(5,"iPhone XR",45000.00));
		productList.add(new Product(6,"Samsung Galaxy A31",17000.00));
		productList.add(new Product(7,"iPhone 14",100000.00));
		productList.add(new Product(8,"iPhone 14 Pro",150000.00));
		productList.add(new Product(9,"iPhone 14 Pro Max",170000.00));
		productList.add(new Product(10,"Samsung Galaxy Edge New",190000.00));
		productList.add(new Product(11,"iPhone XR New",45000.00));
		productList.add(new Product(12,"Samsung Galaxy A31 New",17000.00));
		System.out.println(productList);
		
		Double sumOfPrices = productList.stream().collect(Collectors.summingDouble(x->x.getPrice()));
		System.out.println(sumOfPrices);
		
		Integer sumOfId = productList.stream().collect(Collectors.summingInt(x->x.getProductId()));
		System.out.println(sumOfId);
		
		Long countOfProduct = productList.stream().collect(Collectors.counting());
		System.out.println(countOfProduct);
		
		Double	averageOfPrice = productList.stream().collect(Collectors.averagingDouble(y->y.getPrice()));
		System.out.println(averageOfPrice);
		
		Optional<Product> minByValue =productList.stream().collect(Collectors.minBy(Comparator.comparing(Product::getPrice)));
		System.out.println(minByValue);
		
		Optional<Product >maxByValue =productList.stream().collect(Collectors.maxBy(Comparator.comparing(Product::getPrice)));
		System.out.println(maxByValue);
		
		Set<Double> productListSet = productList.stream().map(Product::getPrice).collect(Collectors.toSet());
		
		System.out.println(productListSet);
		
		
		
	}

}
