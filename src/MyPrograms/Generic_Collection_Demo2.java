package MyPrograms;

public class Generic_Collection_Demo2 
{

	public static void main(String[] args)
	{
		System.out.println("Generic Demo Program");
		System.out.println("when we are not sure which type of parameter are used in list");
		
		System.out.println();
		System.out.println("...Integer Type...");
		Cont<Integer> i=new Cont<>();
		
		i.value=78;
		
		i.show();
		
		
		System.out.println();
		System.out.println("...Floart Type...");
		Cont<Float> f=new Cont<>();
		
		f.value=67.89f;
		
		f.show();
	}

}

class Cont<T>		//<T> is used when we are not sure which type of parameter in list or it means bounded type
{
	T value;		//T:it contain any data type int,byte,etc
	
	void show()
	{
		System.out.println("Value is :"+value);
	}
	
}