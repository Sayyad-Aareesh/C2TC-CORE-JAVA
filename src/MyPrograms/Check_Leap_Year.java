public class Check_Leap_Year
{
	public static void main(String[] args)
	{

    
    int year = 1996;
    boolean leap = false;

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

