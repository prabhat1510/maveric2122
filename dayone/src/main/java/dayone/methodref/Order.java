package dayone.methodref;

import java.util.Currency;

public class Order {
	
	//private Currency currency;
	//private Side side;
	private String currency;
	private double amount;
	
	
	
	public Order(String currency, double amount) {
		this.currency = currency;
		this.amount = amount;
	}
	
	
	public boolean match(Order order) {
		return true;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}


	@Override
	public String toString() {
		return "Order [currency=" + currency + ", amount=" + amount + "]";
	}
	

	public static void displayCurrency() {
		System.out.println("Static Method Display Currency");
	}

}
