package japmavendemo.entities.manytomany;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
/**
 * Product is the inverse entity
 * inverse entity maps to owning entity by using mappedBy element
 * @author UD SYSTEMS
 *
 */
@Entity
@Table(name="product_master")
public class Product {
	@Id
	private Integer productId;
	private String name;
	@ManyToMany(mappedBy ="products")
	private Set<Order> orders;
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Order> getOrders() {
		return orders;
	}
	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}

}
