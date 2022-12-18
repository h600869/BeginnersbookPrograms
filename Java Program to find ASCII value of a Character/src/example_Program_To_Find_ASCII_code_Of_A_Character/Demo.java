package example_Program_To_Find_ASCII_code_Of_A_Character;

public class Demo {

	public static void main(String[] args) {
		
		char ch = 'P';
		int asciiCode = ch;
		// type casting char as int
		int asciiValue = (int)ch;
		
		System.out.println("ASCII value of " +ch+" is: " + asciiCode);
		System.out.println("ASCII value of " +ch+" is: " + asciiValue);
	}

}
