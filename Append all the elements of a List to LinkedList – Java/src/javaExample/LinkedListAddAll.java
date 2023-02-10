package javaExample;

import java.util.*;

public class LinkedListAddAll {

	public static void main(String[] args) {
		
		
		//	Create a LinkedList
		LinkedList<String> list = new LinkedList<>();
		
		
		//	Add elements to the LinkedList
		list.add("AA");
		list.add("BB");
		list.add("CC");
		list.add("DD");
		
		
		//	Displaying LinkeList before add
		System.out.println("Before: LinkedList: " + list);
		
		
		//	Create a new list having few elements
		List<String> arrayList = new ArrayList<>();
		arrayList.add("Item1");
		arrayList.add("Item2");
		arrayList.add("Item3");
		
		
		//	Append the list elements to LinkedList
		list.addAll(arrayList);
		
		
		//	Displaying the LinkedList after addAll
		System.out.println("After: LinkedList: " + list);
	}

}
