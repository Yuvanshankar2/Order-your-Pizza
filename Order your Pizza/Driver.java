import java.util.Scanner;

public class Driver {
	/**
	 * This is the main method that acts as the menu for the entire pizza order.
	 * 
	 * @param args Not used.
	 */
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		char ch1;
		char ch;
		char ch2;
		char ch3;
		PizzaOrder order = new PizzaOrder();
		VeggieLoversPizza veg;
		MeatLoversPizza nonveg;
		/*
		 * This do while loop helps the user in taking multiple orders.
		 */
		do {
			System.out.println("-------------");
			System.out.println("MAIN MENU:");
			System.out.println("   (O)rder  a pizza");
			System.out.println("   (S)pecials list");
			System.out.println("   (R)eceipt display  a Pizza");
			System.out.println("   (Q)uit");
			System.out.print("Enter choice: ");
			String choice = keyboard.nextLine();
			ch = choice.charAt(0);
			System.out.println("-------------");

			if (ch == 'O') {

				Pizza pizza = new Pizza();
				do {
					System.out.println("-------------");
					System.out.println("SELCT PIZZA SIZE: ");
					System.out.println("   (S)mall");
					System.out.println("   (M)edium");
					System.out.println("   (L)arge");
					System.out.print("Enter choice: ");
					choice = keyboard.nextLine();
					ch1 = choice.charAt(0);
					if (ch1 == 'S')
						pizza.setSize(Size.SMALL);
					else if (ch1 == 'M')
						pizza.setSize(Size.MEDIUM);
					else if (ch1 == 'L')
						pizza.setSize(Size.LARGE);
					else
						System.out.println("Invalid selection - Please select a valid menu option");

				} while (ch1 != 'S' && ch1 != 'M' && ch1 != 'L');

				do {
					System.out.println("-------------");
					System.out.println("SELECT TOPPINGS: ");
					System.out.println("   (P)epperoni");
					System.out.println("   (S)ausage");
					System.out.println("   (O)nions");
					System.out.println("   (B)ell peppers");
					System.out.println("   (D)one - no more toppings to add");
					System.out.print("Enter choice: ");
					choice = keyboard.nextLine();
					ch2 = choice.charAt(0);
					if (ch2 == 'P')
						pizza.addToppings(Toppings.PEPPERONI);
					else if (ch2 == 'S')
						pizza.addToppings(Toppings.SAUSAGE);
					else if (ch2 == 'O')
						pizza.addToppings(Toppings.ONIONS);
					else if (ch2 == 'B')
						pizza.addToppings(Toppings.PEPPERS);
					else if (ch2 == 'D') {
						break;
					}

					else
						System.out.println("Invalid selection - Please select a valid menu option");

				} while (ch2 != 'D');
				order.addPizza(pizza);

			} else if (ch == 'S') {
				do {
					System.out.println("-------------");
					System.out.println("SELECT SPECIALS: ");
					System.out.println("   (V)eggie Lovers Pizza");
					System.out.println("   (M)eat Lovers Pizza");
					System.out.println("   (B)ack to main menu");
					System.out.print("Enter choice: ");
					choice = keyboard.nextLine();
					ch3 = choice.charAt(0);
					if (ch3 == 'V') {
						veg = new VeggieLoversPizza();
						order.addPizza(veg);
					} else if (ch3 == 'M') {
						nonveg = new MeatLoversPizza();
						order.addPizza(nonveg);
					} else if (ch3 == 'B')
						break;
					else
						System.out.println("Invalid selection - Please select a valid menu option");
				} while (ch3 != 'V' && ch3 != 'M');
			}

			else if (ch == 'R') {

				order.display();
			} else if (ch == 'Q')
				System.out.println("Exiting Program......");
			else
				System.out.println("Invalid selection - Please select a valid menu option");

		} while (ch != 'Q');

	}

}
