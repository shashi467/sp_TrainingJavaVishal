package collection;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declare linkedlist (collection1)
		LinkedList<String> ll =new LinkedList<String>();
		//add element to the end of the linkedlist
		ll.add("Ravi"); //0 element
		ll.add("Shashi"); //1 element
		ll.add("Priya"); //2 element
		
		System.out.println("After adding element to linked list : "+ll);
		
		ll.add(1,"Kitaboo");
		System.out.println("After adding kitaboo to linked list : "+ll);
		
		//declare linkedlist (collection2)
		LinkedList<String> ll2 =new LinkedList<String>();
		//add element to the end of the linkedlist
		ll2.add("Ravina"); //0 element
		ll2.add("Shashina"); //1 element
		ll2.add("Priyana"); //2 element
		
		//add collection 2 ll2 to the end of collection1 ll
		ll.addAll(ll2);
		System.out.println("After adding collection2 to collection1 : "+ll);
		
		//remove methods 
		//ll.remove("Ravi");
		//System.out.println("After removing ravi to the collection : "+ll);
		
		//ll.remove(3); //3 is a index
		//System.out.println("After removing 3rd position from the collection : "+ll);
		
		//remove collection2 from collection 1
		ll.removeAll(ll2);
		System.out.println("After removing collection2 from collection1 : "+ll);
		
		//get & print element of the position(Access & Retrive)
		System.out.println("element of the 1st position : "+ll.get(1));
		
		//replace 1st position element by Hurix
		ll.set(1, "Hurix");
		System.out.println("replace 1st position element by Hurix : "+ll);
		
		//Contains method -check if element exist in the collection 
		System.out.println(ll.contains("Priya")); //it return boolean value -true/false
		
		//Remove all the element from the collection
		ll.clear();
		System.out.println("After removing the all the element from collection0 : "+ll);
	}

}
