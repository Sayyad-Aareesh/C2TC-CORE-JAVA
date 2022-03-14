package MyPrograms;

public class String_Demo {

	public static void main(String[] args)
	{
		String name=new String("Aareesh");
		
		System.out.println("Name :"+name);
		
		System.out.println("Length :"+name.length());		//to Find Length of String.
		
		String subS=name.substring(1);		//It is use to print part of the string starting index at 1
		
		System.out.println(subS);
		
		String subS_SI_EI=name.substring(2,6);
	
		System.out.println(subS_SI_EI);		//it include start index and exclude end index.
		
		
		String s="    Hello     ";
		System.out.println(s);
		System.out.println(s.trim()); 		//Use to remove whiite spaces in given String
		
		System.out.println(s.replace('H', 'C').trim()); //Use to Replace the Character.	
		
		;
		
	}

}
