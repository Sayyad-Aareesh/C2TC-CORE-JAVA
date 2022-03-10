package MyPrograms;

public class For_Each_Loop_Demo {

	public static void main(String[] args) {
		String arr[]= {"Jan","Feb","Mar","Apr","May","Jun","jul","Aug","Sep","Oct","Nov","Dec"};
		System.out.println("Using For Loop");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println();
		System.out.println("Using For_Each Loop");
		for(String month:arr)
		{
			System.out.println(month);
		}

	}

}
