package linkedList.pollLast;

import java.util.LinkedList;

public class LinkedListPollLastDemo {

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
			
			
			/* PollLast(): Retrieves and removes the last element
			 * of this list, or returns null if this list is empty
			 */
			System.out.println("Element removed: " + list.pollLast());
			
			
			//Displaying list elements after poll() operation
			System.out.println("LinkedList after: " + list);
	}

}
