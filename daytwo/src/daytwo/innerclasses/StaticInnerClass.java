package daytwo.innerclasses;

public class StaticInnerClass {
	
	private static String currency ="INR";
	private static String capital ="New Delhi";
	
	static class InnerClass{
		private String presidentName;
		
		public String getPresidentName() {
			return presidentName;
		}
		public void setPresidentName(String presidentName) {
			this.presidentName = presidentName;
		}
		void displayCurrency() {
			System.out.println("Currency of India is --"+currency);
		}
		static void displayCapital() {
			System.out.println("Capital of India is --"+capital);
		}
		
		void displayPresidentName() {
			setPresidentName("Ram Nath Kovind");
			System.out.println(getPresidentName());
		}
	}
	
	public static void main(String args[]) {
		StaticInnerClass.InnerClass innerClassObj = new StaticInnerClass.InnerClass();
		innerClassObj.displayCurrency();
		innerClassObj.displayPresidentName();
		StaticInnerClass.InnerClass.displayCapital();
	}

}
