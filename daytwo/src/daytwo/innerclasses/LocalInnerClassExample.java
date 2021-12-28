/**
 * 
 */
package daytwo.innerclasses;

/**
 * @author UD SYSTEMS
 * A class with in the method
 */
public class LocalInnerClassExample {
	private static String msg ="Hello Every One";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LocalInnerClassExample localInnerClassExample = new LocalInnerClassExample();
		localInnerClassExample.printMessage();

	}
	
	//Local Inner Class with in the method
	void printMessage() {
		class LocalInner{
			private Integer localId;
			private String name;
			
			public Integer getLocalId() {
				return localId;
			}

			public void setLocalId(Integer localId) {
				this.localId = localId;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			void message() {
				System.out.println(msg);
			}

			@Override
			public String toString() {
				return "LocalInner [localId=" + localId + ", name=" + name + "]";
			}
			
		}
		LocalInner localInner = new LocalInner();
		localInner.message();
		localInner.setLocalId(15);
		localInner.setName("InnerClass");
		System.out.println(localInner);
	}

}
