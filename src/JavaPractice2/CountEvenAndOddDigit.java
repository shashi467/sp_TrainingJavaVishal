package JavaPractice2;

import java.util.Scanner;

public class CountEvenAndOddDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no :");
		
		int num =sc.nextInt();
		int even_count=0;
		int odd_count=0;
		
		while(num>0)
		{
			int remainder = num%10;
			
			if(remainder%2==0)
			{
				even_count++;
			}
			else
			{
				odd_count++;
			}
			num = num/10;
		}
		System.out.println("even digit are :"+even_count);
		System.out.println("odd digit are :"+odd_count);

	}

}
