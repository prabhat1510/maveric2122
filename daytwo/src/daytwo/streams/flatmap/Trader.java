/**
 * 
 */
package daytwo.streams.flatmap;

import java.util.ArrayList;
import java.util.List;

/**
 * @author UD SYSTEMS
 *
 */
public class Trader {
	private Integer traderId;
	private List<Order> orders = new ArrayList<>();
	
	public Trader(Integer traderId) {
		this.traderId = traderId;
	}
	public Integer getTraderId() {
		return traderId;
	}
	public void setTraderId(Integer traderId) {
		this.traderId = traderId;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void addOrder(Order order) {
		orders.add(order);
	}
	

}
