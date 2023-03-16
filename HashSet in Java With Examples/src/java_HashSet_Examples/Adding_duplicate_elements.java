package java_HashSet_Examples;

import java.util.*;

public class Adding_duplicate_elements {

	public static void main(String[] args) {
		//HashSet declaration
		HashSet<String> hset = new HashSet<>();
		
		
		//	Adding elements to the HashSet
		hset.add("Apple");
	      hset.add("Mango");
	      hset.add("Grapes");
	      hset.add("Orange");
	      hset.add("Fig");
	      //Addition of duplicate elements
	      hset.add("Apple");
	      hset.add("Mango");
	      //Addition of null values
	      hset.add(null);
	      hset.add(null);

	      //Displaying HashSet elements
	      System.out.println(hset);
	}

}