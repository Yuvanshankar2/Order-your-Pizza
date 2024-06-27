
public class MeatLoversPizza extends Pizza {
	/**
	 * This is the constructor method
	 */
	public MeatLoversPizza() {
		super();
		super.setSize(Size.LARGE);
		super.addToppings(Toppings.PEPPERONI);
		super.addToppings(Toppings.SAUSAGE);

	}

	/**
	 * This method adds two specific toppings (peperroni,sausage) on the pizza.
	 * 
	 * @param t The particular topping to be added.
	 */
	public void addTopping(Toppings t) {
		System.out.println("ERROR: You cannot add extra toppings to your meatlover pizza");
	}

	/**
	 * This method returns the fixed price of the meat lovers pizza.
	 * 
	 * @return cost Fixed price of this pizza.
	 */
	public double getPrice() {
		return 18;
	}

	/**
	 * This method displays all the information regarding this pizza.
	 */
	public void display() {
		System.out.println("Meat Lovers Special");
		super.display();
	}

}
