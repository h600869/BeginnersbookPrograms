package program_to_print_number_of_elements_in_an_array;

public class JavaExample {

	public static void main(String[] args) {
		//Initializing an int array
		int[] numbers = new int[] {2, 4, 6, 8, 10, 12};
		// We canuse length property of array to find the count of elements
		System.out.println("Number of elements in the given int array: " + numbers.length);
		
		//Initializing a String array
		String [] names = new String [] {"Rick", "Luna", "Steve", "John"};
		System.out.println("Number of elements in the given String array: " + names.length);
	}

}
