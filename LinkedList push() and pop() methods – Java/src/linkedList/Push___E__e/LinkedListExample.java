package linkedList.Push___E__e;

import java.util.*;

public class LinkedListExample {

	public static void main(String[] args) {
		
		
		//	Create a LinkedList of String
		LinkedList<String> list = new LinkedList<>();
		
		
		//	Add few Elements
		list.add("Jack");
		list.add("Robert");
		list.add("Chaitanya");
		list.add("Kate");
		
		
		//	Display LinkList elements
		System.out.println("LinkedList contains: " + list);
		
		
		// Push Element the list
		list.push("NEW ELEMENT");
		
		
		// Display after push operation
		System.out.println("LinkedList contains: "+list);
	}
}
