import java.util.*;

//Customize---->UncheckException

public class Customize_Exception_Demo
{
	public static void main(String args[])
	{
		byte age;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter Your Age");
		age=sc.nextByte();
		
		if(age<18)
		{
			throw new CantVote("You Cannot Cast Your Vote As A "+ 
			"age Is Less Then 18...."); 
		}
		else
		{
			System.out.println("You Can Vote...");
		}
		
	}	
}

class CantVote extends RuntimeException
{
	CantVote(String msg)
	{
		super(msg);
	}
}