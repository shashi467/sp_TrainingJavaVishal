package JavaPractice2;

public class Swap2Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =10 , b =200;
		
		System.out.println("Before swpaing a & b is " +a+ " " +b);
		//Logic 1
//		int c ;
//		 c=a;
//		 a=b;
//		 b=c;
		 
		 //Logic 2
//		a=a+b;
//		b=a-b;
//		a=a-b;
		
		//Logic 3
		
		b=a*b;
		a=b/a;
		b=b/a;
		
		
		 
		 System.out.println("After swpaing a & b is " +a+ " " +b);
		 

	}

}
