public class Exception_Demo2
{
	public static void main(String args[])
	{
		System.out.println("Hello-Friend's");
		System.out.println("This Is Exception Handling Demo");
		System.out.println();
		
		try			//Risky Code
		{
			//System.out.println("Running Try Block");
			System.out.println("Number 5/0 :"+5/0);
			
		}
		catch(ArithmeticException obj)
		{
			
			System.out.println("Runing Catch Block");
			System.out.println();
			
			//System.out.println("Dont Divid By Zero");
			System.out.println("4/2 :"+4/2);
			
			//System.out.println(obj);		//O/p:java.lang.ArithmeticException: / by zero
		}
		System.out.println("Thank You");
		
	}
}
