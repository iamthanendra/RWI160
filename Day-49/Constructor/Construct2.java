class Construct2
{
	int a = 5;
	Construct2()
	{
		int a = 3; //Life only in this default constructor
		int b = 4; //Life only in this default constructor
		System.out.println("Hello World!" + a);
		System.out.println("Hello World!" + b);

	}
	public static void main(String[] args) 
	{
		Construct2 ob = new Construct2();
		System.out.println("Hello World!"+ob.a);
		//System.out.println("Hello World!"+ob.b);
	}
}
