package java_Linked__List_example_of_adding_elements;

import java.util.*;

public class JavaExample 
{
	/* In the following example we are using add(), addFirst() and addLast() methods to add the elements at 
	 * the desired locations in the LinkedList,
	 * There are several such useful methods in the LinkedList class.
	 */
	public static void main(String[] args) 
	{
		// Syntax for a LinkedList of type String and name "list".
		LinkedList<String> list = new LinkedList<String>();
		
		
		//Adding elements to the Linked list
		list.add("Steve");
		list.add("Carl");
		list.add("Raj");
		
		
		//Adding an element to the first position
		list.addFirst("Negan");
		
		
		//Adding an element to the last position
		list.addLast("Rick");
		
		
		//Adding an element to the 3rd position
		list.add(2, "Glenn");
		
		
		//Iterating LinkedList
		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
