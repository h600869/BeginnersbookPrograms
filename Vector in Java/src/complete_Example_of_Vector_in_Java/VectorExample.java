package complete_Example_of_Vector_in_Java;

import java.util.*;

public class VectorExample {

	public static void main(String[] args) {
		//	Vector of initial capacity(size) of 2
		Vector<String> vec = new Vector<>(2);
		
		
		//	Adding elements to a vector
		vec.addElement("Apple");
		vec.addElement("Orange");
		vec.addElement("Mango");
		vec.addElement("Fig");
		
		
		//	Check size and capcaityIncrement
		System.out.println("Size is: " + vec.size());
		System.out.println("Default capacity increment is: " + vec.capacity());
		
		
		vec.addElement("fruit1");
		vec.addElement("fruit2");
		vec.addElement("fruit3");
		
		
		//size and capacityIncrement after three insertions
		System.out.println("Size after addition: " + vec.size());
		System.out.println("Capacity after increment is: " + vec.capacity());
		
		
		//Display Vector elements
		Enumeration en = vec.elements();
		System.out.println("\nElements are: ");
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement() + " ");
		}
	}
}
