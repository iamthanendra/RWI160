//Not setting thread name
class ThreadNaming extends Thread
{
	public void run()
	{
		for(int i = 0; i < 10; i++)
			System.out.println(Thread.currentThread().getName()+" : "+i);
	}
	public static void main(String[] args)
	{
		ThreadNaming t1 = new ThreadNaming();
		ThreadNaming t2 = new ThreadNaming();
		t1.start(); t2.start();
		for(int i = 0; i < 10; i++)
			System.out.println(Thread.currentThread().getName()+" : "+i);
	}
}