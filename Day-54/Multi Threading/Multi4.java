class Multi4 implements Runnable
{
	public void run()
	{
		for(int i = 0; i < 30; i++)
		System.out.println("Thread is Running.  .  .");
	}
	public static void main(String[] arg)
	{
		Runnable r = new Multi4();
		Thread t = new Thread(r, "My New Thread");
		t.start();
		String str = t.getName();
		for(int i = 0; i < 30; i++)
		System.out.println(str);
	}
}