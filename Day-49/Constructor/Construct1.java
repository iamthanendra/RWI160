class Construct1 
{
	int a = 5;
	int b;
	int c;
	Construct1()
	{
		b = 5;
		System.out.println("Hello World!");
	}

	public static void main(String[] args) 
	{
	//	int d;
		Construct1 ob = new Construct1();
		System.out.println("a  = "+ob.a); // initialize in creation time 
		System.out.println("b  = "+ob.b); // initialize in default constructor
		System.out.println("c  = "+ob.c); //Didn't initialize in default constructor 
		//but default constructor automatic initialize its value and assign default value according its data type 
	//	System.out.println("d  = "+d);//Error in this line 
		//this is created in main() and didn't initialize its value 
		//and default constructor will not assign its default value 
	}
}