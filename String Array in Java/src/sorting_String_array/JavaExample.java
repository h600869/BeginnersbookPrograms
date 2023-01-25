package sorting_String_array;

import java.util.Arrays;
public class JavaExample {

	public static void main(String[] args) {
		String[] names = new String[] {"Chaitanya", "Steve", "Rob", "Ajeet"};
		
		//Print array before sorting
		System.out.println("Array before sorting: ");
		for (String str: names)
		{
			System.out.print(str+" ");
		}
		
		
		//Sorting array
		Arrays.sort(names);
		
		//new line
		System.out.println();
		
		
		//Print array after sorting
		System.out.println("Array after sorting: ");
		for (String str: names)
		{
			System.out.print(str + " ");
		}
	}
}
