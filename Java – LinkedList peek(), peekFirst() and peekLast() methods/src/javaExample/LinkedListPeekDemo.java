package javaExample;

import java.util.*;

public class LinkedListPeekDemo {

	public static void main(String[] args) {
		
		
		//	Create a LinkedList of Strings
		LinkedList<String> list = new LinkedList<>();
		
		
		//	Add few Elements
		list.add("ELEMENT1");
		list.add("ELEMENT2");
		list.add("ELEMENT3");
		list.add("ELEMENT4");
		
		
		// Display LinkList elements
		System.out.println("LinkedList before: "+list);
		
		
		//peek()
		System.out.println(list.peek());
		
		
		//peekFirst()
		System.out.println(list.peekFirst());
		
		
		//peekLast()
		System.out.println(list.peekLast());
		
		
		// Should be same as peek methods does not remove
		System.out.println("LinkedList after: "+list);
	}
}