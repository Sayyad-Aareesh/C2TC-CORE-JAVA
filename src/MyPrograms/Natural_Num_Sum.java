public class Natural_Num_Sum 
{  
    public static void main(String[] args)   
    {  
    int i, num = 100, sum = 0;  
    //executes until the condition returns true  
    for(i = 1; i <= num; ++i)  
    {  
    //adding the value of i into sum variable  
    sum = sum + i;  
    }  
    //prints the sum   
    System.out.println("Sum of First 100 Natural Numbers is = " + sum);  
    }  
}  