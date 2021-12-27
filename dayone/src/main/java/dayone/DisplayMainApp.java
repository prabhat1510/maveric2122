/**
 * 
 */
package dayone;

/**
 * @author UD SYSTEMS
 *
 */
public class DisplayMainApp {
	
	//private static String greetings= "Good Morning";

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
		System.out.println(GreetingsDisplay.greetings);
		
		DisplayMessage.printMessage("Sagar"); // calling static method
		
		DisplayMessage dispMessage = new DisplayMessageImpl();
		dispMessage.printMsg();
				
		
	}

}
