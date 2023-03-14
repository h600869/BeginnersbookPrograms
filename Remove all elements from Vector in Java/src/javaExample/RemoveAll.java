package javaExample;

import java.util.*;

public class RemoveAll {

	public static void main(String[] args) {
		
		
		// Creating a Vector of Strings
		Vector<String> vector = new Vector<String>();
		
		
		//Adding elements to the Vector
		vector.add("C++");
		vector.add("Java");
		vector.add("Cobol");
		vector.add("C");
		vector.add("Oracle");
		
		
		System.out.println("Current size of vector: " + vector.size());
		
		
		// Calling clear() method of Vector API
		vector.clear();
		
		
		System.out.println("Size of Vector after clear(): " + vector.size());
	}

}
