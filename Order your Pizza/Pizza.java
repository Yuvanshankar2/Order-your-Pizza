import java.util.ArrayList;

public class Pizza {
	private Size size;
	private ArrayList toppings;

	/**
	 * This is the constructor method
	 * 
	 * @return
	 */

	public Pizza() {
		size = Size.MEDIUM;
		toppings = new ArrayList<Toppings>();

	}

	/**
	 * This method returns the size of the pizza that the user chose.
	 * 
	 * @return size size of the pizza
	 */
	public Size getsize() {
		return size;
	}

	/**
	 * This method is used to set the size of the pizza.
	 * 
	 * @param size size of the pizza.
	 */
	public void setSize(Size size) {
		this.size = size;
	}

	/**
	 * This method returns the price of the pizza after choosing the desired size.
	 * 
	 * @return price price of the pizza for a given size.
	 */
	public double getPrice() {
		double price;
		price = toppings.size();
		if (size == Size.SMALL)
			price += 10;
		else if (size == Size.MEDIUM)
			price += 15;
		else
			price += 20;
		return price;

	}

	/**
	 * This method adds toppings on the pizza.
	 * 
	 * @param topping topping on the pizza.
	 */
	public void addToppings(Toppings topping) {
		toppings.add(topping);

	}

	/**
	 * This method displays all the information regarding your order.
	 */
	public void display() {
		System.out.println("  SIZE: " + getsize());
		System.out.println("  TOPPING: ");
		for (int i = 0; i < toppings.size(); i++) {
			System.out.println("    " + toppings.get(i));
		}
		System.out.printf("  Item Price: $ %.2f\n", getPrice());
	}
}
