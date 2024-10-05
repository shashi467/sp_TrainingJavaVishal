package JavaPractice2;

import java.util.Scanner;

public class PrimeNumberorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
	    System.out.println("Enter the no ");
	
	    int num =sc.nextInt();
		
		int count =0;
		
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				count++;
			}
			if(count==2)
			{
				System.out.println("No is prime no");
			}
			else
			{
				System.out.println("no is not prime");
			}
		}
		else
		{
			System.out.println("put the valid no");
		}
		
		}
		
	}


