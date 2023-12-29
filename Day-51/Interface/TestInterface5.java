//Interface Inheritance
interface Printables
{
	public void print();
}

interface Showables extends Printables
{
	public void show();
}

//class TestInterface5 implements Printabl, Showables
class TestInterface5 implements Showables
{
	public void print()
	{
		System.out.println("Print...");
	}

	public void show()
	{
		System.out.println("Show...");
	}

	public static void main(String[] args)
	{
		TestInterface5 ob = new TestInterface5();
		ob.print();
		ob.show();

		//Printables ob1 = new TestInterface5();
		//ob1.print();
		//ob1.show(); //Error

		//Showables ob2 = new TestInterFace5();
		//ob1.print();
		//ob1.show();
	}
}