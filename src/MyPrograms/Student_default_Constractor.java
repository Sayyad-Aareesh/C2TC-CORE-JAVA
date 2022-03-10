package MyPrograms;

public class Student_default_Constractor {

	int rollNo;
	float percent;
	String name;
	public static void main(String[] args) {
		
		System.out.println("Default Constractor Progam");
		
		System.out.println();
		
		Student_default_Constractor s1=new Student_default_Constractor();
		System.out.println("Student 1 Details");
		System.out.println("Roll No :"+s1.rollNo);
		System.out.println("Percentage :"+s1.percent);
		System.out.println("Name :"+s1.name);
		
		Student_default_Constractor s2=new Student_default_Constractor();
		System.out.println("Student 1 Details");
		System.out.println("Roll No :"+s2.rollNo);
		System.out.println("Percentage :"+s2.percent);
		System.out.println("Name :"+s2.name);


	}

}
