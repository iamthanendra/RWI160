class First
{
	void display(String msg)
	{
		System.out.print("[ "+msg);
		try{
			Thread.sleep(1500, 240);
		}
		catch(Exception e){ System.out.println(e); }
		System.out.println(" ]");
	}
}
class Second extends Thread
{
	First f_obj;
	String msg;
	Second(First f_obj, String msg)
	{
		this.f_obj = f_obj;
		this.msg = msg;
	}
	public void run()
	{
		synchronized(f_obj)
		{
			f_obj.display(msg);
		}
	}
	public static void main(String[] args)
	{
		First f_obj = new First();
		Second s_ob1 = new Second(f_obj, "Welcome");
		Second s_ob2 = new Second(f_obj, "Thanendra");
		Second s_ob3 = new Second(f_obj, "Kashyap");
		s_ob1.start(); s_ob2.start(); s_ob3.start();
	}
}