class Customer
{
	int amount = 10_000;
	synchronized void withdraw(int amount)
	{
		System.out.println("Going to Withdraw. . .");
		if(this.amount < amount)
		{
			System.out.println("Less Balance, Waiting for Deposit . . .");
			try{wait();} catch(Exception e){}
		}

		this.amount -= amount;
		System.out.println("Withdraw Completed . . .");

	}

	synchronized void deposit(int amount)
	{
		System.out.println("going to Deposit . . .");
		this.amount += amount;
		System.out.println("Deposit Complete . . .");
		notify();
	}
}

class Test
{
	public static void main(String[ ] args)
	{
		final Customer c = new Customer();
		
		//Creating Anonymous Object
		new Thread(){
			public void run()
			{
				c.withdraw(15_000);
			}
		}.start( );
		
		//Creating Anonymous Object
		new Thread(){
			public void run( )
			{
				c.deposit(10_000);
			}
		}.start( );
	}
}