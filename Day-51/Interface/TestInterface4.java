//Hybrid Interface Example
interface A
{
	public void display();
}

interface B extends A
{
	public void display();
}

interface C extends A
{
	public void display();
}

interface D extends B,C
{
	public void display();
}

class TestInterface4 implements D
{
	public void display()
	{
		System.out.println("Hybrid Inheritance Successsfully Worked");
	}

	public static void main(String[] args)
	{
		TestInterface4 ob = new TestInterface4();
		ob.display();
	}
}