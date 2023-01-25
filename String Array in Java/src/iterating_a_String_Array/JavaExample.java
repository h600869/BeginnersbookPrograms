package iterating_a_String_Array;

public class JavaExample {

	public static void main(String[] args) {
		//Declared and initialized a string array
		String[] fruits = new String[] {"Apple", "Orange", "Banana"};
		
		//Iterating using normal for loop
		System.out.println("Iterating using for loop:");
		for (int i=0; i<fruits.length; i++)
		{
			System.out.println("fruits[" +i+"]: " + fruits[i]);
		}
		
		//iterating using for-each loop
		System.out.print("Iterating using foreach loop: ");
		for (String str: fruits)
		{
			System.out.print(str+ " ");
		}
	}

}
