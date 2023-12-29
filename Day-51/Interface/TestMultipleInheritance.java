class A
{
	public void a()
	{
		System.out.println("Hello");
	}
}

interface B 
{
	void a();
}

class TestMultipleInheritance extends A implements B
{
//	public void a()
//	{
//		System.out.println("Hii");
//	}
	public static void main(String[] args)
	{
		TestMultipleInheritance b = new TestMultipleInheritance();
		b.a();

		B ob = new TestMultipleInheritance();
		ob.a();
	}
}