class TestSync1 extends Thread
{
	int n;
	TestSync1 t;
	TestSync1(){}
	TestSync1(String threadName, int n)
	{
		super(threadName);
		t = new TestSync1();
		this.n = n;
	}
	public void run()
	{
		this.printTable();
	}
	 synchronized void printTable()
	{
		System.out.println("Printing Table for "+Thread.currentThread().getName()+" Thread");
		for(int i = 1; i <= 10; i++)
			System.out.printf("%d * %d = %d\n", this.n, i, this.n *i);
		System.out.println("------------------------------------------------------------------------");

	}
	public static void main(String[] args)
	{
		TestSync1 t1 = new TestSync1("t1", 5);
		TestSync1 t2 = new TestSync1("t2", 10);
		t1.start(); t2.start();
	}
}