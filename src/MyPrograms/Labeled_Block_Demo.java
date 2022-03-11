package MyPrograms;

public class Labeled_Block_Demo {

	public static void main(String[] args) 
	{
	 
		int x=10;
		int y=20;
		
		System.out.println("Labeled Block using x variable");
		l:		//Labeled Block
		{
			System.out.println("Login");
			if(x==10)
			break l;
			
			System.out.println("End");
			
		}
		System.out.println("Hello");
		
		
		System.out.println();
		
		System.out.println("Same  Labeled Block using y variable");
		l:		//Labeled Block
		{
			System.out.println("Login");
			if(y==100)
			break l;
			
			System.out.println("End");
			
		}
		System.out.println("Hello");
		
	}

}
