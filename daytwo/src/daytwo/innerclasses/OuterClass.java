/**
 * 
 */
package daytwo.innerclasses;

/**
 * @author UD SYSTEMS
 *
 */
public class OuterClass {
	
	private Integer id;
	private String message;
	
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	class InnerClass{
		void display() {
			setMessage("Hello EveryOne Hope you are able to understand Inner classes");
			System.out.println(getMessage());
			System.out.println(message+"Second time printing");
		}
	}

}
