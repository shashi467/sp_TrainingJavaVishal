package JavaPractice2;

public class StringOperation2 {

	public static void main(String[] args) {
		
		String str ="welcome";
		
		//substring 
		
		System.out.println(str.substring(3, 7));
		System.out.println(str.substring(0, 3));
		
		String a= "I love you";
		System.out.println(a.substring(2, 6));
		
		System.out.println(a.endsWith("you"));
		
		String s1 ="I love ";
		String s2 ="pune";
		System.out.println("is s1 equal to s2: "+s1.equals(s2));
		
		System.out.println(s1.concat(s2));
		
		
		

	}

}
