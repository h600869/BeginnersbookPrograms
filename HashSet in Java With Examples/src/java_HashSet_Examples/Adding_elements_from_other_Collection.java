package java_HashSet_Examples;

import java.util.*;

public class Adding_elements_from_other_Collection {

	public static void main(String[] args) {
		//ArrayList declaration and adding elements
		ArrayList<String> arrList = new ArrayList<>();
		arrList.add("AA");
		arrList.add("BB");
		arrList.add("CC");
		
		
		//Copying ArrayList elements to HashSet
		HashSet<String> hset = new HashSet(arrList);
		//Adding another element to HashSet after copy
		hset.add("DD");
		
		
		System.out.println("HashSet elements: ");
		Iterator<String> it = hset.iterator();
		while (it.hasNext()) 
		{
			System.out.println(it.next());
		}
	}

}
