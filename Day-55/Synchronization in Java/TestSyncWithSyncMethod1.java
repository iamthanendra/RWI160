class First
{
	synchronized void display(String msg)
	{	
		String str = "[ "+msg+" ]";
		try{
			for(char i : str.toCharArray())
			{
				Thread.sleep(100, 10);
				System.out.print(i);
			}
		}
		catch(Exception e){ System.out.println(e); }
		System.out.println();
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
		f_obj.display(msg);
	}
	public static void main(String[] args) throws Exception
	{
		First f_obj = new First();
		Second s_ob1 = new Second(f_obj, "Welcome");
		Second s_ob2 = new Second(f_obj, "Thanendra");
		Second s_ob3 = new Second(f_obj, "Kashyap");
		s_ob1.start(); s_ob1.join(); 
		s_ob2.start(); s_ob2.join(); 
		s_ob3.start(); s_ob3.join();
	}
}