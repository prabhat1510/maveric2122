/**
 * 
 */
package daytwo.innerclasses;

/**
 * @author UD SYSTEMS
 * 
 * Inner Classes - or Nested Class  is a class that is declared inside the class or interface
 * 
 *
 */
public class InnerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		//Instantiating the inner class
		OuterClass.InnerClass innerClass= outerClass.new InnerClass();
		innerClass.display();
		
	}

}
