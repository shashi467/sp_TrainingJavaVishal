package JavaPractice2;

import java.util.Scanner;

public class FactorialNumber13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no.:");
		int num =sc.nextInt();
		long factorial=1;
		
		for(int i=1;i<=num;i++)
		{
			factorial=factorial*i;
		}
		System.out.println("Factorial is : " +factorial);
	}

}
