package daythreebatch1.builder;

public class PizzaBuilderDemo {

	public static void main(String[] args) {
		Waiter waiter = new Waiter();
		PizzaBuilder italianPizzaBuilder = new ItalianPizzaBuilder();
		PizzaBuilder nykPizzaBuilder = new NYKPizzaBuilder();
		waiter.setPizzaBuilder(nykPizzaBuilder);
		waiter.constructPizza();
		
		
		Pizza pizza = waiter.getPizza();
		System.out.println(pizza.getDough());
		System.out.println(pizza.getSauce());
		System.out.println(pizza.getTopping());
		
		PizzaBuilder tandooriPizza = new IndianTandooriPizzaBuilder();
		waiter.setPizzaBuilder(tandooriPizza);
		waiter.constructPizza();
		
		Pizza tandooriPaneer = waiter.getPizza();
		System.out.println(tandooriPaneer.getDough());
		System.out.println(tandooriPaneer.getSauce());
		System.out.println(tandooriPaneer.getTopping());
	}

}
