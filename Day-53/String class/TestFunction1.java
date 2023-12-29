class TestFunction1
{
	public static boolean call(String s)
	{
		if(this == s)
			return true;
		else
			return false;
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		String s1 = "Msg";
		String s2 = "Msg";
		System.out.println(s1.call(s2));
	}
}
