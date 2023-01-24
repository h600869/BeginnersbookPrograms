package program_to_display_array_elements_on_even_positions;

public class JavaExample {
	public static void main(String[] args) {
		
		//Initializing the array
		int [] numbers = new int[] {5,12,16,3,9,7,1,100};
		
		System.out.println("Array Elements on even Positions: ");
		/* Note we are using i = i+2 as we are only traversing odd positions
		 * Important point here is that the array indices start with 0, which
		 * means the odd positions such as 1st,3rd and 5th positions are having
		 * indices 0, 2, 4 and so on. That's why numbers[0] prints 1st position
		 * element of the array
		 */
		for	(int i=1; i<numbers.length; i = i+2) {
			System.out.println(numbers[i]);
		}
	}

}
