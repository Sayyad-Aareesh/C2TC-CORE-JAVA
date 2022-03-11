package MyPrograms;

public class Continue_Statement_Using_Do_While 
{
	public static void main(String[] args)
	{
		int x=0,y=10;
		
		System.out.println("do-while useing increament Operator");
		do {
			x++;
			System.out.println(x);
			if(++x<5)
				continue;
			
			x++;
			System.out.println(x);
		}while(++x<10);
	
	
		
	
	}
	
	
	
	
}

