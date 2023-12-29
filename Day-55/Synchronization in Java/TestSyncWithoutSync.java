//Without Sync Problem
class First
{
	void display(String msg)
	{
		System.out.print("[ "+ msg);
		try{
			Thread.sleep(500);
		}
		catch(IllegalStateException e){ System.out.println(e); }
		catch(Exception e){ System.out.println(e); }

		System.out.println("]");
	}
}
class Second extends Thread
{
	First obj;
	String msg;
	Second(String msg, First obj)
	{
		this.msg = msg;
		this.obj = obj;
	}
	public void run()
	{
		obj.display(msg);
	}
	public static void main(String... args)
	{
		First f_ob = new First();
		Second ob1 = new Second("Welcome", f_ob);
		Second ob2 = new Second("Thanendra", f_ob);
		Second ob3 = new Second("Kashyap", f_ob);
		ob1.start(); ob2.start(); ob3.start();
	}
}