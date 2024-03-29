package java_example_of_removing_elements_from_the_LinkedList;

import java.util.*;

public class JavaExample {

	public static void main(String[] args) {
		
		
		LinkedList<String> list = new LinkedList<String>();
		
		
		//Adding elements to the Linked list
		list.add("Steve");
		list.add("Carl");
		list.add("Raj");
		list.add("Negan");
		list.add("Rick");
		
		
		//Removing First element
		//Same as list.remove(0);
		list.removeFirst();
		
		
		//Removing Last element
		list.removeLast();
		
		
		//Iterating LinkedList
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		
		
		//Removing 2nd element, index starts with 0
		list.remove(1);
		
		
		System.out.print("\nAfter removing second element: ");
		//Iterating LinkedList again
		Iterator<String> iterator2=list.iterator();
		while(iterator2.hasNext()) {
			System.out.print(iterator2.next() + " ");
		}
	}
}
