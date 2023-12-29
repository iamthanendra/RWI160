class A
{
	public void msg()//visiblity public
	{
		System.out.println("Class A");
	}
}

class B extends A
{
    void msg()//visiblity default //Error Bcoz vibility missmatch
	{
		System.out.println("Class B");
	}
}

class TestAccessSpecifier1
{
	public static void main(String[] args)
	{
		A ob = new B();
		ob.msg();
	}
}