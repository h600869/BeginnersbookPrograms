package java_HashSet_Examples;

import java.util.*;

public class Removing_elements {

	public static void main(String[] args) {
		//	HashSet declaration
		HashSet<String> hset = new HashSet<>();
		
		
		//	Adding elements to the HashSet
		hset.add("AA");
		hset.add("BB");
		hset.add("CC");
		hset.add("DD");
		hset.add("EE");
		
		
		//Removing elements
		hset.remove("EE");
		hset.remove("CC");
		
		
		System.out.println("HashSet Elements: ");
		// Iterating HashSet
		for(String s: hset) {
			System.out.println(s);
		}
	}

}
