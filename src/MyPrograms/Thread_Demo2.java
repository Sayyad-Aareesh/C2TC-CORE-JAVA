public class Thread_Demo2
{
	public static void main(String args[])
	{
		
		
		MyTheadDemo obj=new MyTheadDemo();
		obj.run();
		System.out.println();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("This Thread Come From main Method");
		}
		
		
	}
} 

class MyTheadDemo implements Runnable
{
	public void run()
	{
		do
		{
			System.out.println("Hello,This Thread Come Through Runnable Interface");
	
		}
		while(false);
	}
	
}