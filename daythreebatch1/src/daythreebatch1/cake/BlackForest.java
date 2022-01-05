package daythreebatch1.cake;

public class BlackForest extends Cake {

	public BlackForest() {
		setName("BlueBerry");
		setType("Eggless");
		setPrice(800);
	}
	@Override
	public void recipe() {
		System.out.println("------------BlueBerry Recipe---------");
		System.out.println("Sieve together Maida and Cocoa Powder");
		System.out.println("Add Milk and Vanilla essence");
		System.out.println("Top with Whipped Cream and Cherries");
		System.out.println("Chill and Serve");
		
	}

	@Override
	public void myFans() {
	System.out.println("Both adults and kids love me");
		
	}

}
