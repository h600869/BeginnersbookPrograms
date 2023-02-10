package javaExample;

import java.util.*;

public class GetFirstAndLast {

	public static void main(String[] args) {
		
		
		//	Create a LinkedList
		LinkedList<String> linkedlist = new LinkedList<>();
		
		
		//	Add elements to LinkedList
		linkedlist.add("Item1");
		linkedlist.add("Item2");
		linkedlist.add("Item3");
		linkedlist.add("Item4");
		linkedlist.add("Item5");
		linkedlist.add("Item6");
		
		
		//	Getting First element of the list
		Object firstElement = linkedlist.getFirst();
		System.out.println("First Element is: " + firstElement);
		
		
		//	Getting Last element of the List
		Object lastElement = linkedlist.getLast();
		System.out.println("Last Element is: " + lastElement);
	}
}
