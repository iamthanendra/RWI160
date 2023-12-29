class TestStringComparison4
{
	public static void main(String args[])
	{
		String s1 = "Sachin";
		String s2 = "SACHIN";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		s1 = "a";
		s2 = "b";
		System.out.println(s1.compareTo(s2));
		s1 = null;
		s2 = null;
		System.gc();
		{
			String s3 = "Thanendra";
			String s4 = null;
			System.out.println(s3.compareTo(s4)); //NullPointerException
		}
	}
}