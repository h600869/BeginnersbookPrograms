package simple_String_Array_Example_in_Java;

public class JavaExample {
	
	public static void main(String[] args) {
	  //declared and initialized a string array
	   String[] fruits = new String[] {"Apple", "Orange", "Banana"};
	   
	   for (int i =0; i<fruits.length; i++)
	   {
		   System.out.println("Fruits[" + i + "]: " + fruits[i]);
	   }
	}
}
