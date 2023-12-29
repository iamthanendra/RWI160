class Test1 implements Runnable
{
	public void run()
	{
		try{
			for(int i = 0; i < 10; i++)
			{
				Thread.sleep(500);
				System.out.println("Thread 1 : "+i+"////hold 500 ms");	
			}
		}
		catch(Exception e){}		
	}
}

class Test2 implements Runnable
{
	public void run() 
	{
		try
		{
			for(int i = 0; i < 5; i++)
			{
				Thread.sleep(1000);
				System.out.println("Thread 2 : "+i+"////hold 1000 ms");
			}
		}
		catch(Exception e){}
	}	
}

class TestSleep2
{
	public static void main(String[] args)
	{
		Runnable r;
		r = new Test1();
		Thread t1 = new Thread(r);
		r = new Test2();
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();		
	}
}