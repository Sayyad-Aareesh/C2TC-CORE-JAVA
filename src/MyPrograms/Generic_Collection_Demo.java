package MyPrograms;

import java.util.ArrayList;

public class Generic_Collection_Demo
{

	public static void main(String[] args)
	{
		
		ArrayList<String> arr_l=new ArrayList<String>();
		arr_l.add("Hello");
		arr_l.add("Friends");
		arr_l.add("How are you");
		
		
		System.out.println("This Is Generic Collectin Demo..... ");		
		
		System.out.println();
		System.out.println("Size Of ArrayList :"+arr_l.size());
		
		System.out.println();
		
		System.out.println("Print The Element of  Array List");
		System.out.println(arr_l);
	}

}
