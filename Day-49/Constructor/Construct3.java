class Construct3
{
	int a = 8;
	int b = 8;
	Construct3()
	{
		int a = 3;
		for(int i = 1; i <= 2; i++)
		System.out.println("Inside Default Constructor A = "+ a++);
		System.out.println("Inside Default Constructor B = "+b);
		a = 10;
		a++;
	}
	public static void main(String[] args) 
	{
		Construct3 ob = new Construct3();
		System.out.println("OutSide Constructor(In Main) A = "+ob.a);
		System.out.println("OutSide Constructor(In Main) B = "+ob.b);
	}
}
