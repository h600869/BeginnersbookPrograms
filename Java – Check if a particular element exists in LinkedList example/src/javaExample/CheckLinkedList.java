package javaExample;

import java.util.*;

public class CheckLinkedList {

	public static void main(String[] args) {
		
		
		//	Creating LinkedList of String Elements
		LinkedList<String> linkedlist = new LinkedList<>();
		
		
		//	Populating it with String vlaues
		linkedlist.add("AA");
		linkedlist.add("BB");
		linkedlist.add("CC");
		linkedlist.add("DD");
		linkedlist.add("EE");
		
		
		//	Contains() method checks whether the element exists
		if(linkedlist.contains("CC")) {
			System.out.println("Element CC is present in List");
		} else {
			System.out.println("Element CC is not present in List");
		}
		
		
		//Checking for element FF
		if (linkedlist.contains("FF")) {
			System.out.println("Element FF is present in List");
		} else {
			System.out.println("Element FF isn't present in List");
		}
	}

}
