import java.util.Scanner;

public class Natural_Num_Sum2 
{  
    public static void main(String[] args)   
    {  
		int i, num, sum = 0;  
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter, How Many Number You Want's To Add It");
		
		num=sc.nextInt();
		//executes until the condition returns true  
    for(i = 1; i <= num; ++i)  
    {  
    //adding the value of i into sum variable  
    sum = sum + i;  
    }  
    //prints the sum   
	System.out.println();
    System.out.println("Sum : " + sum);  
    }  
}  