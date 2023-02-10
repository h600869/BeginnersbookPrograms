package javaExample;

import java.util.*;

public class RemoveExample {

	public static void main(String[] args) {
		
		
		//	Create a LinkedList
		LinkedList<String> linkedlist = new LinkedList<>();
		
		
		//	Add elements to LinkedList
		linkedlist.add("Item1");
		linkedlist.add("Item2");
		linkedlist.add("Item3");
		linkedlist.add("Item4");
		linkedlist.add("Item5");
		
		
		//	Displaying Elements before remove
		System.out.println("LinkedList Elements are: ");
		for(String str: linkedlist) {
			System.out.println(str);
		}
		
		
		//	Remove First element
		Object firstElement = linkedlist.removeFirst();
		System.out.println("\nElement removed: " + firstElement);
		
		//	Remove Last element
		Object lastElement = linkedlist.removeLast();
		System.out.println("Element removed: " + lastElement);
		
		
		//	LinkedList elements after remove
		System.out.println("\nList Elements after Remove:");
		for(String str2: linkedlist) {
			System.out.println(str2);
		}
	}

}
