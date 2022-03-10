package MyPrograms;

public class Student_Parameterized_Constractor {

	int rollNo;
	double percent;
	String name;
	
	public Student_Parameterized_Constractor(int rollNo, double percent, String name) {
		//super();
		this.rollNo = rollNo;
		this.percent = percent;
		this.name = name;
	}


	
	
	public static void main(String[] args) {
		
		System.out.println("Parameterized Constractor Program");
		
		Student_Parameterized_Constractor s1=new Student_Parameterized_Constractor(21,89.90,"Ajay");
		
		System.out.println("Student 1 Details");
		System.out.println("Roll No :"+s1.rollNo);
		System.out.println("Percentage :"+s1.percent);
		System.out.println("Name :"+s1.name);
		
		System.out.println();
		
		Student_Parameterized_Constractor s2=new Student_Parameterized_Constractor(22,98.90,"Rahul");
		
		System.out.println("Student 2 Details");
		System.out.println("Roll No :"+s2.rollNo);
		System.out.println("Percentage :"+s2.percent);
		System.out.println("Name :"+s2.name);
		

	}

}
