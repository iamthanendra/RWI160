abstract class Bike
{
	abstract void run();
}

class Honda1 extends Bike
{
	void run()
	{
		System.out.println("running safely");
	}

	public static void main(String[] args)
	{
		//Bike ob = new Bike(); //Error Bcoz Bike is abstract class
		Bike ob1 = new Honda1(); //Upcasting
		ob1.run();
		Honda1 ob2 = new Honda1();
		ob2.run();
	}
}