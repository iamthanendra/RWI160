class A
{

	private A()
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

}

class PrivateConstructor2
{
	public static void main(String[] args)
	{
		PrivateConstructor2 ob = new PrivateConstructor2();
		ob.call();
		ob.msg();
	}
}