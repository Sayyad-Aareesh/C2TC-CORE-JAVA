package MyPrograms;

import java.util.Arrays;
import java.util.List;

public class WildCard_And_Bounded_Type_Demo 
{
	static double sum(List < ? extends Number>List)
	{
		
		double sum=0.0;
		for(Number i:List)
		{
			sum+=i.intValue();
		}
		return sum;
		
	}
	
	
	public static void main(String args[])
	{
		
		System.out.println("...Program For Wild-Card Entry And Bounded Type...");
		System.out.println();
		
		List<Integer> i_list=Arrays.asList(12,32,45,56,76,87);
		System.out.println("Integer List :"+i_list);

		List<Double> d_list=Arrays.asList(11.34,34.56,78.89);
		System.out.println("Doube List :"+d_list);

	}
}
