/**
 * 
 */
package dayone.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author UD SYSTEMS
 *
 */
public class CurrencyExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> currencies = Arrays.asList("USD","JPY","EUR","HKD","INR","AUD");
		System.out.println("Unsorted currencies ---"+currencies);
		//Using lambda expression sort these currencies
		/**
		Collections.sort(currencies,(String a,String b)->{return a.compareTo(b);});
		System.out.println(currencies);
		 **/
		
		Collections.sort(currencies,(a,b)->{return a.compareTo(b);});
		System.out.println(currencies);
		
		System.out.println("***********************************");
		for(String currency:currencies)
			System.out.println(currency);
		
		System.out.println("******************forEach*****************");
		currencies.forEach(c->System.out.println(c));
		
		currencies.forEach((String currency)->System.out.printf("Currency is %s"+"-",currency));
		
		System.out.println("***********************************");
		Add addition = (a,b)->(a+b);
		System.out.println(addition.add(15, 10));
	
	}

}
