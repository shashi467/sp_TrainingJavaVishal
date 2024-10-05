package JavaPractice2;

public class StudentStaticMethod {

	int roll;
	String Studentname;
	static String collegename ="columbas college";
	
	StudentStaticMethod(int rollno , String name)
	{
		roll =rollno;
		Studentname=name;
	}
	void display()
	{
		System.out.println(Studentname+ ','+roll+ ','+collegename);
	}
	static void changevalue()
	{
		collegename ="ghrcem";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentStaticMethod obj = new StudentStaticMethod(111,"radha");
		StudentStaticMethod obj1 = new StudentStaticMethod(112,"Gadha");
		
		obj.display();
		obj1.display();
		
		changevalue();
		System.out.println("After college name change");
		
		obj.display();
		obj1.display();

	}

}
