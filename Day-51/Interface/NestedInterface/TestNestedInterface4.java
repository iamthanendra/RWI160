interface Showables
{
	public void show();
	interface Message
	{
		public void msg();
		interface Call
		{
			public void call();
		}
	}
}

class TestNestedInterface4 implements Showables.Message,Showables.Message.Call
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
		Showables.Message m = new TestNestedInterface4();
		m.msg();
		//m.show();
		//m.call();
        Showables m1 = new TestNestedInterface4();
		m.msg();
		m.show();
		m.call();
	}
}
