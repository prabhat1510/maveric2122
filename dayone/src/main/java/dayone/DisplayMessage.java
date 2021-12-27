package dayone;

public interface DisplayMessage {
	
	public void displayMsg();
	
	public void displayMessage(String message);
	
	//default method
	public default void printMsg() {
		System.out.println("Hello I am default method");
	}

	//static method
	public static void printMessage(String name) {
		System.out.println("Hello Good Morning "+name+" I am static method");
	}
	
}
