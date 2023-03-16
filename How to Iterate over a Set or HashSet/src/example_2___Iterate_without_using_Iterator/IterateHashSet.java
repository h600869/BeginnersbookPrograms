package example_2___Iterate_without_using_Iterator;

import java.util.*;

public class IterateHashSet {

	public static void main(String[] args) {
		// Creat4e a HashSet
		Set<String> hset = new HashSet<String>();
		
		
		//add elements to HashSet
		hset.add("Chaitanya");
		hset.add("Rahul");
		hset.add("Tim");
		hset.add("Rick");
		hset.add("Harry");
		
		
		for(String temp : hset) {
			System.out.println(temp);
		}
	}

}
