package JavaPractice2;

import java.util.Scanner;

public class CoutNumberofDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num =sc.nextInt();
		int count=0;
		
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println("No of Digit is: " +count);
		
	}

}
