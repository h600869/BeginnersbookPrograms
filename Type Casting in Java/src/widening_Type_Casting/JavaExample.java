package widening_Type_Casting;

public class JavaExample {

	public static void main(String[] args) {
		int i = 1001;
	    float f = 105.00f;
	    long l = i; // Implicit casting: int to long
	    double d = f; // Implicit casting: float to double

	    System.out.println("int Value: "+i); // Prints 1001
	    System.out.println("int to long: "+l); // Prints 1001
	    System.out.println("float value: "+f); // Prints 105.0
	    System.out.println("float to double: "+d); // Prints 105.0
	}

}
