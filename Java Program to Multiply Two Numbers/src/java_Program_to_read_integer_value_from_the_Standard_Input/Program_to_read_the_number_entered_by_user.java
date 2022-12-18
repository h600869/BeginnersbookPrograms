package java_Program_to_read_integer_value_from_the_Standard_Input;

import java.util.Scanner;
public class Program_to_read_the_number_entered_by_user {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number: ");
		
		int num = scan.nextInt();
		
		scan.close();
		
		System.out.println("The number entered by the user: " + num);
	}

}
