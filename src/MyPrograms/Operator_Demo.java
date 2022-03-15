package MyPrograms;

public class Operator_Demo {

	public static void main(String[] args)
	{
		int a=5,b=15,c=30;
		String s="Hello";
		
		System.out.println(s);
		
		System.out.println(a+b+s);
		System.out.println(s+c);
		System.out.println(s+a+b+c);
		System.out.println(a+c+s+b);
		System.out.println(a+b+c);
	}

	
	/*
	 * O/P:Hello
		20Hello
		Hello30
		Hello51530
		35Hello15
		50

	 */
}
