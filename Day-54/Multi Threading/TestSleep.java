class TestSleep implements Runnable
{
	public void run()
	{
		try
		{	
			for(int i = 0; i < 5; i++)
			{
				Thread.sleep(500, 100);
				System.out.println(i);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	public static void main(String... args)
	{
		Runnable r = new TestSleep();
		Thread t1 = new Thread(r, "My Own Thread 1");	
		Thread t2 = new Thread(r, "My Own Thread 2");
		t1.start(); t2.start();
	}
}