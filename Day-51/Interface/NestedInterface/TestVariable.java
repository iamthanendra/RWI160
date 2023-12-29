interface A1
{
	int x = 5;
}

class TestVariable implements A1
{
	void display()
	{
		System.out.println("x = "+x);
	}
	public static void main(String[] args)
	{
		TestVariable obj = new TestVariable();
		obj.display();
	}
}