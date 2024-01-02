interface Arithmetic
{
	int add(int a, int b);
	int sub(int a, int b);
}

class TestAnonymous
{
	public static void main(String[] args)
	{
		Arithmetic opreations = new Arithmetic(){
			public int add(int a, int b)
			{
				return a+b;
			}
			public int sub(int a, int b)
			{
				return a-b;
			}
		};

		System.out.println(opreations.add(10,20));
		System.out.println(opreations.sub(10,20));
	}
}