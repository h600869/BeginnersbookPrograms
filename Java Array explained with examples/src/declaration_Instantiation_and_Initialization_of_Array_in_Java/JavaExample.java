package declaration_Instantiation_and_Initialization_of_Array_in_Java;

public class JavaExample {

	public static void main(String[] args) {
		//array declaration, instantiation and initialization
		int number[] = {11,22,33,44,55};
		
		//Print array elements
		//length property return the size of the array
		for(int i =0; i<number.length; i++)
			System.out.println("number[" +  i + " ]: " + number[i]);
	}

}
