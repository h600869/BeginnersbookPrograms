package javaExample;

import java.util.*;

public class SublistExample {

	public static void main(String[] args) {
		
		
		//	Step1: Create a Vector
		Vector <String> vector = new Vector<>();
		
		
		//	Step2: Add elements
		vector.add("Item1");
		vector.add("Item2");
		vector.add("Item3");
		vector.add("Item4");
		vector.add("Item5");
		vector.add("Item6");
		/* The method subList(int fromIndex, int toIndex)
		 * returns a List having element of Vector
		 * starting from index fromIndex
		 * to (toIndex - 1).
		 */
		List subList = vector.subList(2, 5);
		
		
		System.out.println("Sub list elements : ");
		for(int i=0; i<subList.size(); i++) {
			System.out.println(subList.get(i));
		}
	}

}
