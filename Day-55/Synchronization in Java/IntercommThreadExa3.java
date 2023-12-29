class A
{
	static int count;
	static{ 
		count = 1;
	}
	synchronized void sent()
	{
		for(int i = 1; i < 6; i++)
		{
			this.count  = i;
			System.out.println("Data Sending : "+this.count);
			notify();
			//if(count < 5)
			try{ wait(); } catch( Exception e ){}
		}
	}
	synchronized void transfer()
	{
		while(count < 5)
		{
		try{ wait(); } catch( Exception e ){ }
		System.out.println("Data Transfering : "+this.count);
		notify();
		}
	}
	synchronized void receive()
	{
		while(count < 5)
		{
		try{ wait(); } catch( Exception e ){ } 
		System.out.println("Data Receiving : "+this.count);
		System.out.println("--------------------------------------------------");
		notify();
		}
	}
}

class Test 
{
	public static void main(String[ ]  args)
	{
		final A ob = new A();

		new Thread()
		{
			public void run()
			{
				ob.transfer();
			}
		}.start();
		new Thread()
		{
			public void run()
			{
				ob.receive();
			}
		}.start();
		new Thread()
		{
			public void run()
			{
				ob.sent();
			}
		}.start();
	}

}