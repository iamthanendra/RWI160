class ThreadPriorities implements Runnable
{
	public void run( )
	{
		for(int i = 0; i < 5; i ++)
			System.out.print(Thread.currentThread().getName()+" : "+i+"\t");
		System.out.println();
	}
	public static void main(String... rgs)
	{
		Runnable r = new ThreadPriorities( );
		Thread t1 = new Thread(r, "t1");
		Thread t2 = new Thread(r, "t2");

		System.out.println(t1.getName()+" priority : "+t1.getPriority( ));
		t1.setPriority(Thread.MIN_PRIORITY); 
		//t1.setPriority(1);

		System.out.println(t2.getName()+" Priority : "+t2.getPriority( ));
		t2.setPriority(Thread.NORM_PRIORITY);
		//t2.setPriority(5);

		System.out.println(Thread.currentThread().getName( )+" Priority : "+Thread.currentThread(  ).getPriority( ));
		Thread.currentThread( ).setPriority(Thread.MAX_PRIORITY);
		//Thread.currentThread( ).setPriority(10) ;

		System.out.println(t1.getName()+" priority : "+t1.getPriority( ));
		System.out.println(t2.getName()+" Priority : "+t2.getPriority( ));
		System.out.println(Thread.currentThread().getName( )+" Priority : "+Thread.currentThread(  ).getPriority( ));

		t1.start( ); t2.start( );
		for(int i = 0; i < 5; i++)
		System.out.print(Thread.currentThread( ).getName ( )+" : "+i+"\t");
		System.out.println();
	}
}