class A
{
	private void msg1()
	{
		System.out.println("Worked");
	}
}

class B extends A
{
	void msg()
	{
	//	super.msg();
		System.out.println("Worked");
	}
}

class TestPrivate
{
	public static void main(String[] args)
	{
		B ob = new B();
		ob.msg();
	}
}