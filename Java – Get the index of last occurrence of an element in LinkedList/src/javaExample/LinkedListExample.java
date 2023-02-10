package javaExample;

import java.util.*;

public class LinkedListExample {

	public static void main(String[] args) {
		
		
		// Create a LinkedList
		LinkedList<String> list = new LinkedList<>();
		
		
		//	Add elements
		list.add("AA");
		list.add("BB");
		list.add("CC");
		list.add("AA");
		list.add("DD");
		list.add("AA");
		list.add("EE");
		
		
		//	Displaying LinkedList elements
		System.out.println("LinkedList elements: " + list);
		
		
		//	Get the index of last occurrence of element "AA"
		/* Public int lastIndexOf(Object o): Returns the index
		 * of the last occurrence of the specified element in 
		 * this list, or -1 if this list does not contain the 
		 * element 
		 */
		System.out.println("LastIndex of AA: " + list.lastIndexOf("AA"));
		
		
		// Get the index of last occurrence of element "ZZ"
		/* Note: The element ZZ does not exist in the list so
		 * the method lastIndexOf would return -1 for it.
		 */
		System.out.println("LastIndex of ZZ: " + list.lastIndexOf("ZZ"));
	}

}
