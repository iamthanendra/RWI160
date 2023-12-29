class TestDaemonThread extends Thread
{
	TestDaemonThread(String str)
	{
		super(str);
		
		//this.setDaemon(true);
	}
	public void run()
	{
		if(Thread.currentThread().isDaemon())
			for(int i  = 0; i < 25; i++)
				System.out.println(Thread.currentThread().getName()+" : "+i);
		else
			for(int i = 0; i < 5; i++)
				System.out.println(Thread.currentThread().getName()+" : "+i);
		
	}
	public static void main(String[] args)
	{
		TestDaemonThread t1 = new TestDaemonThread("~~~ t1");
		TestDaemonThread t2 = new TestDaemonThread("### t2");
		TestDaemonThread t3 = new TestDaemonThread("!!! t3");
		
		System.out.println(t1.getName()+" Priority : "+ t1.getPriority());
		System.out.println(t2.getName()+" Priority : "+ t2.getPriority());
		System.out.println(t3.getName()+" Priority : "+ t3.getPriority());

		System.out.println(t1.getName()+" is Daemon : "+ t1.isDaemon());
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		t1.start();
		t2.start();
		t3.start();
	}
}