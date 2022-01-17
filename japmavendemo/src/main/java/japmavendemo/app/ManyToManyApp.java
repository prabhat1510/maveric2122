package japmavendemo.app;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;

import japmavendemo.entities.manytomany.Order;
import japmavendemo.entities.manytomany.Product;
import japmavendemo.utility.EntityManagerUtility;

public class ManyToManyApp {

	public static void main(String[] args) {
		
		Order o1 = new Order();
		o1.setOrderId(1);
		o1.setPurchaseDate(new Date());
		Order o2 = new Order();
		o2.setOrderId(2);
		o2.setPurchaseDate(new Date());
		
		Product p1 = new Product();
		p1.setProductId(11);
		p1.setName("iPhone 13 Pro Max");
		
		Product p2 = new Product();
		p2.setProductId(12);
		p2.setName("Samsung Galaxy S21");
		
		Set<Product> productSet1 = new HashSet();
		productSet1.add(p1);
		productSet1.add(p2);
		o1.setProducts(productSet1);
		
		Set<Product> productSet2 = new HashSet();
		productSet2.add(p1);
		productSet2.add(p2);
		o2.setProducts(productSet2);
		
		EntityManager entityManager = EntityManagerUtility.getEntityManager();
		entityManager.getTransaction().begin();
		
		entityManager.persist(o1);
		entityManager.persist(o2);
		entityManager.getTransaction().commit();
		entityManager.close();

	}

}
