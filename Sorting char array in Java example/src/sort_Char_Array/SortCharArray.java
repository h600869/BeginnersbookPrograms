package sort_Char_Array;

import java.util.Arrays;

public class SortCharArray {

	public static void main(String[] args) {
		
		// Creating a char Array
		char[] charArray = new char[] {'A', 'Q', 'S', 'Z', 'P' };
		
		// Displaying Array before Sorting
		System.out.println("**Char Array Before Sorting**");
		for (char ch: charArray) {
			System.out.println(ch);
		}
		
		// Sorting the Array
		Arrays.sort(charArray);
		System.out.println("**Char Array After Sorting**");
		for (char ch: charArray) {
			System.out.println(ch);
		}
		
		// Another Char Array
		char[] charArray2 =
			new char[] {'D', 'F', 'V', 'J', 'U', 'M', 'C' };
		
		//Selective Sorting
		/* public static void sort(char[] a, int fromIndex,
		 * int toIndex): Sorts the specified range of the
		 * array into ascending order. The range to be sorted
		 * extends from the index fromIndex, inclusive, to the
		 * index toIndex, exclusive. If fromIndex == toIndex,
		 * the range to be sorted is empty.
		 */
		Arrays.sort(charArray2, 2, 5);
		
		// Displaying array after selective sorting
		System.out.println("**Selective Sorting**");
		for (char ch: charArray2) {
			System.out.println(ch);
		}
	}

}
