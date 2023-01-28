package change_an_element_in_ArrayList;

import java.util.*;

public class JavaExample {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList <String>();
		names.add("Jim");
		names.add("Jack");
		names.add("Ajeet");
		names.add("Chaitanya");
		names.set(0, "Lucy");
		System.out.println(names);
		
	}

}
