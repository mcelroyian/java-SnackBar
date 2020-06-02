package snackBar;

public class Customer
{

	int maxId = 0;
	int id;
	String name;
	double cashOnHand;

	public Customer(String name, double cashOnHand)
	{
		id = ++maxId;
		this.name = name;
		this.cashOnHand = cashOnHand;
	}

	public int getId()
	{
		return id;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public double getCashOnHand()
	{
		return cashOnHand;
	}

	public void addCashOnHand(double cashOnHand)
	{
		this.cashOnHand += cashOnHand;
	}

	public void buySnacks(double cost)
	{
		cashOnHand -= cost;
	}
}