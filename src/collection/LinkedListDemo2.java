package collection;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create linked list for string 
		LinkedList<String> cars = new LinkedList<String>();
		
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Volvo");
		
		System.out.println("Before add first method : " +cars);
		
		cars.addFirst("Audi"); //add first method
		System.out.println("After add first method : " +cars);
		
		cars.addLast("xingSantro");//add last method
		System.out.println("After add last method : " +cars);
		
		cars.removeFirst(); //remove the first element of the list
		System.out.println("After remove 1st element of the list : " +cars);
		
		cars.removeLast();//remove the last element of the list
		System.out.println("After remove last element of the list : " +cars);
		
		
		System.out.println("1st element of the list : " +cars.getFirst());
		System.out.println("last element of the list : " +cars.getLast());
		
	}

}
