package MyPrograms;

import java.util.Scanner;

public class Addition_By_User_Input {

	public static void main(String[] args) {
		int a,b,sum;
		
		System.out.println("This is Addition Progam ");
		System.out.println("Take Addition of Two Number By Your/user Input");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First Number");
		a=sc.nextInt();
		
		System.out.println("Enter Second Number");
		b=sc.nextInt();
		
		sum=a+b;
		
		System.out.println("Addition :"+sum);
		
		
		

	}

}
