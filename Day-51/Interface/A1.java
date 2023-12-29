import static java.lang.System.*;
interface Printables
{
	void print();//visibility mode is public added by compiler in compile time

	//Printables Printables();
	
	
	//{ //Instance Initializer Block does not support in interface
	//	out.println("Hello");
	//}
}

class A1 implements Printables
{
	//void print() //Error Bcoz its visibility mode is default (visibility mode mismatch)
	//{
	//	out.println("Hello");
	//}
	public void print()
	{
		//super.print();
		out.println("Hello");
	}

	public static void main(String[] args)
	{
		A1 obj = new A1();
		obj.print();
		//Printables obj1 = new Printables();//Bcoz Printables is absract 
	}
}