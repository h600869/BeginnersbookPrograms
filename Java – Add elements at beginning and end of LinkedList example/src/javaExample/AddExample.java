package javaExample;

import java.util.*;

public class AddExample {

	public static void main(String[] args) {
		//	Creating LinkeList of String Elements
		LinkedList<String> linkedlist = new LinkedList<>();
		
		
		//Populating it with String values
		linkedlist.add("AA");
		linkedlist.add("BB");
		linkedlist.add("CC");
		linkedlist.add("DD");
		linkedlist.add("EE");
		
		
		//Displaying LinkedList elements
		System.out.println(linkedlist);
		
		
		//Adding an element at the beginning
		linkedlist.addFirst("FIRST");
		
		//Displaying the List after addition
		System.out.println(linkedlist);
		
		
		//Adding an elements at the end of list
		linkedlist.addLast("LAST");
		
		
		//Displaying the final list
		System.out.println(linkedlist);
	}

}
