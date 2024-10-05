package JavaPractice2;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		
		String str =sc.next();
		String orignalstr =str;
		String rev="";
		
		int len =str.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev =rev +str.charAt(i);
		}
		System.out.println(rev);
		
		if(orignalstr.equals(rev))
		{
			System.out.println("string is palindrome");
		}
		else
		{
			System.out.println("str is not palindrome");
		}
	}

}
