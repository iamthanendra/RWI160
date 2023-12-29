import java.util.Scanner;
class TestThread extends Thread
{
	public void run()
	{
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.printf("your data is %d",i);
		
	}
	public static void main(String[ ] args)
	{
		TestThread t = new TestThread();
		t.start();
		for(int i = 0;i<9999;i++)
		System.out.println(""+i);
	}
	
}