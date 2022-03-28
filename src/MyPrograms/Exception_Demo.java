public class Exception_Demo
{
	public static void main(String args[])
	{
		m1();
	}
	static void m1()
	{
		m2();
	}
	static void m2()
	{
		
		try
		{
			System.out.println("Exception :"+10/0);
			
		}
		catch(ArithmeticException obj)
		{
			System.out.println("Number Coul'd Not Divided By Zero");
		}
	}
} 