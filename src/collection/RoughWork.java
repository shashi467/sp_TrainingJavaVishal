package collection;

import java.util.ArrayList;
import java.util.Collections;

public class RoughWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(50);
		al.add(20);
		al.add(300);
		al.add(70);
		
		System.out.println("Array list is"+al);
		
		//sorting 
		Collections.sort(al,Collections.reverseOrder());
		
		System.out.println("reverse order is : "+al);
		
		System.out.println("greatest no is : "+Collections.max(al));
		System.out.println("greatest no is : "+Collections.min(al));
		
		
		

	}

}
