import static java.lang.System.*; //Java 4/5 feature (static import)

abstract class A
{
	//abstract public static void main(String[] args); //Error 
	//illegal combination of abstract keyword and static
	abstract void msg();
}

class TestMain extends A
{
	void msg()
	{
		out.println("Successfully Worked");
	}
	public static void main(String[] args)
	{
		TestMain ob = new TestMain();
		ob.msg();
	}
}