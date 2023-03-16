package a_Simple_Example_of_HashSet_in_Java;

import java.util.*;

public class JavaExample {

	public static void main(String[] args) {
		//HashSet declaration
	  HashSet<String> hSet = new HashSet<>();
	  
	  
	  // Adding elements to the HashSet
	  hSet.add("Cricket");
	  hSet.add("Hockey");
	  hSet.add("Basketball");
	  
	  
	  System.out.println("HashSet Elements: ");
	  System.out.println();
	  // Iterating HashSet
	  for(String s: hSet) {
		  System.out.println(s);
	  }
	 }

}
