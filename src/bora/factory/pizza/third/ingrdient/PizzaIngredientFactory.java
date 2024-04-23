package bora.factory.pizza.third.ingrdient;

import bora.factory.pizza.third.ingrdient.cheese.Cheese;
import bora.factory.pizza.third.ingrdient.clams.Clams;
import bora.factory.pizza.third.ingrdient.dough.Dough;
import bora.factory.pizza.third.ingrdient.pepperoni.Pepperoni;
import bora.factory.pizza.third.ingrdient.sauce.Sauce;
import bora.factory.pizza.third.ingrdient.veggies.Veggies;

public interface PizzaIngredientFactory {
 
	Dough createDough();
	Sauce createSauce();
	Cheese createCheese();
	Veggies[] createVeggies();
	Pepperoni createPepperoni();
	Clams createClam();
 
}
