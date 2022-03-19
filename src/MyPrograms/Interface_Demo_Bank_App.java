package MyPrograms;



interface Bank
{
	float rateOfInterest();
}
class SBI implements Bank
{
	@Override
	public float rateOfInterest()
	{
		return 9.15f;
	}
}
class ICICI implements Bank
{
	@Override
	public float rateOfInterest()
	{
		return 9.7f;
	}
}

public class Interface_Demo_Bank_App
{

	public static void main(String[] args)
	{
		
		Bank obj=new ICICI();
		System.out.println("ICICI Bank");
		System.out.println("ROI: " + obj.rateOfInterest());
		
		System.out.println();
		
		System.out.println("SBI Bank");
		Bank b = new SBI();
		System.out.println("ROI: " + b.rateOfInterest());
	}

}


//