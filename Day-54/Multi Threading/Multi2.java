class Multi2 implements Runnable
{
	public void run()
	{
		System.out.println("Thread is running...");
	}
	public static void main(String[ ] args)
	{
		Multi2 m1 = new Multi2();	
		Thread t1;
		t1 = new Thread(m1); //Using the constructor thread runnable r
		t1.start();
		Runnable r = new Multi2();
		t1 = new Thread(r);
		t1.start();		
	}
}