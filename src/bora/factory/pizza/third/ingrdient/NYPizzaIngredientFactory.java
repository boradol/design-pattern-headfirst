package bora.factory.pizza.third.ingrdient;

import bora.factory.pizza.third.ingrdient.cheese.Cheese;
import bora.factory.pizza.third.ingrdient.cheese.ReggianoCheese;
import bora.factory.pizza.third.ingrdient.clams.Clams;
import bora.factory.pizza.third.ingrdient.clams.FreshClams;
import bora.factory.pizza.third.ingrdient.dough.Dough;
import bora.factory.pizza.third.ingrdient.dough.ThinCrustDough;
import bora.factory.pizza.third.ingrdient.pepperoni.Pepperoni;
import bora.factory.pizza.third.ingrdient.pepperoni.SlicedPepperoni;
import bora.factory.pizza.third.ingrdient.sauce.MarinaraSauce;
import bora.factory.pizza.third.ingrdient.sauce.Sauce;
import bora.factory.pizza.third.ingrdient.veggies.Garlic;
import bora.factory.pizza.third.ingrdient.veggies.Mushroom;
import bora.factory.pizza.third.ingrdient.veggies.Onion;
import bora.factory.pizza.third.ingrdient.veggies.RedPepper;
import bora.factory.pizza.third.ingrdient.veggies.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
 
	public Dough createDough() {
		return new ThinCrustDough();
	}
 
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
 
	public Cheese createCheese() {
		return new ReggianoCheese();
	}
 
	public Veggies[] createVeggies() {
		return new Veggies[] { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
	}
 
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FreshClams();
	}
}
