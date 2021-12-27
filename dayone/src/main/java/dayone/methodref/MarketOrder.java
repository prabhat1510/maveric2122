package dayone.methodref;

import java.util.Currency;

public class MarketOrder extends Order{

	public MarketOrder(String currency, double amount) {
		super(currency, amount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean match(Order order) {
		// TODO Auto-generated method stub
		return false;
	}

}
