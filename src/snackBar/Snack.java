package snackBar;

public class Snack
{

	private static int maxId = 0;
	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int machineId;


	public Snack(String name, int quantity, double cost, int machineId)
	{
		maxId++;
		id = maxId;
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.machineId = machineId;
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

	public int getQuantity()
	{
		return quantity;
	}

	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}

	public double getCost()
	{
		return cost;
	}

	public void setCost(double cost)
	{
		this.cost = cost;
	}

	public int getMachineId()
	{
		return machineId;
	}

	public void setMachineId(int machineId)
	{
		this.machineId = machineId;
	}

	// add quanitity
	public void addQuantity(int quantity)
	{
		this.quantity += quantity;
	}

	//buy snack
	public double buySnacks(int quantity)
	{
		this.quantity -= quantity;
		return getTotal(quantity);
	}

	public double getTotal(int quantity)
	{
		return  cost * quantity;
	}

}