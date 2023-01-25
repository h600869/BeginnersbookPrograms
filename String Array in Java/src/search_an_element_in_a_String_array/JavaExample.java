package search_an_element_in_a_String_array;

public class JavaExample {

	public static void main(String[] args) {
		String[] names = new String[] {"Chaitanya", "Steve", "Rob", "Ajeet"};
		
		
		//This will represent the index of search element when it is found
		int index=0;
		
		//This will set to true, if element is found in array, else it
		//will remain false.
		boolean foundFlag = false;
		
		
		//This is the search element, we are searching for this element in array
		String searchItem="Rob";
		
		
		for (int i = 0; i < names.length; i++) {
			if(searchItem.equals(names[i])) {
			  //if element found, get index, set flag to true and break the loop
			  index = i;
			  foundFlag = true;
			  break;
			}
		}
		if(foundFlag)
			System.out.println("String "+searchItem +" is found at index: " + index);
		else
			System.out.println("String "+searchItem +" is not found");
	
	
	}
}
