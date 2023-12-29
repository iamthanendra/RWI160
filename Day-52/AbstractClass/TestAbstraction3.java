abstract class Bike
{
	Bike() //This is default constructor
	{
		System.out.println("Bike is Created");
	}
	abstract void run();
	void changeGear()
	{
		System.out.println("Gear Changed");
	}
}

class Honda extends Bike
{
	void run()
	{
		System.out.println("running safely...");
	}
}

class TestAbstraction3
{
	public static void main(String[] args)
	{
		Honda ob = new Honda(); //Upcasting
		ob.run();
		ob.changeGear();
	}
}