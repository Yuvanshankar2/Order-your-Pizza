import java.util.ArrayList;

public class PizzaOrder {
	private ArrayList<Pizza> pizzas;
	private double taxrate = 0.08;

	/**
	 * This is the constructor method.
	 */
	public PizzaOrder() {
		pizzas = new ArrayList<Pizza>();
	}

	/**
	 * This method returns the total price of all the pizzas ordered.
	 * 
	 * @return sum sum of all the individual pizza prices.
	 */
	public double getPrice() {
		double sum = 0.0;
		for (int i = 0; i < pizzas.size(); i++) {
			sum += pizzas.get(i).getPrice();

		}
		return sum;
	}

	/**
	 * This method adds the number of pizzas to the order list.
	 * 
	 * @param food An individual pizza.
	 */
	public void addPizza(Pizza food) {
		pizzas.add(food);
	}

	/**
	 * This method displays all the information about the pizza order.
	 */
	public void display() {
		System.out.println("-----------------------------");
		System.out.println("     ORDER RECIEPT           ");
		System.out.println("-----------------------------");
		for (int i = 0; i < pizzas.size(); i++) {
			pizzas.get(i).display();
			System.out.println("--------------------------");
		}
		double total = getPrice();
		System.out.println("SUBTOTAL: $" + total);
		double tax = taxrate * total;
		System.out.println("TAX: $" + tax);
		System.out.printf("TOTAL: $ %.2f\n", (total + tax));
	}
}
