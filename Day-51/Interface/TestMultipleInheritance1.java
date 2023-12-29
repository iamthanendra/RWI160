interface A
{
	public void a();
	
}

interface B 
{
	public void a();
}

class TestMultipleInheritance1 implements A,B
{
	public void a()
	{
		System.out.println("Hii");
	}
	public static void main(String[] args)
	{
		TestMultipleInheritance1 b = new TestMultipleInheritance1();
		b.a();

		//B ob = new TestMultipleInheritance();
		//ob.a();
	}
}