interface Showables
{
	public void show();
}

interface Printables extends Showables
{
	//public void show();
	public void print();
}

class Test implements Printables
{
	public void show()
	{
		System.out.println("Showing...");
	}
	public void print()
	{
		System.out.println("Printing...");
	}
	public static void main(String[] args)
	{
		Test ob = new Test();
		ob.show();
		ob.print();
	}
}