package program_to_find_the_smallest_number_in_an_array;

public class JavaExample {
	public static void main(String[] args) {
		
		//Initializing an int array
		int [] arr = new int [] {3,8,1,12,7,99};
		//This element will store the smallest element of the array
		//Initializing with the first element of the array
		int smallestElement = arr[0];
		//Running the loop from first element till last element
		for (int i =0; i<arr.length; i++) {
			//Compare each elements of array with smallestElement
			//If an element is smaller, store the element into smallestElement
			if(arr[i]<smallestElement)
				smallestElement=arr[i];
		}
		System.out.println("Smallest element of given array: " + smallestElement);
	}

}
