package example_1___Using_Iterator;

import java.util.*;

public class IterateHashSet {

	public static void main(String[] args) {
		//	Create a HashSet
		HashSet<String> hset = new HashSet<String>();
		
		
		//Add elements to HashSet
		hset.add("Chaitanya");
		hset.add("Rahul");
		hset.add("Tim");
		hset.add("Rick");
		hset.add("Harry");
		
		
		Iterator<String> it = hset.iterator();
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}
	}

}
