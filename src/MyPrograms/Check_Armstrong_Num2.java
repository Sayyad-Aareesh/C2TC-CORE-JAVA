import java.util.*;

public class Check_Armstrong_Num2

 {

    public static void main(String[] args) {

        int number, originalNumber, remainder, result = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Three Digit Number To Check It is Amstorng Or Not");
		
		number=sc.nextInt();
        
		originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}