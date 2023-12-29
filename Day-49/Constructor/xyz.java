class xyz
{
	int a;
	int b;
	xyz()
	{
	}
	xyz(int x, int y)
	{
		a = x;
		b = y;
	}
	xyz x(xyz obj)
	{
		obj = new xyz();
		return obj;
	}
	void display()
	{
		System.out.println(a+" "+b);
	}
    public static void main(String args[])
	{
		xyz ob = new xyz(5, 6);
		xyz ob1;
		ob1 = ob.x(ob);
		ob.display();
		ob1.display();
	}
}