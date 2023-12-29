class PrintDemo implements Runnable
{
	void printCount()
	{
		for(int i = 5; i > 0; i--)
			System.out.println(Thread.currentThread().getName()+" : "+i);
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
	}
	public void run()
	{
		synchronized(PrintDemo.class)
		{
			printCount();
		}
	}
	public static void main(String[ ]  args)
	{
		Runnable r = new PrintDemo();
		Thread pd1 = new Thread(r, "PD1-Thread");
		Thread pd2 = new Thread(r, "PD2-Thread");
		Thread pd3 = new Thread(r, "PD3-Thread");
		pd1.start();
		pd2.start();
		pd3.start();
	}
}