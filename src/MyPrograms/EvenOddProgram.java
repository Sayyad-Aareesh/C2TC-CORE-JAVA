package MyPrograms;

import java.util.Scanner;

public class EvenOddProgram {
	
	
	
	    public static void main(String args[]) 
	    {
	        int n;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number you want to check:");
	        n = sc.nextInt();
	        if(n % 2 == 0)
	        {
	            System.out.println("The given number "+n+" is Even ");
	        }
	        else
	        {
	            System.out.println("The given number "+n+" is Odd ");
		}
	    }
	

}
