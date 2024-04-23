package bora.factory.pizza.third.creator;

import bora.factory.pizza.third.ingrdient.NYPizzaIngredientFactory;
import bora.factory.pizza.third.ingrdient.PizzaIngredientFactory;
import bora.factory.pizza.third.product.CheesePizza;
import bora.factory.pizza.third.product.ClamPizza;
import bora.factory.pizza.third.product.PepperoniPizza;
import bora.factory.pizza.third.product.Pizza;
import bora.factory.pizza.third.product.VeggiePizza;

public class NYPizzaStore extends PizzaStore {
 
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
 
		if (item.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
		} else if (item.equals("veggie")) {
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("New York Style Veggie Pizza");
		} else if (item.equals("clam")) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
		} else if (item.equals("pepperoni")) {
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("New York Style Pepperoni Pizza");
		}
		return pizza;
	}
}
