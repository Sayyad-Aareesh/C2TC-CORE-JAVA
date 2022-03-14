package MyPrograms;

public class Array_Demo_Garbege_Value {

	public static void main(String[] args) 
	{
	 int[][] a=new int[2][3];
	 
	 System.out.println(a.length);		//Use to Find the length of array.only give base array length
	 
	 
	 System.out.println(a);  //o/p:Show Garbeg value of 2D array
	 
	 System.out.println(a[0]);		//o/p:Show Garbeg value of reference of  2D array
	 
	 System.out.println(a[0][1]);	//o/p:default value of integer =0
	 
	 System.out.println(a[1][1]);	//o/p:default value of integer =0
	 
	 System.out.println(a[1][2]);	//o/p:default value of integer =0
	
	}

}
