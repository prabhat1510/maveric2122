/**
 * 
 */
package dayone.lambda;

/**
 * @author UD SYSTEMS
 *
 */
public class ThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread thread = new Thread(new SimpleRunnable());
		thread.start();

	}

}
