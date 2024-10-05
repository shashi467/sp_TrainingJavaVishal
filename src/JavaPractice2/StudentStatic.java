package JavaPractice2;

public class StudentStatic {
	
	int rollno;
	String studentName;
	
	static String collegeName = "GHRCEM";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentStatic stu1 = new StudentStatic();
		
		stu1.studentName="suraj";
		stu1.rollno =101;
		System.out.println(stu1.studentName +','+stu1.rollno+','+stu1.collegeName);
		
        StudentStatic stu2 = new StudentStatic();
		
		stu2.studentName="Ana";
		stu2.rollno =102;
		System.out.println(stu2.studentName +','+stu2.rollno+','+stu2.collegeName);
		
	}

}
