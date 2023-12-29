//A Simple demostration of abstract 
abstract class A
{
	abstract void callMe();
	{
		System.out.println("A's implemetation of callme.");
	}

	void callMeToo() //Concrete method are still allowed in abstract classes
	{
		System.out.println("This is concrete method....");
	}
}

class B extends A
{
	void callMe()
	{
		System.out.println("B's implemetation of callme.");
	}
}

class AbstractDemo
{
	public static void main(String args[])
	{
		B b = new B();
		b.callMe();
		b.callMeToo();
	}
}