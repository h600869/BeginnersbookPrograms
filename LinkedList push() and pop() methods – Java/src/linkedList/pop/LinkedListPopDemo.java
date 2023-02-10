package linkedList.pop;

import java.util.*;

public class LinkedListPopDemo {

	public static void main(String[] args) {
		
		
		//	Create a LinkedList of Strings
		LinkedList<String> list = new LinkedList<>();
		
		
		//	Add few Elements
		list.add("Jack");
		list.add("Robert");
		list.add("Chaitanya");
		list.add("Kate");
		
		
		//	Display LinkList elements
		System.out.println("LinkedList before: " + list);
		
		
		//	Pop Element from list and display it
		System.out.println("Element removed: " + list.pop());
		
		
		//	Display after pop operation
		System.out.println("LinkedList after: " +list);
	}

}
