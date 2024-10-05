package JavaPractice2;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num = sc.nextInt();
		int orginalno=num;
		int rev=0;
		
		while(num!=0)
		{
			rev =rev*10 +num%10;
			num =num/10;
		}
		System.out.println("Reverse no is :" +rev);
		
		if(orginalno==rev)
		{
			System.out.println(rev+ "Number is palindrome");
		}
		else
		{
			System.out.println("no is not palindrome");
		}

	}

}
