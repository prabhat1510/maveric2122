package daythreebatch1.singleton;

public class SingletonClass {
	//Static member holds only on instance of the SingletonClass class.
	private static SingletonClass singletonClass;
	
	//making constructor private prevents the instantiation from any other class
	private SingletonClass() {
		
	}
	
	//Now we are going to provide access 
	public static SingletonClass getInstance() {
		if(singletonClass ==null) {
			singletonClass= new SingletonClass();
		}
		
		return singletonClass;
	}
}

