package dayone;

public interface DisplayMessage {
	
	public void displayMsg();
	
	public void displayMessage(String message);
	
	public default void printMsg() {
		System.out.println("Hello I am default method");
	}

}
