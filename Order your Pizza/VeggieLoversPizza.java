
public class VeggieLoversPizza extends Pizza {
	public VeggieLoversPizza() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * This is the constructor method
	 */
	public VeggieLoversPizza1() {
		super();
		super.setSize(Size.LARGE);
		super.addToppings(Toppings.ONIONS);
		super.addToppings(Toppings.PEPPERS);

	}

	/**
	 * This method adds only two specific toppings (onions,peppers) and does not
	 * accept anything else.
	 * 
	 * @param t The toppings to be added.
	 */
	public void addTopping(Toppings t) {
		System.out.println("ERROR: You cannot add any other toppings to a veggie lover pizza");

	}

	/**
	 * This method sets a particular size to the pizza (Large) and does not accept
	 * anything else.
	 */
	public void setSize(Size s) {
		System.out.println("ERROR: You cannot set any other size for a veggie lover pizza");

	}

	/**
	 * This method returns the fixed price of the veggie lovers pizza.
	 * 
	 * @return cost Fixed price of this pizza.
	 */
	public double getPrice() {
		double cost = 17.0;
		return cost;
	}

	/**
	 * This method displays all the information regarding this pizza.
	 */
	public void display() {
		System.out.println("Veggie Lovers Special");
		super.display();
	}

}
