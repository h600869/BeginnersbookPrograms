package java_Program_to_copy_all_elements_of_one_array_into_another_array;

public class JavaExample {
	public static void main(String[] args) {
		/*Steps to copy all elements from one array to another array
		 * 1. Initialize the first array
		 * 2. Create another array with the same size as of the first array
		 * 3. Run a loop from 0 till the length of first array
		 		*	Read the element of first array
		 		*	Copy the element to the second array
		 * 4. Repeat the step 3 until the complete array is traversed
		 * 5. Run a loop from 0 to the length of any array
		 		*	Read and print the elements of second array
		 * 6. Repeat the step 5 until the second array is completely traversed.
		 * 7. End of program.
		 */
		
		//Initializing an array
		int[] firstArray = new int[] {3,5,7,9,11};
		/* Creating another array secondArray with same size
		 * of first array using firstArray.length as it returns
		 * the size of array firstArray.
		 */
		int[] secondArray = new int[firstArray.length];
		
		//Displaying elements of first array
		System.out.println("Elements of First array: ");
		for	(int i = 0; i<firstArray.length; i++) {
			System.out.print(firstArray[i] + " ");
		}
		
		//Copying all elements of firstArray to secondArray
		for (int i = 0; i<firstArray.length; i++) {
			secondArray[i] = firstArray [i];
		}
		
		//Displaying elements of secondArray
		System.out.println();
		System.out.println("Elements of Copied array: ");
		for(int i =0; i<secondArray.length;i++) {
			System.out.print(secondArray[i] + " ");
		}
	}

}
