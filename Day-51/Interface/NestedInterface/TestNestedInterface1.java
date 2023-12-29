interface Showables
{
	public void show();
	interface Message
	{
		public void msg();
	}
}

class TestNestedInterface1 implements Showables.Message
{
	public void show()
	{
		System.out.println("Show");
	}

	public void msg()
	{
		System.out.println("Hello");
	}

	public static void main(String args[])
	{
		//Showables.Message
		TestNestedInterface1 m = new TestNestedInterface1();
		m.msg();
		m.show();
	}
}