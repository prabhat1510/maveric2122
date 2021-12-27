/**
 * 
 */
package dayone.lambda;

/**
 * @author UD SYSTEMS
 *
 */
public class ThreadUsingLambadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Thread(()->{ System.out.println("I am new thread using lambda");
			             System.out.println("I am new thread using lambda");
		}
				).start();

	}

}
