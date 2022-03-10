package MyPrograms;

import java.util.Scanner;

public class For_Loop_Demo {

	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Integer To Create Maths Table");
		
		a=sc.nextInt();
		System.out.println();
	
		for(int i=1;i<=10;i++)
		{
			
			
			System.out.println(a+"x"+i+"="+a*i);	
			
		}
	}

}
