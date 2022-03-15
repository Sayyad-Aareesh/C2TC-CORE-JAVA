package MyPrograms;

interface A
{
	void display_A();
}
interface B
{
	void display_B();
}

class ABS implements A,B
{

	
	public void display_A() 
	{
		System.out.println("This Method Come From Interface A");
	}

	
	public void display_B() 
	{
		System.out.println("This Method Come From Interface B");
		
		
	}
	
	
}
class Interface_Demo
{
	public static void main(String args[])
	{
		ABS obj=new ABS();
		
		obj.display_A();
		
		obj.display_B();
	}
}