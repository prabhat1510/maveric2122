/**
 * 
 */
package dayone.methodref;

import java.util.Currency;

/**
 * @author UD SYSTEMS
 *
 */
public class LimitOrder extends Order{

	public LimitOrder(String currency, double amount) {
		super(currency, amount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean match(Order order) {
		// TODO Auto-generated method stub
		return false;
	}

}
