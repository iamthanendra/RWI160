class A
{
	private void msg()
	{
		System.out.println("Worked");
	}
}

class B extends A
{
	private int msg() //it's Didn't override method msg() if it override msg() then both
	{                 //method return type must be same
		//super.msg();
		System.out.println("Worked");
		return 0;
	}
	void access()
	{
		int i = msg();
	}
}

class TestPrivate1
{
	public static void main(String[] args)
	{
		B ob = new B();
		ob.access();
		System.out.println(""+sizeof(ob.SIZE));
	}
}