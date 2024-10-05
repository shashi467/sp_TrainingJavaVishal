package JavaPractice2;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="prisha";
	    String rev ="";
	    System.out.println("before reverse :"+str);
	    //logic 1
	    
//	    int len= str.length();
//	    
//	    for(int i =len-1;i>=0;i--)
//	    {
//	    	rev =rev+str.charAt(i);
//	    }
//	    System.out.println("reverse string is : "+rev);
	    
	    //logic 2 -using array
	    
	    char a[]=str.toCharArray();
	    int len =str.length();
	    
	    for(int i=len-1;i>=0;i--)
	    {
	    	rev =rev +a[i];
	    }
	    System.out.println("reverse string is :"+rev);
	}

}
