/**
 * 
 */
package dayone;

/**
 * @author UD SYSTEMS
 *
 */
public class DisplayMessageImpl implements DisplayMessage {

	public void displayMsg() {
		System.out.println("Hello Good Morning Everyone");

	}

	@Override
	public void displayMessage(String message) {
		System.out.println("Hello "+message);
		
	}

}
