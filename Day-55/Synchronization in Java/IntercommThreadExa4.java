class PrintEvenAndOdd
{
	static int counter, limit;

	static{
		counter = 1;
		limit = 10;
	}

	synchronized void printEven()
	{
		while(counter <= limit)
		{
			if(counter % 2 == 0)
			{
				System.out.println("Counter is : "+counter);
				counter++;
				notify();
			}
			try{ Thread.sleep(500); wait(); } catch(Exception e){ }
		}	
	}

	synchronized void printOdd()
	{
		while(counter <= limit)
		{
			if(counter % 2 != 0)
			{
				System.out.println("Counter is : "+counter);
				counter++;
				notify();
			}
			try{ Thread.sleep(500); wait(); } catch( Exception e ){ }
		}	
	}

}

class Test
{
	public static void main(String[ ]  args)
	{
		final PrintEvenAndOdd ob = new PrintEvenAndOdd( );
		
		PrintEvenAndOdd.limit = 50;

		new Thread(){
			public void run()
			{
				ob.printOdd();
			}
		}.start();

		new Thread(){
			public void run()
			{
				ob.printEven();
			}
		}.start();


	}
}