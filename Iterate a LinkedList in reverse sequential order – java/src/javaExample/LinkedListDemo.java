package javaExample;

import java.util.*;

public class LinkedListDemo {

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
		
		
		/* Public Iterator<E> descendingIterator(): Returns an
		 * iterator over the elements in this list in reverse
		 * sequential order. The elements will be returned in
		 * order from last (tail) to first (head).
		 */
		Iterator it = list.descendingIterator();
		
		
		//	Displaying list in reverse order
		System.out.println("Elements in Reverse Order: ");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
