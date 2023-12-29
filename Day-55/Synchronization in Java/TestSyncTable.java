class Table
{
	void printTable(int n)
	{
		for(int i = 1; i <= 10; i++)
		{	
			System.out.printf("%d * %d = %d\n", n, i, n*i);
		}
		System.out.println("-------------------------------------------------------------");
	}

	/* //This will work without sync
	void printTable(int n)
	{
		String s="";
		for(int i = 1; i <= 10; i++)
		{	
			s =s+s.format("%d * %d = %d\n", n, i, n*i);
		}
		System.out.println(s+"-------------------------------------------------------------");
	}
	*/
}
class Second extends Thread
{
	Table t_ob;
	int n;
	Second(Table t_ob, int n)
	{
		this.t_ob = t_ob;
		this.n = n;
	}
	public void run()
	{
		t_ob.printTable(n);
	}
	public static void main(String[] args) throws Exception
	{
		Table t_ob = new Table();
		Second s1 = new Second(t_ob, 5);
		Second s2 = new Second(t_ob, 10);
		Second s3 = new Second(t_ob, 20);
		s1.start(); //s1.join();
		s2.start(); //s2.join();
		s3.start(); //s3.join();
	}
}