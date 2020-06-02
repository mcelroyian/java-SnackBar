package snackBar;

public class VendingMachine
{
	// INITIALIZE FIELDS HERE
	int maxId = 0;
	int id;
	String name;


	public VendingMachine(String name)  //CONSTRUCTOR
	{
		//SET INITIAL VALUES ON INSTATIATION HERE
		maxId++;
		id = maxId;
		this.name = name;
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
}