package linkedList.poll;

import java.util.*;

public class LinkedListPollMethod {

	public static void main(String[] args) {
		
		
		//	Create a LinkedList of Strings
		LinkedList<String> list = new LinkedList<>();
		
		
		//	Add few Elements
		list.add("Element1");
		list.add("Element2");
		list.add("Element3");
		list.add("Element4");
		
		
		//	Display LinkedList elements
		System.out.println("LinkedList before" + list);
		
		
		/* Poll(): Retrieves and removes the head (first element)
		 * of this list
		 */
		System.out.println("Element removed: " + list.poll());
		
		
		//Displaying list elements after poll() operation
		System.out.println("LinkedList after: " + list);
	}
}
