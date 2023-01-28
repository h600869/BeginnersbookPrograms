package arrayList_Example_in_Java;

import java.util.*;

public class JavaExample {

	public static void main(String[] args) {
		/* Creating ArrayList of type "String" which means
		 * we can only add "String" elements
		 */
		ArrayList<String>Obj = new ArrayList<String>();
		
		
		//This is how we add elements to an ArrayList
		Obj.add("Ajeet");
		Obj.add("Harry");
		Obj.add("Chaitanya");
		Obj.add("Steve");
		Obj.add("Anuj");
		
		
		// Displaying elements
		System.out.println("Original ArrayList: ");
		for(String str:Obj)
			System.out.println(str);
		
		
		/* Add element at the given index
		 * Obj.add(0, "Rahul") - Adding element "Rahul" at first position
		 * Obj.add(1, "Justin") - Adding element "Justin" at second position
		 */
		Obj.add(0, "Rahul");
		Obj.add(1, "Justin");
		
		
		// Displaying elements
		System.out.println("ArrayList after add operation: ");
		for(String str:Obj)
			System.out.println(str);
		
		
		//Remove elements from ArrayList like this
		Obj.remove("Chaitanya"); //Removes "Chaitanya" from ArrayList
		Obj.remove("Harry"); //Removes "Harry" from ArrayList
		
		
		// Displaying elements
		System.out.println("ArrayList after remove operation: ");
		for(String str: Obj)
			System.out.println(str);
		
		
		//Remove element from the specified index
		Obj.remove(1); //Removes Second element from the List
		
		
		//Displaying elements
		System.out.println("Final ArrayList: ");
		for(String str:Obj)
			System.out.println(str);
	}

}
