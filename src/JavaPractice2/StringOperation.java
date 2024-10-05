package JavaPractice2;

public class StringOperation {

	public static void main(String[] args) {
		
		String d ="Hello shashi";
		
		//charat method
		System.out.println(d.charAt(7));
		
		//total length of string 
		
		System.out.println(d.length());
		
		//all character to smaller case
		
       System.out.println(d.toLowerCase());
       
     //all character to upper case
       System.out.println(d.toUpperCase());
	
       //string replace
       
       //System.out.println(d.replace("shashi","java"));
       
       //index of method (to find the index of the string)
       
       //System.out.println(d.indexOf('e'));
       
       //substring 
       
       System.out.println(d.substring(3));
       
       //string is empty or not
       
       System.out.println(d.isEmpty());
       
	}

}
