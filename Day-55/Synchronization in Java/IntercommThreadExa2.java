class A
{
	static int count;
	
	//Instance Initializer Block
	static{
		count = 0;
	}

	synchronized void deliver()
	{
		for(int i = 1; i < 6; i++)
		{
			count = i;
			System.out.println("Data Delivered : "+ count);
			notify();
			try{ wait(); } catch( Exception e ){ }
		}
	}

	synchronized void consumed()
	{
		while(count < 5)
		{
			try{ wait(); } catch(Exception e){ }
			System.out.println("Data Consumed : "+count);
			notify();
		}
	}
}

class Test
{
	public static void main(String[ ] args)
	{
		final A ob = new A( );
		
		new Thread(){
			public void run()
			{	
				ob.consumed();
			}

		}.start( );

		new Thread(){
			public void run()
			{	
				ob.deliver();
			}
		}.start( );

	}
}