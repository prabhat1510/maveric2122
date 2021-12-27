package dayone.functionalinterface;
/**
public interface VisualInformation {
	public void printVisualInformation();
}**/

public interface VisualInformation {
	public default void printVisualInformation() {
		System.out.println("Functional Interface is extending non functional interface which do not have any abstract method");
	}
}