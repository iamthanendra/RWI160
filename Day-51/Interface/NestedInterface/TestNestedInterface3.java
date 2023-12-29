interface Showables
{
	public void show();
	interface Message
	{
		public void msg();
	}
	interface Call
	{
		public void call();
	}
}

class TestNestedInterface3 implements Showables.Message
{
	public void show()
	{
		System.out.println("Show");
	}

	public void msg()
	{
		System.out.println("Hello");
	}

	public void call()
	{
		System.out.println("Calling");
	}

	public static void main(String args[])
	{
		TestNestedInterface3 m = new TestNestedInterface3();
		m.msg();
		m.show();
		m.call();

	    Showables.Message m1 = new TestNestedInterface3();
		m.msg();
		m.show();
		m.call();
	}
}