import java.io.*;

class ThreadJoin extends Thread
{
	static String str = "";
	public void run()
	{
		for(int i = 0; i < 5; i++)
			System.out.print(Thread.currentThread().getName()+" : "+i+" "+str+" ; ");
		System.out.println();
	}
	public static void main(String[] args) throws Exception
	{
		ThreadJoin th1 = new ThreadJoin();
		ThreadJoin th2 = new ThreadJoin();
		ThreadJoin th3 = new ThreadJoin();
		th1.setName("th1");th2.setName("th2");th3.setName("th3");
		str = " - ";     
		th1.start(); th1.join();
		
		str = " # ";    
		th2.start();th2.join();

		str = " @ "; 
		 th3.start();th3.join(); 
		
		str = " + ";  
		System.out.println(Thread.currentThread().getName()+" "+str+" ;");
	}
}