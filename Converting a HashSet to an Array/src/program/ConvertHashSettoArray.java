package program;

import java.util.*;

public class ConvertHashSettoArray {

	public static void main(String[] args) {
		//	Create a HashSet
		HashSet<String> hset = new HashSet<>();
		
		
		//add elements to HashSet
		hset.add("Element1");
		hset.add("Element2");
		hset.add("Element3");
		hset.add("Element4");
		
		
		// Displaying HashSet elements
		System.out.println("HashSet contains: " + hset);
		
		
		//	Creating an Array
		String[] array = new String[hset.size()];
		hset.toArray(array);
		
		
		// Displaying Array elements
		System.out.println("Array elements: ");
		for(String s: array) 
		{
			System.out.println(s);
		}
	}

}
