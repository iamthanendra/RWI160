class A
{
	interface Message
	{
		public void msg();
	}
}

class TestNestedInterface2 extends A//implements A.Message
{
	public void msg()
	{
		System.out.print("Hello");
	}

	public static void main(String[] args)
	{
		//A
		TestNestedInterface2 o = new TestNestedInterface2();
		o.msg();
	}
}