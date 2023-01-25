package string_array_ArrayIndexOutOfBoundsException;

public class JavaExample {

	public static void main(String[] args) {
		//declared and initialized a string array
		String[] fruits = new String[] {"Apple", "Orange", "Banana"};
		
		//We are trying to print 11th element of the array
		//but the array contains only 3 elements. This will
		//throw ArrayIndexOutOfBoundsException
		System.out.println(fruits[10]);
	}

}
