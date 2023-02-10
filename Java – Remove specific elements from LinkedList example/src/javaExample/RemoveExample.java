package javaExample;

import java.util.*;

public class RemoveExample {

	public static void main(String[] args) {
		
		
		//	Creating a LinkedList
		LinkedList<String> linkedlist = new LinkedList<String>();
		
		
		//	Add elements to LinkedList
		linkedlist.add("Item1");
		linkedlist.add("Item2");
		linkedlist.add("Item3");
		linkedlist.add("Item4");
		linkedlist.add("Item5");
		
		
		//	Displaying Elements before remove
		System.out.println("Before Remove: ");
		for(String str: linkedlist) {
			System.out.println(str);
		}
		
		
		//	Remove "Item4" from the list
		linkedlist.remove("Item4");
		
		
		//	LinkedList elements after remove
		System.out.println("\nAfter Remove: ");
		for(String str2: linkedlist) {
			System.out.println(str2);
		}
	}

}
