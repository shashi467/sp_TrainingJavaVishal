package JavaPractice2;

class A
{
	int a;
	String c;
	void display()
	{
		System.out.println("Class A :" +a);
		System.out.println("Class A :" +c);
	}
}
class B extends A
{
	double b;
	void print()
	{
		System.out.println("Class b :" +b);
	}	
}
class C extends U //parent is from FirstProgram1
{
	
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B obj=new B();
		obj.a =110;
		obj.b =220.4444;
		obj.c= "hello";
		obj.display();
		obj.print();
		
		C obj2=new C();
		obj2.q=899;
		obj2.firsttime();
		
		
	}

}
