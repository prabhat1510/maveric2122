/**
 * 
 */
package daythreebatch1.solid.ocp;

/**
 * @author UD SYSTEMS
 *
 */
public class AreaMainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square square = new Square();
		square.setSide(10.0);
		square.calculateArea();
		
		Rectangle rectangle = new Rectangle();
		rectangle.setLength(15.0);
		rectangle.setWidth(16.0);
		rectangle.calculateArea();

	}

}
