package MyPrograms;

 class Country
 {
	void countryName()
	{
		System.out.println("Country :"+"India");
		}
	 
	 
	  }
 
 public class SingleInheritance extends Country
 {
	 public static void main(String args[])
	 {
		 System.out.println("This Is Child Class");
		 System.out.println("Get Data From Parent Class and Print Data In Child Calss ");
		 
		 SingleInheritance s=new SingleInheritance();
		 s.countryName();
		 
		  
		 
		 
	 }
 }