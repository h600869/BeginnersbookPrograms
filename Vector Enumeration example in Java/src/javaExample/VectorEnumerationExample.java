package javaExample;

import java.util.*;

public class VectorEnumerationExample {

	public static void main(String[] args) {
		// Create a Vector
		Vector<String> vector = new Vector<>();
		
		
		// Add elements into Vector
		vector.add("Chaitanya");
		vector.add("Shubham");
		vector.add("Apoorv");
		vector.add("Jin");
		vector.add("Jacob");
		
		
		// Get Enumeration of Vector elements
		Enumeration en = vector.elements();
		
		
		/* Display Vector elements using hashMoreElements()
		 * and nextElement() methods.
		 */
		System.out.println("Vector elements are: ");
		while(en.hasMoreElements()) 
		{
			System.out.println(en.nextElement());
		}
	}

}
