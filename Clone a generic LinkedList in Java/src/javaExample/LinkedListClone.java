package javaExample;

import java.util.*;

public class LinkedListClone {

	public static void main(String[] args) {
		
		
		//	Create a LinkedList
		LinkedList<String> list = new LinkedList<>();
		
		
		//	Adding elements to the LinkedList
		list.add("Element1");
		list.add("Element2");
		list.add("Element3");
		list.add("Element4");
		
		
		//	Displaying LinkedList elements
		System.out.println("LinkedList elements: " + list);
		
		
		//	Creating another list
		LinkedList<String> list2 = new LinkedList<>();
		
		
		// Clone list to list2
		/* public Object clone(): Returns a shallow copy of this
		 * LinkedList. (The elements themselves are not cloned.)
		 */
		list2 = (LinkedList)list.clone();
		
		
		//	Displaying elements of second LinkedList
		System.out.println("List 2 Elements: " + list2);
	}

}
