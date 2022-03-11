package MyPrograms;

public class Breeak_Statement_Demo {

	public static void main(String[] args)
	{
		int x=12,y=10; 
		
		System.out.println("Break Statement Demo");
		System.out.println();
		System.out.println("Using For loop");
		
		for(int i=0;i<10;i++)
		{
			
			if(i==5)
				break;
			System.out.println(i);
		}
		
		System.out.println();
		System.out.println("Using While loop");
		
		while(x>y)
		{
			System.out.println("X is Greater then y");
			break;
		}

	}

}
