package narrowing_Type_Casting;

public class JavaExample {

	public static void main(String[] args) {
		double d = 4.55d;
		float f = 1.25f;
		int i = (int)d; // Explicit casting: Double to int
		int i2= (int)f; // Explicit casting: float to int
		
		System.out.println("Double Value: " + d); // Prints 4.55
		System.out.println("Double to int: " + i); // prints 4
		System.out.println("Float Value: " + f); // Prints 1.25
		System.out.println("Float to int: " + i2); // Prints 1
		
	}

}
