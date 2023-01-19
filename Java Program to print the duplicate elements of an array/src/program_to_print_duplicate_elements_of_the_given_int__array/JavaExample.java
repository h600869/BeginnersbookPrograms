package program_to_print_duplicate_elements_of_the_given_int__array;

public class JavaExample {
	public static void main(String[] args) {
		//Initializing an int array
		int[]numbers = new int[] {2,4,6,8,4,6,10,10};
		System.out.println("Duplicate elements in given array are: ");
		//Comparing each element of the array with all other elements
		for(int i =0; i< numbers.length; i++) {
			for(int j = i+1; j<numbers.length;j++) {
				if(numbers[i] == numbers[j]) {
					//Printing duplicate elements
					System.out.println(numbers[j]);
				}
			}
		}
	}

}
