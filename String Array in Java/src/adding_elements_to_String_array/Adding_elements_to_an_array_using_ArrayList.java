package adding_elements_to_String_array;

import java.util.*;
public class Adding_elements_to_an_array_using_ArrayList {

	public static void main(String[] args) {
		//declared and initialized a string array
		String[] fruits = new String[] {"Apple", "Orange", "Banana"};
		
		
		//Convert the array "fruits" to an ArrayList
		ArrayList<String>fruitList=
				new ArrayList<String>(Arrays.asList(fruits));
		
		
		//Adding elements to ArrayList
		fruitList.add("Mango");
		fruitList.add("kiwi");
		
		
		//convert the ArrayList to array
		String[] newFruits = fruitList.toArray(new String[fruitList.size()]);
		
		
		//print new array
		for (String str: newFruits)
		{
			System.out.println(str);
		}
	
	}
}
