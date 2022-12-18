package the_Remainder_Operator_with_Example;

public class JavaExample {

	public static void main(String[] args) {
		int x = 100, y = 20, mod;
		
		/*The modulus operator '%' returns the remainder after division
		 * in this case, the value 100 is perfectly divisible by value 20
		 * thus the modulus is 0 here as no remainder
		 */
		mod = x%y;
		System.out.println("Remainder value after dividing x by y: " + mod);
	}

}
