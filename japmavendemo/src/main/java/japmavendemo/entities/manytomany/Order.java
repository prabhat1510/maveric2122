package japmavendemo.entities.manytomany;



import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="order_master")
public class Order {
	@Id
	private Integer orderId;
	private Date purchaseDate;
	
	@ManyToMany(cascade =CascadeType.ALL)
	/**
	 * Columns orderId and productId implicitly be composite primary key of the join table
	 */
	@JoinTable(name="product_orders", joinColumns= { @JoinColumn(name="orderId")},
										inverseJoinColumns = {@JoinColumn(name="productId")})
	private Set<Product> products;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	
}
