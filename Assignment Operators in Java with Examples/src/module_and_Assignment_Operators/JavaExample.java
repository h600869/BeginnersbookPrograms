package module_and_Assignment_Operators;

public class JavaExample {

	public static void main(String[] args) {
		//declaring integer variables
		int x=100, y =20;
		
		/*OKperator %= used here to divide the variable x by
		 * variable y and assign the remainder to x
		 * dividing 100 by 20 gives quotient value as 5 and
		 * remainder value as 0 as it is perfectly divisible
		 */
		 x %=y;
		 
		 System.out.println("Value of variable x: " + x);
		 System.out.println("Value of variable y: " + y);
	}

}
