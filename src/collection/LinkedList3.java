package collection;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     LinkedList<String> cars = new LinkedList<String>();
		
        cars.add("BMW");
		cars.add("Ford");
		cars.add("Volvo");
		
		System.out.println("list is :"+cars);
		
		//push operation (used for stack -in stack while we add element used push operation)
		cars.push("new car");
		System.out.println("after push list is : "+cars); 
		
		//pop operation (used in stack for Access & remove the  1st element )
		System.out.println("pop operation : "+cars.pop());
		System.out.println("pop element is "+cars);
		
		//peek operation (used for Queue operation) 
		System.out.println("peek operation : "+cars.peek()); //it gives 1st element of the list
		System.out.println(cars);
		
		//Reading elements using loop
		for(int i=0;i<cars.size();i++)
		{
			System.out.println(cars.get(i));
		}
		
		//sort the linked list 
		System.out.println("before sorting : "+cars);
		Collections.sort(cars);
		System.out.println("After sort : "+cars);
		
		//sort in reverse order 
		Collections.sort(cars,Collections.reverseOrder());
		System.out.println("After sort in reverse order : " +cars);
		
	}

}
