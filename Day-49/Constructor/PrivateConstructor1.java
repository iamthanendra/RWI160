class PrivateConstructor1
{

	private PrivateConstructor1()
	{
		System.out.println("Private Constructor is Invoked");
	}
	
	private void msg()
	{
		System.out.println("Hello...");
	}

	void call()
	{
		System.out.println("Calling...");
	}

	public static void main(String[] args)
	{
		PrivateConstructor1 ob = new PrivateConstructor1();
		ob.call();
		ob.msg();
	}
}