//Multiple Inheritance Example
interface Printables
{
	public void print();
}

interface Showables
{
	public void print();
}

class TestInterface3 implements Printables, Showables
{
	public void print()
	{
		System.out.println("Hello");
	}
	public static void main(String[] args)
	{
		TestInterface3 obj = new TestInterface3();
		obj.print();
	}
}