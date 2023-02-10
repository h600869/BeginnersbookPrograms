package javaExample;

import java.util.*;

public class ConvertExample {

	public static void main(String[] args) {
		
		
		//Creating and populating LinkedList
		LinkedList<String> linkedlist = new LinkedList<>();
		linkedlist.add("Harry");
		linkedlist.add("Maddy");
		linkedlist.add("Chetan");
		linkedlist.add("Chauhan");
		linkedlist.add("Singh");
		
		
		//Converting LinkedList to Array
		String[] array = linkedlist.toArray(new String[linkedlist.size()]);
		
		
		//Displaying Array content
		System.out.println("Array Elements:");
		for (String str: array) {
			System.out.println(str);
		}
	}

}
