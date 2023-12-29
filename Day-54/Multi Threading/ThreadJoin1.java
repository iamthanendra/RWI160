import java.io.*;

class ThreadJoin1 extends Thread
{
	static String str = "";
	public void run() 
	{	try{
		for(int i = 0; i < 15; i++)
		{Thread.sleep(500);System.out.print(Thread.currentThread().getName()+" : "+i+" "+str+" ; ");}
		System.out.println();
		}
		catch(Exception e){}
	}
	public static void main(String[] args) throws Exception
	{
		ThreadJoin1 th1 = new ThreadJoin1();
		ThreadJoin1 th2 = new ThreadJoin1();
		ThreadJoin1 th3 = new ThreadJoin1();
		th1.setName("th1");th2.setName("th2");th3.setName("th3");
		str = " - ";     
		th1.start(); th1.join(3500);
		
		str = " # ";    
		th2.start();th2.join(1000);

		str = " @ "; 
		 th3.start(); th3.join(500); 
		
		str = " + ";  
		System.out.println(Thread.currentThread().getName()+" "+str+" ;");
	}
}