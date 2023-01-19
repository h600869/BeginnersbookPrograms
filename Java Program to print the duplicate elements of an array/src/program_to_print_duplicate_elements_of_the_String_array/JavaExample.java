package program_to_print_duplicate_elements_of_the_String_array;

public class JavaExample {
	public static void main(String[] args) {
		//Initializing a String array
		String [] names = new String[] {"Tom","Steve","Rick","Steve","Rick"};
		System.out.println("Duplicate elements in the given array: ");
		//Comparing each element of the array with all other elements
		for(int i =0; i<names.length; i++) {
			for(int j = i+1; j<names.length;j++) {
				if(names[i].equals(names[j])) {
					//Printing duplicate elements
					System.out.println(names[j]);
				}
			}
		}
	}

}
