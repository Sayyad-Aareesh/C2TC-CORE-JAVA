package MyPrograms;

import java.util.Scanner;

public class TakeInputSwitch {

	public static void main(String[] args) {
		
		int n;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Any Integer Number");
		n=sc.nextInt();
		
		switch(n)
		{
		case 0:
			
			System.out.println(0);
			break;
			
		case 1:
			
			System.out.println(1);
			break;
			
		case 2:
			
			System.out.println(2);
			break;
			
		case 3:
			
			System.out.println(3);
		
		default :
			
			System.out.println("Default Statement");
			
			
		}

	}
	
	/*O/P:
	 * When User enter zero ,the value of x is 0.
	 * When User enter one ,the value of x is 1.
	 * When User enter two ,the value of x is 2.
	 * When User enter three ,the value of x is 3.
	 * When User enter other then 0,1,2,3 ,Default Statement is executed.
	 */
	
	

}
