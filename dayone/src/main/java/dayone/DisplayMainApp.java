/**
 * 
 */
package dayone;

/**
 * @author UD SYSTEMS
 *
 */
public class DisplayMainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DisplayMessage displayMessage = new DisplayMessageImpl(); // Creating an Object
		displayMessage.displayMsg(); // Calling the method
		
		DisplayMessage greetingsDisplay = new GreetingsDisplay();
		greetingsDisplay.displayMsg();

		
		displayMessage.printMsg();// Calling default method
		displayMessage.displayMessage("Rakesh"); // Calling an abstract method
	}

}
