package javaExample;

import java.util.*;

public class LinkedListAdd {

	public static void main(String[] args) {
		
		
		//	Create a LinkedList
		LinkedList<String> list = new LinkedList<>();
		
		
		//	Adding elements to the LinkedList
		list.add("Harry");
		list.add("Ajeet");
		list.add("Tom");
		list.add("Steve");
		
		//	Displaying LinkedList elements
		System.out.println("LinkedList elements: "+list);
		
		//	Adding another element
		list.add("Kate");
		
		//	Displaying LinkeedList elements after add(E e)
		System.out.println("LinkedList elements: "+list);
	}
}