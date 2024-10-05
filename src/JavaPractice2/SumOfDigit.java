package JavaPractice2;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no :");
		
		int num =sc.nextInt();
		int sum =0;
		
		while(num>0)
		{
			sum =sum+num%10;    //% gives remainder
			num =num/10;
		}
		System.out.println("sum of the digit are :"+sum);
	}

}
