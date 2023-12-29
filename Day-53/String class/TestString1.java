class TestString1
{
	public String toString() 
	{
		String s = super.toString();
		return getClass().getName() + "@" + Integer.toHexString(hashCode()) + s;
	}
	
	public static void main(String[] args) 
	{
		String s1 = "Welcome";
		String s2 = "Welcome";
		String s3 = new String("Welcome");
		StringBuffer s4 = new StringBuffer("Welcome");
		StringBuffer s5 = new StringBuffer("Welcome");
		System.out.println(""+s1.hashCode());
		System.out.println(""+s2.hashCode());
		System.out.println(""+s3.hashCode());
		System.out.println(""+s4.hashCode());
		System.out.println(""+s5.hashCode());
		s1 = s1 + " Back";
		s2 = s2 + " Back";
		s3 = s3 + " Back";
		s4.append(" Back");
		s5.append(" Back");
		System.out.println(""+s1.hashCode()); // Now Address Will be changed
		System.out.println(""+s2.hashCode()); // Now Address Will be changed
		System.out.println(""+s3.hashCode()); // Now Address Will be changed
		System.out.println(""+s4.hashCode());
		System.out.println(""+s5.hashCode());

	}
}
