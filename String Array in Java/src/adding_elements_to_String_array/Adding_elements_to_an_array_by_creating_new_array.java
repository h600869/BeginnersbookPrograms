package adding_elements_to_String_array;

public class Adding_elements_to_an_array_by_creating_new_array {

	public static void main(String[] args) {
	  //declared and initialized a string array
	  String[] fruits = new String[] {"Apple", "Orange", "Banana"};
	  
	  
	  //We want to add two more elements to the fruits array so let's
	  //create a new array with the size of 5
	  String[] newFruits = new String [fruits.length+2];
	  
	  
	  
	  //Copying elements from old array to new array
	  for (int i=0; i<fruits.length; i++)
	  {
		  newFruits[i] = fruits[i];
	  }
	  
	  //Adding new elements
	  newFruits[newFruits.length-2] = "Mango"; //Second last element
	  newFruits[newFruits.length-1] = "Kiwi"; //last element
	  
	  //Print new array
	  for (String str: newFruits)
	  {
		  System.out.println(str);
	  }
	}

}
