/**
 * 
 */
package daytwo.streams.collector;

/**
 * @author UD SYSTEMS
 *
 */
public class Product {
	
	private Integer productId;
	private String productName;
	private Double price;
	
	
	//Parameterized Constructors
	public Product(Integer productId, String productName, Double price) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	
	//Getters and Setters Method
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + "]";
	}
	
	

}
