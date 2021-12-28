package daytwo.innerclasses;

public class AnonymousInnerClassExample {
	/**
	 * 
	 * Anonymous inner class is an inner class without a name and for which only a single object is created.
	 * 1. Class(may be abstract or concrete).
	 * 2. Interface
	 */
	public static void main(String[] args) {
		//Implementation if Anonymous Inner Class using abstract class
			Student student = new Student() {
				void study() {
					System.out.println("I am studying inner classess");
				}
			};
			student.study();
			
		//Using Interface
			/**
			 * A class is created, but its name is decided by the compiler, which implements the DisplayInterface and provides the implementation of display and isDisplayed method.
			 * An object of the Anonymous class is create that is referred to by 'di', a reference variable of the DisplayInterface type
			 */
			DisplayInterface di = new DisplayInterface() {
				
				@Override
				public boolean isDisplayed() {
					return false;
				}
				
				@Override
				public void display() {
					System.out.println("Many one of you knows Inner Class");
					
				}
			};
			
			di.display();
			System.out.println(di.isDisplayed());
	}

}

//Implementation of Anonymous Inner Class using Interface
interface DisplayInterface{
	void display();
	boolean isDisplayed();
}
