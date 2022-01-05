package daythreebatch1.builder;

public class IndianTandooriPizzaBuilder extends PizzaBuilder {

	@Override
	public void buildDough() {
		pizza.setDough("Atta");
		
	}

	@Override
	public void buildSauce() {
		pizza.setSauce("Tandoori");
		
	}

	@Override
	public void buildTopping() {
		pizza.setTopping("Paneer");
		
	}

}
