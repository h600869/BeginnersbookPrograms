package example_1__Program_to_remove_duplicate_elements_from_a_sorted_array;

public class JavaExample {

	public static int removeDuplicates(int arr[], int count) {
		if (count==0 || count ==1) {
			return count;
		}
		//	Creating a temporary array to hold non-duplicate elements
		int[] temp = new int[count];
		int j = 0;
		for (int i =0; i <count-1;i++) {
			if (arr[i] != arr[i+1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[count-1];
		//	Copying the temp array to the original array
		for (int i =0; i<j; i++) {
			arr[i]=temp[i];
		}
		return j;
	}
	
	public static void main(String[] args) {
	int arr[] = {1,2,2,3,4,5,5,5};
	System.out.print("Original Array: ");
	int length = arr.length;
	for (int i =0; i<length; i++)
		System.out.print(arr[i]+" ");
	
	//Getting the new array size after removing duplicates
	length = removeDuplicates(arr, length);
	
	//for new line
	System.out.println("");
	
	//Displaying array with non-duplicate elements
	System.out.print("Array after removing duplicate elements: ");
	for(int i =0; i<length; i++)
		System.out.print(arr[i]+" ");
		
	}

}
