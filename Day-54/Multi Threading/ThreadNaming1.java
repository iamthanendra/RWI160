//setting thread name by using constructor
class ThreadNaming1 extends Thread
{
	ThreadNaming1(String threadName)
	{
		super(threadName);
	}
	public void run()
	{
		for(int i = 0; i < 20; i++)
			System.out.println(Thread.currentThread().getName()+" : "+i);
	}
	public static void main(String[] args) throws Exception
	{
		ThreadNaming1 t1 = new ThreadNaming1("t1");
		ThreadNaming1 t2 = new ThreadNaming1("t2");
		Thread.currentThread().setName("m");
		t1.start(); t2.start();
		for(int i = 0; i < 20; i++)
			System.out.println(Thread.currentThread().getName()+" : "+i);
	}
}