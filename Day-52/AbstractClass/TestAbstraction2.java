class A
{
	void print()
	{
		System.out.println("Class A");
	}
}

abstract class B extends A
{
	abstract void print();
}

class C extends B
{
	void print()
	{
		System.out.println("Class C");
	}
}

class TestAbstraction2
{
	public static void main(String[] args)
	{
		A ob;
		ob = new A();
		ob.print();
		//ob = new B(); //Error
		//ob.print(); 
		ob = new C();
		ob.print();
	}
}