package MyPrograms;

import java.util.ArrayList;

public class Non_Generic_Collection_Demo {

	public static void main(String[] args)
	{
		ArrayList arr_l=new ArrayList();
		
		arr_l.add(1);			//add Integer value
		arr_l.add(90.89);		//add Float Value
		arr_l.add(true);		//add Boolean value
		arr_l.add(2,"Hello");	//add String Hello On index 2
		
		System.out.println("This is Non-Generic Collection Demo Program");
		System.out.println("Retriew elements From Array List");
		System.out.println();
		
		System.out.println(arr_l);
		
		
		arr_l.remove(true);		//remove Boolean data in the list
		
		System.out.println();
		
		System.out.println("After Removing Boolean Data type ");
	
		System.out.println(arr_l);
	}

}
