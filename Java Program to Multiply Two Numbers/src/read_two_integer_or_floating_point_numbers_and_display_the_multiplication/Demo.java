package read_two_integer_or_floating_point_numbers_and_display_the_multiplication;

import java.util.Scanner;
 

public class Demo {

	public static void main(String[] args) {
		
		/*This reads the input provided by the user
		 * using keyboard
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number: ");
		
		//This method reads the number provided using keyboard
		double num1 = scan.nextDouble();
		
		System.out.println("Enter second number: ");
		double num2 = scan.nextDouble();
		
		scan.close();
		
		double ans = num1*num2;
		
		System.out.print("Output = " + ans);
	}

}
