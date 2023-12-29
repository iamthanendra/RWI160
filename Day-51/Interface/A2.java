interface Printables
{
	public void print();
}

interface Showables
{
	public void show();
}

class A2 implements Printables, Showables
{
	public void print()
	{
		System.out.println("Prints...");
	}

	public void show()
	{
		System.out.println("Shows....");
	}

	public static void main(String[] args)
	{
		A2 ob1 = new A2();
		ob1.print();
		ob1.show();
		
		//Printables ob2 = new A2();
		//ob2.print();
		//ob2.show(); //Not Accessable

		//Showables ob3 = new A2();
		//ob3.print();//Not Accessable
		//ob3.show();
	}
}