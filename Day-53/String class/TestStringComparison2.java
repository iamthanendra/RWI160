class TestStringComparison2
{
	public static void main(String[] args) 
	{
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = "SACHIN";
		String s4 = new String("Sachin");
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);

		Integer a = new Integer(5);
		int b = 5;
		System.out.println(a == b); //autounboxing a & Integer a converted into  int a
	}
}
