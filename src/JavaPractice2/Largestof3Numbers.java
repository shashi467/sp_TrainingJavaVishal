package JavaPractice2;

import java.util.Scanner;

public class Largestof3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st no");
		int a =sc.nextInt();
		
		System.out.println("Enter 2nd no");
		int b =sc.nextInt();
		
		System.out.println("Enter 3rd no.");
		int c =sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println(a+ "is the largest no.");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+ "is the largest no.");
		}
		else
		{
			System.out.println(c+"is the largest no.");
		}
	}

}
