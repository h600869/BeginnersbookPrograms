package linkedList.pollFirst;

import java.util.LinkedList;

public class LinkedListPollFirstDemo {

	public static void main(String[] args) {
		
		
//		Create a LinkedList of Strings
			LinkedList<String> list = new LinkedList<>();
			
			
			//	Add few Elements
			list.add("Element1");
			list.add("Element2");
			list.add("Element3");
			list.add("Element4");
			
			
			//	Display LinkedList elements
			System.out.println("LinkedList before" + list);
			
			
			/* PollFirst(): Retrieves and removes the first element
			 * of this list, or returns null if this list is empty.
			 */
			System.out.println("Element removed: " + list.pollFirst());
			
			
			//Displaying list elements after poll() operation
			System.out.println("LinkedList after: " + list);
	}

}
