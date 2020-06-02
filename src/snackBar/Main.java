package snackBar;

public class Main
{
	public static void main(String[] args)
	{
		//DO PROGROM STUFF HERE
		Customer jane = new Customer("Jane", 45.25);
		Customer bob = new Customer("Bob", 33.14);

		VendingMachine food = new VendingMachine("Food");
		VendingMachine drink = new VendingMachine("Drink");
		VendingMachine office = new VendingMachine("Office");

		//String name, int quanitity, double cost, int machineId)
		Snack chips = new Snack("Chips", 36, 1.75, food.getId());
		Snack chocBar = new Snack("Chocolate Bar", 36, 1.00, food.getId());
		Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());

		Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
		Snack water = new Snack("Water", 20, 2.75, drink.getId());

		jane.buySnacks(soda.buySnacks(3));
		System.out.println("Jane's Cash: " + jane.getCashOnHand());
		System.out.println("Remaining " + soda.getName() + "'s: " + soda.getQuantity());

		jane.buySnacks(pretzel.buySnacks(1));
		System.out.println("Jane's Cash: " + jane.getCashOnHand());
		System.out.println("Remaining " + pretzel.getName() + "'s: " + pretzel.getQuantity());

		bob.buySnacks(soda.buySnacks(2));
		System.out.println("Bob's Cash " + bob.getCashOnHand());
		System.out.println("Remaining " + soda.getName() + "'s: " + soda.getQuantity());

		jane.addCashOnHand(10);
		System.out.println("Jane's Cash: " + jane.getCashOnHand());

		jane.buySnacks(chocBar.buySnacks(1));
		System.out.println("Jane's Cash: " + jane.getCashOnHand());
		System.out.println("Remaining " + chocBar.getName() + "'s: " + chocBar.getQuantity());

		pretzel.addQuantity(12);
		System.out.println("Remaining " + pretzel.getName() + "'s: " + pretzel.getQuantity());

		bob.buySnacks(pretzel.buySnacks(3));
		System.out.println("Bob's Cash " + bob.getCashOnHand());
		System.out.println("Remaining " + pretzel.getName() + "'s: " + pretzel.getQuantity());

	}

}