package javaExample;

import java.util.*;

public class VectorIteratorExample {

	public static void main(String[] args) {
		
		
		// Creating a Vector of Strings
		Vector<String> vector = new Vector<>();
		
		
		//Adding elements to the Vector
		vector.add("Mango");
		vector.add("Orange");
		vector.add("Apple");
		vector.add("Grapes");
		vector.add("Kiwi");
		
		
		//Obtaining an iterator
		Iterator it = vector.iterator();
		
		
		System.out.println("Vector elements are: ");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
