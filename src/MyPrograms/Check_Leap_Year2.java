import java.util.Scanner;

public class Check_Leap_Year2
{
	public static void main(String[] args)
	{

    
		int year;
		boolean leap = false;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year To Check It Is Leap Or Not On Format(YYYY)");
		year=sc.nextInt();
		
		 if (year % 4 == 0) 
		 {

			   if (year % 100 == 0) 
			   {

				// if year is divided by 400
				// then it is a leap year
				if (year % 400 == 0)
				  leap = true;
				else
				  leap = false;
			  }
			  
			  // if the year is not century
			  else
				leap = true;
		  }
			
			else
			  leap = false;

			if (leap)
			  System.out.println(year + " is a leap year.");
			else
			  System.out.println(year + " is not a leap year.");
	}
}

