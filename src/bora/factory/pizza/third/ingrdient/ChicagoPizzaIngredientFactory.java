package bora.factory.pizza.third.ingrdient;

import bora.factory.pizza.third.ingrdient.cheese.Cheese;
import bora.factory.pizza.third.ingrdient.cheese.MozzarellaCheese;
import bora.factory.pizza.third.ingrdient.clams.Clams;
import bora.factory.pizza.third.ingrdient.clams.FrozenClams;
import bora.factory.pizza.third.ingrdient.dough.Dough;
import bora.factory.pizza.third.ingrdient.dough.ThickCrustDough;
import bora.factory.pizza.third.ingrdient.pepperoni.Pepperoni;
import bora.factory.pizza.third.ingrdient.pepperoni.SlicedPepperoni;
import bora.factory.pizza.third.ingrdient.sauce.PlumTomatoSauce;
import bora.factory.pizza.third.ingrdient.sauce.Sauce;
import bora.factory.pizza.third.ingrdient.veggies.BlackOlives;
import bora.factory.pizza.third.ingrdient.veggies.Eggplant;
import bora.factory.pizza.third.ingrdient.veggies.Spinach;
import bora.factory.pizza.third.ingrdient.veggies.Veggies;

public class ChicagoPizzaIngredientFactory
	implements PizzaIngredientFactory
{

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	public Veggies[] createVeggies() {
		return new Veggies[] { new BlackOlives(), new Spinach(), new Eggplant() };
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FrozenClams();
	}
}
