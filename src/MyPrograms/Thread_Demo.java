public class Thread_Demo
{
	public static void main(String args[])
	{
		MyThread mythread=new MyThread();
		mythread.run();
		
		for(int i=0;i<=10;i++)
		{
			System.out.println("I am From Main Thread...");
		}
	}
}

class MyThread extends Thread
{
	public void run()
	{
		System.out.println("Using Thread Class");
		System.out.println();
		
		for(int i=0;i<=10;i++)
		{
			System.out.println("I am From MyThread....");
		}
	}
}