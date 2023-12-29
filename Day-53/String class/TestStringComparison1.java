class TestStringComparison1
{
	public static void main(String[] args) 
	{
		String s1 = "Sachin";
		String s2 = new String("Sachin");
		String s3 = "SACHIN";
		System.out.println(""+s1.equals(s2));
		System.out.println(""+s1.equals(s3));
		System.out.println(""+s1.equalsIgnoreCase(s3));
	}
}