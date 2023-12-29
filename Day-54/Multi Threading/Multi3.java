class Multi3
{
	public static void main(String[] a)
	{
		Thread t = new Thread("My New Thread");
		t.start();
		String str = t.getName();
		System.out.println(str);
	}
}